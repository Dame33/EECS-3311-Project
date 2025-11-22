package org.openjfx.EECS_3311_Project.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.managers.SceneManager;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.Room;

public class BookingFormController {

    @FXML private Button buttonPrev;
    @FXML private Button buttonNext;
    @FXML private Label lblMonth;
    @FXML private GridPane calendarGrid;
    @FXML private VBox timePicker;
    @FXML private VBox roomPicker;
    private final java.util.List<LocalTime> selectedTimes = new ArrayList<>();
    private List<Booking> bookingsForDay = new ArrayList<Booking>();
    
    private Room selectedRoom; 
    private LocalDate selectedDate; 
    private Mediator mediator = Mediator.getInstance();

    private YearMonth currentMonth;

    @FXML
    private void initialize() {
        currentMonth = YearMonth.now();
        drawCalendar();

        buttonPrev.setOnAction(e -> {
            currentMonth = currentMonth.minusMonths(1);
            drawCalendar();
        });

        buttonNext.setOnAction(e -> {
            currentMonth = currentMonth.plusMonths(1);
            drawCalendar();
        });
    }
    
    @FXML private void handleSubmit(ActionEvent event) {
    	
    	if (!selectedTimes.isEmpty()) {
    	    selectedTimes.sort(null); // order from earliest to latest

    	    LocalTime startTime = selectedTimes.get(0); 
    	    LocalTime endTime = selectedTimes.get(selectedTimes.size() - 1).plusMinutes(30); 

    	    // combine with the selected date
    	    LocalDateTime startDateTime = LocalDateTime.of(selectedDate, startTime);
    	    LocalDateTime endDateTime = LocalDateTime.of(selectedDate, endTime);
    	    Booking newBooking = new Booking( selectedRoom.getId(), Session.getUser().getId(), startDateTime, endDateTime);

    	    Session.setEditBooking(newBooking);
    	    Session.isEditingBooking = false ; // creating new booking
    	    SceneManager.changeScene(event, "BookingEdit.fxml", "Edit Booking");
    	} else {
		    // show alert if no time selected
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("No Time Selected");
			alert.setHeaderText(null);
			alert.setContentText("Please select at least one time slot to create a booking.");
		    alert.showAndWait();
		}
       
        
    }


    private void drawCalendar() {
        calendarGrid.getChildren().clear();

        lblMonth.setText(currentMonth.getMonth() + " " + currentMonth.getYear());

        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        for (int i = 0; i < 7; i++) {
            Label lbl = new Label(days[i]);
            lbl.getStyleClass().add("weekday-label");
            calendarGrid.add(lbl, i, 0);
        }

        LocalDate firstOfMonth = currentMonth.atDay(1);
        int monthLength = currentMonth.lengthOfMonth();

        int startColumn = firstOfMonth.getDayOfWeek().getValue(); 
        if (startColumn == 7) startColumn = 0; // Sunday as 0

        int row = 1;
        int col = startColumn;

        LocalDate today = LocalDate.now();

        // prev month's tail (always greyed out)
        LocalDate prevMonthTail = firstOfMonth.minusDays(startColumn);
        for (int i = 0; i < startColumn; i++) {
            calendarGrid.add(createDayCell(prevMonthTail.plusDays(i), true), i, 1);
        }

        // active cells for current month
        for (int day = 1; day <= monthLength; day++) {
            LocalDate date = currentMonth.atDay(day);
            boolean isPast = date.isBefore(today);
            calendarGrid.add(createDayCell(date, isPast), col, row); // past dates inactive
            col++;
            if (col > 6) {
                col = 0;
                row++;
            }
        }

        // fill remaining cells from next month to ensure 6 rows total
        LocalDate nextMonthDay = currentMonth.atDay(monthLength).plusDays(1);
        while (row <= 6) {
            calendarGrid.add(createDayCell(nextMonthDay, true), col, row);
            nextMonthDay = nextMonthDay.plusDays(1);
            col++;
            if (col > 6) {
                col = 0;
                row++;
            }
        }

        // Disable prev button if previous month is in the past
        YearMonth prevMonth = currentMonth.minusMonths(1);
        buttonPrev.setDisable(prevMonth.isBefore(YearMonth.now()));
    }



