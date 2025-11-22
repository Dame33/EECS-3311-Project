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
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SceneManager {

	
  public static void changeScene(ActionEvent event, String fxmlFile, String title)
  {
	  
      Parent root = null;

      try {
          FXMLLoader loader = new FXMLLoader(SceneManager.class.getResource("/fxml/" + fxmlFile));
          root = loader.load();

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
    	  System.err.println("failed to load: " + fxmlFile);
          e.printStackTrace();
          
          return;
      }

      //Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      stage.setTitle(title);
      Image icon = new Image(SceneManager.class.getResourceAsStream("/images/logo.png"));
      stage.getIcons().add(icon);
      
      Scene currentScene = stage.getScene();
      if (currentScene == null) {
          currentScene = new Scene(root);
          stage.setScene(currentScene);
      } else {
          currentScene.setRoot(root);
      }
      
      stage.show();
      stage.setMaximized(true);
      
  }

}
