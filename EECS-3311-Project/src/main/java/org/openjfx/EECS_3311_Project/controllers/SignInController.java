package org.openjfx.EECS_3311_Project.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.SceneManager;
import org.openjfx.EECS_3311_Project.model.User;



public class SignInController implements Initializable {

    private final String userDB_CSV = "UserDB.csv";
    private final String bookingDB = "BookingDB.csv";
    Mediator mediator = Mediator.getInstance();


    @FXML
    private AnchorPane anchorPane_SignInPage;
    @FXML
    private Button button_signIn;
    @FXML
    private Button button_signUp;

    @FXML
    private TextField tf_email;
    @FXML
    private PasswordField tf_password;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //fixing fullscreen scaling issues
        anchorPane_SignInPage.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {

                newScene.widthProperty().addListener((observable, oldWidth, newWidth) -> {
                    double width = newWidth.doubleValue();

                    // if the width of the window is greater than 1200px, zoom by 25%
                    if (width > 1200) {
                        anchorPane_SignInPage.setScaleX(1.25); // 125% size
                        anchorPane_SignInPage.setScaleY(1.25);
                    } else {
                        // Otherwise, go back to normal size
                        anchorPane_SignInPage.setScaleX(1.0);
                        anchorPane_SignInPage.setScaleY(1.0);
                    }
                });
            }
        });

        //working with the signIn button action
        button_signIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                User user  = mediator.signIn(tf_email.getText(), tf_password.getText());
                
                if (user != null) {
                    SceneManager.changeScene(event, "HomePage.fxml", "Home", user.getEmail(), user.getAccountRole().getRoleName());
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Invalid credentials entered.");
                    alert.show();
                }
                
            }
        });

        //working with the signUp button action
        button_signUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            	SceneManager.changeScene(event, "Register.fxml", "Register", null, null);
            }
        });


    }
}
