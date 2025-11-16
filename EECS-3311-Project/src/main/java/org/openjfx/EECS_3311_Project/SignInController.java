package org.openjfx.EECS_3311_Project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable {

    @FXML
    private AnchorPane anchorPane_SignInPage;


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
    }
}
