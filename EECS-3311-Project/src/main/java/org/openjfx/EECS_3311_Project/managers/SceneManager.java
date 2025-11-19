package org.openjfx.EECS_3311_Project.managers;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openjfx.EECS_3311_Project.App;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.controllers.HomePageController;
import org.openjfx.EECS_3311_Project.controllers.NavbarController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SceneManager {

	
  public static void changeScene(ActionEvent event, String fxmlFile, String title, String email, String accountType)
  {
      Parent root = null;

      try {
          FXMLLoader loader = new FXMLLoader(SceneManager.class.getResource("/fxml/" + fxmlFile));
          root = loader.load();

          if (email != null && accountType != null) {
              if (loader.getController() instanceof HomePageController homePageController) {
                  homePageController.setUserInfo(email, accountType);
              }
          }

          //add the nav bar to every page except the sign in and register pages
          if (!fxmlFile.equals("SignIn.fxml") && !fxmlFile.equals("Register.fxml")) {
              // load navbar
              FXMLLoader navbarLoader = new FXMLLoader(SceneManager.class.getResource("/fxml/Navbar.fxml"));
              Parent navbar = navbarLoader.load();

              if (root instanceof BorderPane bp) {
                  bp.setTop(navbar);
              }

              // pass current user to navbar for role-based visibility
              NavbarController navbarController = navbarLoader.getController();
              //snavbarController.updateForUser(Session.getUser());
          }

      } catch (IOException e) {
          e.printStackTrace();
      }

      Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      stage.setTitle(title);
      stage.setScene(new Scene(root, 600, 400));
      stage.show();
  }

}
