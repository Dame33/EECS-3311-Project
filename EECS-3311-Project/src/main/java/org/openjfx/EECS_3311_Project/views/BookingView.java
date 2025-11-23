package org.openjfx.EECS_3311_Project.views;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.managers.SceneManager;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.Payment;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class BookingView extends ListCell<Booking>
{
	private final HBox root; 
    private final VBox card;
    private final Label bookingNameLabel;
    private final Label dateLabel;
    private final Label roomLabel;
    private final Label timeLabel;
    private final Button editButton;
    private final Button checkInButton;
    private final Region emptySpace;
    private static final double tax = 0.13;
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("h:mm a");

    public BookingView(boolean isHost)
    {
        //initializing the labels
        bookingNameLabel = new Label();
        bookingNameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 12px; -fx-text-fill: black;");

        dateLabel = new Label();
        dateLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 12px; -fx-text-fill: black;");

        roomLabel = new Label();
        roomLabel.setStyle("-fx-text-fill: black; -fx-font-size: 12px;");

        timeLabel = new Label();
        timeLabel.setStyle("-fx-text-fill: black; -fx-font-size: 12px;");

        //initializing the card
        card = new VBox(5, bookingNameLabel, dateLabel, roomLabel, timeLabel);

        //align text
        card.setAlignment(Pos.CENTER_LEFT);
        
        emptySpace = new Region();
        HBox.setHgrow(emptySpace, Priority.ALWAYS);
        
        //initialize the edit button
        editButton = new Button("✎ Edit");
        editButton.setStyle("-fx-background-color: #ddd; -fx-cursor: hand;");
        
        //defining click
        editButton.setOnAction(event -> {
        	Booking currentBooking = getItem();
        	if(currentBooking != null)
        	{
        		Session.setEditBooking(currentBooking);
        		Session.isEditingBooking = true ; // editing Exiting booking
        		SceneManager.changeScene(event, "BookingEdit.fxml", "Edit Booking");
        		
        	}
        });
        
        Button cancelButton = new Button("✖ Cancel");
        cancelButton.setStyle("-fx-background-color: #f88; -fx-cursor: hand; -fx-text-fill: white;");

        // cancel buitton
        cancelButton.setOnAction(event -> {
            Booking currentBooking = getItem();
            if (currentBooking != null) {
                Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
                confirmAlert.setTitle("Cancel Booking");
                confirmAlert.setHeaderText("Are you sure you want to cancel this booking?");
                confirmAlert.setContentText(
                    currentBooking.getName() + " on " +
                    currentBooking.getStartTime().format(DateTimeFormatter.ofPattern("MMM d, yyyy")) 
                );

                confirmAlert.showAndWait().ifPresent(response -> {
                    if (response == ButtonType.OK) {
                        Mediator.getInstance().cancelBooking(currentBooking);
                        Session.getUser().removeBooking(currentBooking);

                        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                        successAlert.setTitle("Booking Cancelled");
                        successAlert.setHeaderText(null);
                        successAlert.setContentText("Your booking was successfully cancelled. Your deposit will be refunded.");
                        successAlert.showAndWait();
                        
                        // optionally refresh the list view if needed
                        getListView().getItems().remove(currentBooking);
                    }
                });
            }
        });
        
        //check in button
        checkInButton = new Button("Check In");
        checkInButton.setStyle("-fx-background-color: #02aa33; -fx-cursor: hand; -fx-text-fill: white;");
      
        checkInButton.setOnAction(event -> {
        	Booking currentBooking = getItem();
        	 if (currentBooking.getIsCheckedIn() == false) {
                 Alert confirmAlert2 = new Alert(Alert.AlertType.CONFIRMATION);
                 confirmAlert2.setHeaderText("Check into " + currentBooking.getRoomId() + " for " + currentBooking.getName() + "?");
                 confirmAlert2.setContentText("Meeting Begins on: " + currentBooking.getStartTime().format(DateTimeFormatter.ofPattern("MMM d, yyyy")) + " from"
                 + currentBooking.getStartTime().format(DateTimeFormatter.ofPattern("HH:mm")) + " to" 
                		 + currentBooking.getEndTime().format(DateTimeFormatter.ofPattern("HH:mm"))
                 );
                 
                 confirmAlert2.showAndWait().ifPresent(response -> {
                	 if(response == ButtonType.OK) {
                		 LocalDateTime now = LocalDateTime.now();
                		 LocalDateTime startTime = currentBooking.getStartTime();
                		 
                		 //boolean depositValid = !now.isAfter(startTime.plusMinutes(30));
                		 //tracks if deposit valid or not
                		 
                		 //here
                		 
                		 currentBooking.checkIn();
                		 currentBooking.setCheckInTime(now);
                		 Mediator.getInstance().saveBooking(currentBooking);
                		 Session.setEditBooking(currentBooking);
                		 
                		 
                		 Alert successAlert2 = new Alert(Alert.AlertType.INFORMATION);
                		 successAlert2.setTitle("Checked into Booking");
                		 successAlert2.setHeaderText("Success!");
                		 successAlert2.setContentText("You have successfully checked into your booking!");
                		 successAlert2.showAndWait();
                		 checkInButton.setVisible(false);
                         checkInButton.setManaged(false);
                		 getListView().refresh();
                         //SceneManager.changeScene(event, "BookingEdit.fxml", "Edit Booking");
                		 
                	 }
                 });
                 
        	 }
        	 
        	
        }
        );
        
        //private void finalPayment(Booking booking, boolean valid) {
        	
        //}
		/*
		 * private void finalPayment(Booking booking, boolean valid) { AccountRole role
		 * = Session.getUser().getAccountRole(); long totalMins =
		 * Duration.between(booking.getStartTime(), booking.getEndTime()); double hours
		 * = totalMins/60; double priceWithDeposit = booking.depositAndTotalPrice(role,
		 * hours); double priceWithoutDeposit = booking.calculateTotalPrice(role,
		 * hours); double charge; if(valid) { charge = priceWithDeposit;
		 * 
		 * } else { charge = priceWithoutDeposit; } double totalDue = charge * 1.13;
		 * Alert paymentAlert = new Alert(Alert.AlertType.CONFIRMATION);
		 * paymentAlert.setTitle("Finalize Payment");
		 * paymentAlert.setHeaderText("Confirm final payment");
		 * paymentAlert.setContentText(msg.toString());
		 * 
		 * Button paymentButton = new Button("Confirm Payment?");
		 * paymentButton.setOnAction(event -> { if (event == ButtonType.OK) { Payment
		 * payment = new Payment(charge); } });
		 * 
		 * }
		 */
        
        
        
        if(isHost)
        {
        	root = new HBox(10, card, emptySpace, checkInButton, editButton, cancelButton);
        }
        
        
        else
        {
        	root = new HBox(10, card, emptySpace);
        }
        
        
        root.setAlignment(Pos.CENTER_LEFT);
        root.setPadding(new javafx.geometry.Insets(10));

        //styling the card
        root.setStyle("-fx-border-color: black;" +"-fx-border-width: 1;" + "-fx-background-color: white;");
        root.setMaxWidth(Double.MAX_VALUE);
        
    }

    @Override
    protected void updateItem(Booking newBooking, boolean isEmpty)
    {
        super.updateItem(newBooking, isEmpty);

        if (isEmpty || newBooking == null)
        {
            setText(null);
            setGraphic(null);

            setStyle("-fx-background-color: transparent;");
        }
        else {
            bookingNameLabel.setText(newBooking.getName());
            dateLabel.setText(newBooking.getStartTime().getMonth().name() + " " + newBooking.getStartTime().getDayOfMonth() + ", " + newBooking.getStartTime().getYear());
            roomLabel.setText(newBooking.getRoomId());
            timeLabel.setText(newBooking.getStartTime().format(TIME_FORMATTER) + " - " + newBooking.getEndTime().format(TIME_FORMATTER));
            
            boolean showCheckIn = !Boolean.TRUE.equals(newBooking.getIsCheckedIn());
            checkInButton.setVisible(showCheckIn);
            checkInButton.setManaged(showCheckIn);
            
            setGraphic(root);

            setStyle("-fx-background-color: transparent; -fx-padding: 5px 10px 5px 10px;");
            
            prefWidthProperty().bind(getListView().widthProperty().subtract(20));

        }
    }
    
   

}
