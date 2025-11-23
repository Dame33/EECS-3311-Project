package org.openjfx.EECS_3311_Project.views;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
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
    
    private final Mediator mediator = Mediator.getInstance();

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
                        mediator.cancelBooking(currentBooking);
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
                 confirmAlert2.setContentText("Meeting Begins on: " + currentBooking.getStartTime().format(DateTimeFormatter.ofPattern("MMM d, yyyy")) + " from "
                 + currentBooking.getStartTime().format(DateTimeFormatter.ofPattern("HH:mm")) + " to " 
                		 + currentBooking.getEndTime().format(DateTimeFormatter.ofPattern("HH:mm"))
                 );
                 
                 confirmAlert2.showAndWait().ifPresent(response -> {
                	 if(response == ButtonType.OK) {
                		 LocalDateTime now = LocalDateTime.now();
                		 
                   		 showPaymentModal(event);
                		 
                		 currentBooking.checkIn();
                		 currentBooking.setCheckInTime(now);
                		 mediator.saveBooking(currentBooking);
                		 Session.setEditBooking(currentBooking);
                		 
                		 Alert successAlert2 = new Alert(Alert.AlertType.INFORMATION);
                		 successAlert2.setTitle("Checked into Booking");
                		 successAlert2.setHeaderText("Success!");
                		 successAlert2.setContentText("You have successfully checked into your booking!");
                		 successAlert2.showAndWait();
                		 checkInButton.setVisible(false);
                         checkInButton.setManaged(false);
                		 getListView().refresh();             		 
                	 }
                 });
                 
        	 }
        	 
        	
        }
        );

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

        if (isEmpty || newBooking == null || newBooking.isCancelled())
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
            
            LocalDateTime now = LocalDateTime.now();
            
            // comment out the second logical conditions
            boolean showCheckIn = !Boolean.TRUE.equals(newBooking.getIsCheckedIn()) && (now.isAfter(newBooking.getStartTime()));
            
            checkInButton.setVisible(showCheckIn);
            checkInButton.setManaged(showCheckIn);
            
            setGraphic(root);

            setStyle("-fx-background-color: transparent; -fx-padding: 5px 10px 5px 10px;");
            
            prefWidthProperty().bind(getListView().widthProperty().subtract(20));

        }
    }

    private void showPaymentModal(ActionEvent event) {
     	Booking currentBooking = getItem();
     	Payment payment = mediator.getPaymentFromBooking(currentBooking);
     	double subtotalPrice = payment.getAmount();
     	double taxedPrice = subtotalPrice * tax;
     	
        javafx.stage.Stage modalStage = new javafx.stage.Stage();
        modalStage.initModality(javafx.stage.Modality.APPLICATION_MODAL);
        modalStage.setTitle("Total Payment");

        VBox root = new VBox(5);
        root.setPadding(new javafx.geometry.Insets(20));
        root.setStyle("-fx-background-color: #f0f0f0;");

        Label subtotalPriceLabel = new Label(String.format("Your Subtotal: $%.2f", subtotalPrice));
        subtotalPriceLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        
        Label taxedPriceLabel = new Label(String.format("Your Taxed Amount: $%.2f", taxedPrice));
        taxedPriceLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        
        Label totalPriceLabel = new Label(String.format("Your Total: $%.2f", subtotalPrice + taxedPrice));
        totalPriceLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Button payButton = new Button("Confirm");
        payButton.setStyle("-fx-font-weight: bold;");

        payButton.setOnAction(e -> {
        	modalStage.close();
        });

        root.getChildren().addAll(subtotalPriceLabel, taxedPriceLabel, totalPriceLabel, payButton);
        Scene scene = new javafx.scene.Scene(root, 400, 300);
        modalStage.setScene(scene);
        modalStage.showAndWait();
        
        SceneManager.changeScene(event, "HomePage.fxml", "Main Menu");
    }
}
