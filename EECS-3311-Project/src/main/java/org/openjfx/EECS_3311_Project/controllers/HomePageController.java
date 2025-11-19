package org.openjfx.EECS_3311_Project.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.EECS_3311_Project.SceneManager;

public class HomePageController implements Initializable {

    //injecting the elements
    @FXML
    private AnchorPane anchorPane_homePage;
    @FXML
    private Button button_Logout;
    @FXML
    private Text text_email;
    @FXML
    private Text text_accountType;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //fixing fullscreen scaling issues
        anchorPane_homePage.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {

                newScene.widthProperty().addListener((observable, oldWidth, newWidth) -> {
                    double width = newWidth.doubleValue();

                    // if the width of the window is greater than 1200px, zoom by 25%
                    if (width > 1200) {
                        anchorPane_homePage.setScaleX(1.25); // 125% size
                        anchorPane_homePage.setScaleY(1.25);
                    } else {
                        // Otherwise, go back to normal size
                        anchorPane_homePage.setScaleX(1.0);
                        anchorPane_homePage.setScaleY(1.0);
                    }
                });
            }
        });

        //actions for each of the menu buttons
        //to implement: bookings, cecTools, Admin tools

        //logout button listener to change to "login" scene
        button_Logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                SceneManager.changeScene(event, "SignIn.fxml", "Sign In", null, null);

            }
        });


    }

    //function to set user information
    public void setUserInfo(String email, String accountType)
    {
        text_email.setText("Email: " + email);
        text_accountType.setText("Account Type: " + accountType);

    }
}
