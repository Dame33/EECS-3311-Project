package org.openjfx.EECS_3311_Project.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.User;
import org.openjfx.EECS_3311_Project.views.BookingView;

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
    @FXML
    private ListView<Booking> lv_createdBookingsListView;
    @FXML
    private ListView<Booking> lv_invitedBookingsListView;
    
    private Mediator mediator = Mediator.getInstance();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setUserInfo(Session.getUser());

        lv_createdBookingsListView.setCellFactory(param -> new BookingView(true));
        lv_createdBookingsListView.setPlaceholder(new Label("No bookings yet"));

        lv_invitedBookingsListView.setCellFactory(param -> new BookingView(false));
        lv_invitedBookingsListView.setPlaceholder(new Label("No bookings yet"));
        
        List<Booking> invitedBookingsList = new ArrayList<>();
        invitedBookingsList = mediator.getAllInvitedBookings(Session.getUser().getId());

        
        //set the data to the observable lists
      
        ObservableList<Booking> hostBookings = FXCollections.observableArrayList(Session.getUser().getBookings());
        ObservableList<Booking> invitedBookings = FXCollections.observableArrayList(mediator.getAllInvitedBookings(Session.getUser().getId()));
        
   
        //load data into the view
        lv_createdBookingsListView.setItems(hostBookings);
        lv_invitedBookingsListView.setItems(invitedBookings);
        
        //prevent box selection
        lv_createdBookingsListView.setSelectionModel(null);
        lv_invitedBookingsListView.setSelectionModel(null);
    }

    public void setUserInfo(User user) {
        text_name.setText(user.getFirstName() + " " + user.getLastName());
        text_email.setText(user.getEmail());
        text_accountType.setText(user.getUserType());

        if (user.getAccountRole() != null) {
            text_accountRole.setText(user.getAccountRole().getRoleName());
            text_hourlyRate.setText("$" + user.getAccountRole().getHourlyRate());
        } else {
            text_accountRole.setText("N/A");
            text_hourlyRate.setText("N/A");
        }
    }
}

