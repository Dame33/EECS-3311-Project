package org.openjfx.EECS_3311_Project.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.managers.SceneManager;
import org.openjfx.EECS_3311_Project.model.User;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class NavbarController {

    @FXML
    private Button button_mainMenu;
    @FXML
    private Button button_Bookings;
    @FXML
    private Button button_CECTools;
    @FXML
    private Button button_AdminTools;
    @FXML
    private Button button_Logout;

    @FXML
    public void initialize() {
        User currentUser = Session.getUser();
        button_CECTools.setVisible(false);
        button_AdminTools.setVisible(false);
        
        if (currentUser != null) {
            String role = currentUser.getUserType();
            
            switch (role) {
                case "CEC":
                    button_CECTools.setVisible(true);
                    button_AdminTools.setVisible(true);                    
                    break;

                case "Admin":
                    button_AdminTools.setVisible(true);
                    break;

                case "User":
                    break;

                default:
                    System.err.println("Unknown role: " + role);
            }
        }

        button_mainMenu.setOnAction(this::onMainMenuClicked);
        button_Bookings.setOnAction(this::onBookingsClicked);
        button_CECTools.setOnAction(this::onCECToolsClicked);
        button_AdminTools.setOnAction(this::onAdminToolsClicked);
        button_Logout.setOnAction(this::onLogoutClicked);
    }

    private void onMainMenuClicked(ActionEvent event) {
    	SceneManager.changeScene(event, "HomePage.fxml", "Main Menu");
    }

    private void onBookingsClicked(ActionEvent event) {
    	SceneManager.changeScene(event, "BookARoom.fxml", "Book a Room");
        System.out.println("Bookings clicked");
    }

    private void onCECToolsClicked(ActionEvent event) {
    	SceneManager.changeScene(event, "cectools/cec_tools.fxml", "CEC Tools");
    }

    private void onAdminToolsClicked(ActionEvent event) {
    	SceneManager.changeScene(event, "AdminTools.fxml", "Admin Tools");
    }

    private void onLogoutClicked(ActionEvent event) {
     SceneManager.changeScene(event, "SignIn.fxml", "Sign In");
     Session.setUser(null);

    }


}
