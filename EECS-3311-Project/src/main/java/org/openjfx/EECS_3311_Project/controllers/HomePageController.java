package org.openjfx.EECS_3311_Project.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.model.User;

public class HomePageController implements Initializable {

    @FXML
    private AnchorPane anchorPane_homePage;

    @FXML
    private Button button_Logout;

    @FXML
    private Text text_email;
    @FXML
    private Text text_accountType;

    @FXML
    private Text text_name;         
    @FXML
    private Text text_accountRole;   
    @FXML
    private Text text_hourlyRate;   

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setUserInfo(Session.getUser());
    }

    public void setUserInfo(User user) {
        text_email.setText("Email: " + user.getEmail());
        text_accountType.setText("Account Type: " + user.getUserType());

        // New fields
        text_name.setText("Name: " + user.getFirstName() + " " + user.getLastName());
        if (user.getAccountRole() != null) {
            text_accountRole.setText("Account Role: " + user.getAccountRole().getRoleName());
            text_hourlyRate.setText("Hourly Rate: $" + user.getAccountRole().getHourlyRate());
        } else {
            text_accountRole.setText("Account Role: N/A");
            text_hourlyRate.setText("Hourly Rate: N/A");
        }
    }
}
