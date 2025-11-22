package org.openjfx.EECS_3311_Project.views;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.managers.SceneManager;
import org.openjfx.EECS_3311_Project.model.Booking;

import java.time.format.DateTimeFormatter;

public class BookingView extends ListCell<Booking>
{
	private final HBox root; 
    private final VBox card;
    private final Label bookingNameLabel;
    private final Label dateLabel;
    private final Label roomLabel;
    private final Label timeLabel;
    private final Button editButton;
    private final Region emptySpace;
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
        		Session.setNewBooking(currentBooking);
        		System.out.println("returning booking " + currentBooking.getName());
        		SceneManager.changeScene(event, "BookingEdit.fxml", "Edit Booking");
        		
        	}
        });
        
        if(isHost)
        {
        	root = new HBox(10, card, emptySpace, editButton);
        }
        else
        {
        	root = new HBox(10, card, emptySpace);
        }
        
        
        root.setAlignment(Pos.CENTER_LEFT);
        root.setPadding(new javafx.geometry.Insets(10));

        //styling the card
        root.setStyle(
                "-fx-border-color: black;" +
                        "-fx-border-width: 1;" +
                        "-fx-background-color: white;"
        );
        
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

            setGraphic(root);

            setStyle("-fx-background-color: transparent; -fx-padding: 5px 10px 5px 10px;");
            
            prefWidthProperty().bind(getListView().widthProperty().subtract(20));

        }
    }

}
