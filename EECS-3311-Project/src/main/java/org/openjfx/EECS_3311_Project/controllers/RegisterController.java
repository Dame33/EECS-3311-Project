package org.openjfx.EECS_3311_Project.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.managers.SceneManager;
import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.skin.ComboBoxListViewSkin;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert; // <-- IMPORT THIS

public class RegisterController implements Initializable {

    Mediator mediator = Mediator.getInstance();

    @FXML private ComboBox<AccountRole> comboBox;
    @FXML private AnchorPane anchorPane_registerPage;

    @FXML private TextField tf_FirstName;
    @FXML private TextField tf_LastName;
    @FXML private TextField tf_email;
    @FXML private PasswordField pf_password;
    @FXML private PasswordField pf_confirmPassword;
    @FXML private Button button_Register;
    @FXML private Button button_Back;
    
    private static final List<String> UNIVERSITY_DOMAINS = List.of(
    	    "@yorku.ca",
    	    "@my.yorku.ca"
    	);

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        anchorPane_registerPage.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                newScene.widthProperty().addListener((observable, oldWidth, newWidth) -> {
                    double width = newWidth.doubleValue();
                    if (width > 1200) {
                        anchorPane_registerPage.setScaleX(1.25);
                        anchorPane_registerPage.setScaleY(1.25);
                    } else {
                        anchorPane_registerPage.setScaleX(1.0);
                        anchorPane_registerPage.setScaleY(1.0);
                    }
                });
            }
        });

        comboBox.setOnShowing(event -> {
            ComboBoxListViewSkin<?> skin = (ComboBoxListViewSkin<?>) comboBox.getSkin();
            if (skin != null) {
                Node popupContent = skin.getPopupContent();
                double currentScale = anchorPane_registerPage.getScaleX();
                double newFontSize = 12 * currentScale;
                popupContent.setStyle("-fx-font-size: " + newFontSize + "px;");
            }
        });

        // get list of account types
        ArrayList<AccountRole> accountRoles = mediator.getAccountRoles();
        comboBox.getItems().addAll(accountRoles);

        button_Register.setOnAction(event -> registerUser(event));
        button_Back.setOnAction(event -> SceneManager.changeScene(event, "SignIn.fxml", "Sign In"));
    }

    public void registerUser(ActionEvent event) {

        String firstName = tf_FirstName.getText();
        String lastName = tf_LastName.getText();
        String email = tf_email.getText();
        String password = pf_password.getText();
        String confirmPassword = pf_confirmPassword.getText();
        AccountRole role = comboBox.getValue();

        boolean emailInUse = mediator.isEmailTaken(email);

        if (firstName.isBlank() || lastName.isBlank() || email.isBlank() ||
                password.isBlank() || confirmPassword.isBlank() || role == null) {
            showError("All fields are mandatory", 
                      "Please ensure all fields are filled in.");
            return;
        }

        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            showError("Invalid Email", "Please enter a valid email address.");
            return;
        }

        if (!isUniversityEmail(email)) {
            showError("University Email Required","Please register using a valid university email address.");
            return;
        }

        if (emailInUse) {
            showError("Email Already Registered", "Please use a different email or sign in.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            showError("Passwords Do Not Match", "Both password fields must match.");
            return;
        }

        boolean strongPassword = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$");
        if (!strongPassword) {
            showError("Weak Password",
                      "Password must contain:\n" +
                      "• At least 8 characters\n" +
                      "• Uppercase letter\n" +
                      "• Lowercase letter\n" +
                      "• Number\n" +
                      "• Symbol");
            return;
        }

        User user = mediator.createAccount(
                password,
                email,
                role,
                firstName,
                lastName,
                "User"
        );

        if (user != null) {
            Session.setUser(user);
            SceneManager.changeScene(event, "HomePage.fxml", "Home");
        } else {
            showError("Registration Failed",
                      "An unexpected error occurred. Try again.");
        }
    }
    
    private boolean isUniversityEmail(String email) {
        return UNIVERSITY_DOMAINS.stream().anyMatch(email::endsWith);
    }
    
	    private void showError(String header, String message) {
	        Alert alert = new Alert(Alert.AlertType.ERROR);
	        alert.setTitle("Registration Error");
	        alert.setHeaderText(header);
	        alert.setContentText(message);
	        alert.showAndWait();
	    }

}
