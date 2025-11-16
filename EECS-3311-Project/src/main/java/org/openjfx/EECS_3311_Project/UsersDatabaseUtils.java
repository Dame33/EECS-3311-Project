package org.openjfx.EECS_3311_Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UsersDatabaseUtils {

    //scene changer

    public static void changeScene(ActionEvent event, String fxmlFile, String title, String email, String accountType)
    {
        Parent root = null;

        if (email != null && accountType != null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader(UsersDatabaseUtils.class.getResource(fxmlFile));
                root = loader.load();
                HomePageController homePageController = loader.getController();
                homePageController.setUserInfo(email, accountType);
            } catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        else //if they are on the logged out screen
        {
            try
            {
                root = FXMLLoader.load(UsersDatabaseUtils.class.getResource(fxmlFile));

            } catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root, 600,400));
        stage.show();
    }

}
