package org.openjfx.EECS_3311_Project.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.SceneManager;
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

    @FXML private ComboBox<String> comboBox;
    @FXML private AnchorPane anchorPane_registerPage;

    @FXML private TextField tf_FirstName;
    @FXML private TextField tf_LastName;
    @FXML private TextField tf_email;
    @FXML private PasswordField pf_password;
    @FXML private PasswordField pf_confirmPassword;
    @FXML private Button button_Register;

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

        comboBox.getItems().addAll("Student", "Faculty", "Staff", "Partner");

        button_Register.setOnAction(event -> registerUser(event));
    }

    public void registerUser(ActionEvent event) {

        String password = pf_password.getText();
        String confirmPassword = pf_confirmPassword.getText();
        boolean emailInUse = mediator.isEmailTaken(tf_email.getText()); // make sure icsv is defined somewhere

        if (tf_FirstName.getText().isBlank() || tf_LastName.getText().isBlank() ||
                tf_email.getText().isBlank() || password.isBlank() || confirmPassword.isBlank() ||
                comboBox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Registration Error");
            alert.setHeaderText("All fields are mandatory");
            alert.setContentText("Please ensure all fields are filled in");
            alert.showAndWait();

        } else if (emailInUse) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Registration Error");
            alert.setHeaderText("Email is already in use");
            alert.setContentText("Please register using a new email or sign in instead");
            alert.showAndWait();

        } else if (!password.equals(confirmPassword)) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Registration Error");
            alert.setHeaderText("Passwords do not match");
            alert.setContentText("Passwords must match");
            alert.showAndWait();

        } else {

            System.out.println("Registering User");

            User user = mediator.createAccount(
                    password,
                    tf_email.getText(),
                    new AccountRole(comboBox.getValue(), "0", 0.0), // temp value
                    tf_FirstName.getText(),
                    tf_LastName.getText(),
                    "User"
            );

            if (user != null) {
                SceneManager.changeScene(event, "HomePage.fxml", "Home", user.getEmail(), user.getAccountRole().getRoleName());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid credentials entered.");
                alert.show();
            }
        }
    }
}