    private StackPane createDayCell(LocalDate date, boolean isGreyed) {
        StackPane cell = new StackPane();
        cell.getStyleClass().add("day-cell");

        if (isGreyed)
            cell.getStyleClass().add("outside-month");
        else
        	cell.getStyleClass().add("active-cell");

        Text t = new Text(String.valueOf(date.getDayOfMonth()));
        cell.getChildren().add(t);
        StackPane.setAlignment(t, Pos.TOP_LEFT);

        cell.setOnMouseClicked(e -> {
        	if(!isGreyed) {
        		//System.out.println("Clicked: " + date);
        		selectedDate = date;
                showRoomPicker(date); //show rooms
        	}
            
        });

        return cell;
    }
    
    private void showRoomPicker(LocalDate date) {
        roomPicker.getChildren().clear();
        timePicker.getChildren().clear(); // clear previous time picker
        
        Label timeLabel = new Label(("Rooms on " + date));
        timeLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        roomPicker.getChildren().add(timeLabel);

        ScrollPane scroll = new ScrollPane();
        VBox roomContainer = new VBox(5);
        roomContainer.setPadding(new Insets(10));

        for (Room room : mediator.getAllRooms()) {
            StackPane roomSlot = new StackPane();
            roomSlot.setMinHeight(40);
            roomSlot.setMaxWidth(Double.MAX_VALUE);
            roomSlot.getStyleClass().add("room-slot");

            Label lbl = new Label(room.getRoomName() + " (" + room.getBuildingName() + ")");
            roomSlot.getChildren().add(lbl);
            StackPane.setAlignment(lbl, Pos.CENTER_LEFT);
            StackPane.setMargin(lbl, new Insets(0,0,0,10));

            roomSlot.setOnMouseClicked(e -> {
                if (roomPicker.getChildren().size() > 1) { // skip the first child, whcih is the date label
                    ScrollPane scrollPane = (ScrollPane) roomPicker.getChildren().get(1);
                    VBox roomContainerV = (VBox) scrollPane.getContent();
                    for (Node n : roomContainerV.getChildren()) {
                        n.setStyle(""); // remove highlight
                    }
                }
                selectedRoom = room;
                roomSlot.setStyle("-fx-background-color: #83bf80; -fx-border-color: black;");
                showTimePicker(date);
            });

            roomContainer.getChildren().add(roomSlot);
        }

        scroll.setContent(roomContainer);
        scroll.setFitToWidth(true);

        roomPicker.getChildren().add(scroll);
    }
    private void showTimePicker(LocalDate date) {
    	selectedTimes.clear();
    	timePicker.getChildren().clear(); // remove previous times
    	bookingsForDay = mediator.getBookingsByRoomAndDate(selectedRoom.getId(), date);

    	Label roomLabel = new Label((selectedRoom != null ? selectedRoom.getRoomName() : "None"));
	    roomLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
	    timePicker.getChildren().add(roomLabel);
    	
        ScrollPane scroll = new ScrollPane();
        VBox timesContainer = new VBox(5); 
        timesContainer.setPadding(new Insets(10));

        LocalTime start = LocalTime.of(7, 0);  // booking times start at 7
        LocalTime end = LocalTime.of(21, 30);   // booking times end at 21:30

        LocalTime current = start;
        while (!current.isAfter(end)) {
            StackPane timeSlot = createTimeSlot(current, date);
            timesContainer.getChildren().add(timeSlot);
            current = current.plusMinutes(30);
        }

        scroll.setContent(timesContainer);
        scroll.setFitToWidth(true);

        timePicker.getChildren().add(scroll);
    }
    
