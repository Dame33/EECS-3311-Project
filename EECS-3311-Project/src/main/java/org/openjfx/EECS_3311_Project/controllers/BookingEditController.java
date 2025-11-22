package org.openjfx.EECS_3311_Project.controllers;

import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.User;

public class BookingEditController implements Initializable {
    @FXML
    private TextField bookingName;
    @FXML
    private Text dateTime;
    @FXML
    private Text hostEmail;
    @FXML
    private Text bookingPrice;
    @FXML
    private TextField studentIdField;
    @FXML
    private TextField attendeeIdField;
    @FXML
    private VBox attendeesList;
    
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    Mediator mediator = Mediator.getInstance();

    private Booking currentBooking;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Booking booking = Session.getNewBooking();
        User user = Session.getUser();
        
        this.currentBooking = booking;
        // Safety check to prevent crashes if booking is null
        if (booking != null && user != null) {
            setBookingInfo(booking, user);
            populateAttendees();
        }
    }
    
    private void setBookingInfo(Booking booking, User user) {
        // I corrected a likely bug from master here: 
        // changed .getText() to .setText() so the name actually shows up.
        bookingName.setText(booking.getName()); 
        
        LocalDateTime start = booking.getStartTime();
        LocalDateTime end = booking.getEndTime();
        String dateTimeText = start.format(timeFormatter) + " - " + end.format(timeFormatter);
        dateTime.setText(dateTimeText);

        hostEmail.setText(user.getEmail());

        double hoursBetween = Duration.between(start, end).toMinutes() / 60.0;
        AccountRole user_type = user.getAccountRole();

        double price = booking.calculatePrice(user_type, hoursBetween);

        String bookingPriceText = String.format("$ %.2f", price);
        bookingPrice.setText(bookingPriceText);
    }
    
    // Display all the attendees
    private void populateAttendees() {
        if (attendeesList != null) {
            attendeesList.getChildren().clear();
            
            List<String> attendeeIds = currentBooking.getAttendeeIds();
            if (attendeeIds != null) {
                for (String id : attendeeIds) {
                    addAttendeeToUI(id);
                }
            }
        }
    }
    
    // Method to add friend by ID
    @FXML
    private void onAddAttendee() {
        String id = attendeeIdField.getText();
        if(id.isEmpty()) {
            return; 
        }
        
        List<String> attendeeIds = currentBooking.getAttendeeIds();
        if(attendeeIds == null) {
            attendeeIds = new ArrayList<>();
            currentBooking.setAttendeeIds(attendeeIds);
        }
        
        if(attendeeIds.contains(id)) {
            System.out.println("Attendee ID has already been added");
            attendeeIdField.clear();
            return;
        }
        
        attendeeIds.add(id); 
        mediator.saveBooking(currentBooking.getId());
        addAttendeeToUI(id);
        attendeeIdField.clear();
    }
    
    // Helper to create the UI row for an attendee
    private void addAttendeeToUI(String id) {
        HBox row = new HBox(10);
        Text idText = new Text(id);
        Button XButton = new Button("X");
        
        XButton.setOnAction(e -> {
            attendeesList.getChildren().remove(row);
            List<String> attendeeIds = currentBooking.getAttendeeIds();
            
            if (attendeeIds != null && !attendeeIds.isEmpty()) {
                attendeeIds.remove(id);
                mediator.saveBooking(currentBooking.getId());
            }
        });
        
        row.getChildren().addAll(idText, XButton);
        attendeesList.getChildren().add(row);
    }
}