    private StackPane createTimeSlot(LocalTime time, LocalDate date) {
        StackPane slot = new StackPane();
        slot.getStyleClass().add("time-slot");
        slot.setMinHeight(40);
        slot.setMaxWidth(Double.MAX_VALUE);

        LocalDateTime startDateTime = LocalDateTime.of(date, time);
        LocalDateTime endDateTime = startDateTime.plusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");

        Label lbl = new Label(startDateTime.format(formatter) + " - " + endDateTime.format(formatter));
        slot.getChildren().add(lbl);
        StackPane.setAlignment(lbl, Pos.CENTER_LEFT);
        StackPane.setMargin(lbl, new Insets(0,0,0,10));

        // check if this slot is booked
        boolean isBooked = false;
        for (Booking b : bookingsForDay) {
            LocalTime bookingStart = b.getStartTime().toLocalTime();
            LocalTime bookingEnd = b.getEndTime().toLocalTime();
            if (!time.isBefore(bookingStart) && time.isBefore(bookingEnd)) {
                isBooked = true;
                break;
            }
        }

        // store booked status in userData
        slot.setUserData(isBooked);

        // color booked slots red and disable click
        if (isBooked) {
            slot.setStyle("-fx-background-color: #ff6b6b; -fx-opacity: 0.6;"); // red
            slot.setDisable(true);
        }

        slot.setOnMouseClicked(e -> {
            if ((boolean) slot.getUserData()) return; // ignore booked slots

            if (selectedTimes.contains(time)) {
                // deselect this time and all after it
                java.util.List<LocalTime> timesToRemove = new java.util.ArrayList<>();
                for (LocalTime t : selectedTimes) {
                    if (!t.isBefore(time)) { // t >= time
                        timesToRemove.add(t);
                    }
                }
                selectedTimes.removeAll(timesToRemove);
                refreshTimeSlotStyles();
            } else {
                // try to select contiguous block
                java.util.List<LocalTime> newSelection = new java.util.ArrayList<>();

                // find min and max of current selection + new time
                LocalTime min = time;
                LocalTime max = time;
                for (LocalTime t : selectedTimes) {
                    if (t.isBefore(min)) min = t;
                    if (t.isAfter(max)) max = t;
                }

                // generate all 30min times between min and max
                LocalTime current = min;
                boolean canSelect = true;
                while (!current.isAfter(max)) {
                    boolean slotBooked = false;
                    for (Booking b : bookingsForDay) {
                        LocalTime bookingStart = b.getStartTime().toLocalTime();
                        LocalTime bookingEnd = b.getEndTime().toLocalTime();
                        if (!current.isBefore(bookingStart) && current.isBefore(bookingEnd)) {
                            slotBooked = true;
                            break;
                        }
                    }

                    if (slotBooked) {
                        canSelect = false;
                        break;
                    }

                    newSelection.add(current);
                    current = current.plusMinutes(30);
                }

                if (canSelect) {
                    // apply new contiguous selection
                    selectedTimes.clear();
                    selectedTimes.addAll(newSelection);
                } else {
                    // cannot select gap; reset to only the latest clicked
                    selectedTimes.clear();
                    selectedTimes.add(time);
                }

                refreshTimeSlotStyles();
            }

            //System.out.println("Selected times: " + selectedTimes);
        });

        return slot;
    }

    private void refreshTimeSlotStyles() {
        VBox timesContainer = (VBox)((ScrollPane)timePicker.getChildren().get(1)).getContent();
        for (Node node : timesContainer.getChildren()) {
            StackPane slot = (StackPane) node;
            Label lbl = (Label) slot.getChildren().get(0);
            LocalTime slotTime = LocalTime.parse(lbl.getText().split(" - ")[0], DateTimeFormatter.ofPattern("h:mm a")); // get starting time

            boolean isBooked = slot.getUserData() != null && (boolean) slot.getUserData();

            if (selectedTimes.contains(slotTime)) {
                // selected by user
                slot.setStyle("-fx-background-color: #83bf80; -fx-border-color: black;");
            } else if (isBooked) {
                // already booked
                slot.setStyle("-fx-background-color: #ff6b6b; -fx-opacity: 0.6;");
            } else {
                // free  unselected
                slot.setStyle("");
            }
        }
    }

    private void clearSelection() {
        for (Node n : ((VBox)((ScrollPane)timePicker.getChildren().get(0)).getContent()).getChildren()) {
            n.setStyle("");
        }
    }
}
