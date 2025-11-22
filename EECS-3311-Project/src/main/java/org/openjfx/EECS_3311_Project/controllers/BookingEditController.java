package org.openjfx.EECS_3311_Project.controllers;

import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.managers.SceneManager;
import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.Payment;
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
    private TextField attendeeEmailField;
    @FXML
    private VBox attendeesList;
    @FXML
    private ComboBox<String> comboExtendTime;
    
    @FXML
    private Button comboExtendTimeBtn;
    
    private double price;
    
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    Mediator mediator = Mediator.getInstance();
    private LocalDateTime latestEndTime;
    
    private final List<User> possibleInvitees = mediator.getPossibleInvitees(Session.getUser().getId());

    private Booking currentBooking;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Booking booking = Session.getEditBooking();
        User user = Session.getUser();
        
        this.currentBooking = booking;
        // Safety check to prevent crashes if booking is null
        if (booking != null && user != null) {
            setBookingInfo(booking, user);
            populateAttendees();
        }
        latestEndTime = mediator.getLastestEndTime(currentBooking.getRoomId(), currentBooking.getEndTime());
        comboExtendTime.setVisible(Session.isEditingBooking);
        comboExtendTimeBtn.setVisible(Session.isEditingBooking);
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

        price = booking.calculateDepositPrice(user_type);

        String bookingPriceText = String.format("$ %.2f", price);
        bookingPrice.setText(bookingPriceText);
        
        studentIdField.setText(booking.getStudentOrOrganizationId());
        
        if(Session.isEditingBooking) populateExtendComboBox();
    }
    
    // Display all the attendees
    private void populateAttendees() {
        if (attendeesList != null) {
            attendeesList.getChildren().clear();
            
            List<User> attendees = mediator.getManyUsersByIds(currentBooking.getAttendeeIds());

            for (User u : attendees) {
                addAttendeeToUI(u.getEmail());
            }
            
        }
    }
    
    @FXML
    private void onSubmit(ActionEvent event) {
        if (currentBooking == null) return;

        String newName = bookingName.getText();
        String studentId = studentIdField.getText();

        if (newName == null || newName.isBlank() ||
            studentId == null || studentId.isBlank()) {
            
            showAlert( "Missing Fields", "Please fill in all required fields", "Booking name and Student/Organization ID cannot be empty.", Alert.AlertType.ERROR);
            return;
        }
        
        currentBooking.setName(newName);
        currentBooking.setStudentOrOrganizationId(studentId);

        if(Session.isEditingBooking) {
        	mediator.saveBooking(currentBooking);
            // need to also save the user.
            Session.getUser().addBooking(currentBooking);
            mediator.saveUser(Session.getUser());
        	
        	SceneManager.changeScene(event, "HomePage.fxml", "Main Menu"); 
        	} // skip payment
        
        else {showPaymentModal(event);}
        
        
    }
    
    private void showPaymentModal(ActionEvent event) {
        javafx.stage.Stage modalStage = new javafx.stage.Stage();
        modalStage.initModality(javafx.stage.Modality.APPLICATION_MODAL);
        modalStage.setTitle("Booking Deposit Payment");

        VBox root = new VBox(15);
        root.setPadding(new javafx.geometry.Insets(20));
        root.setStyle("-fx-background-color: #f0f0f0;");

        Label priceLabel = new Label(String.format("Deposit amount due: $%.2f", price));
        priceLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        TextField cardNumberField = new TextField();
        cardNumberField.setPromptText("Card Number (16 digits)");

        TextField csvField = new TextField();
        csvField.setPromptText("CSV (3 digits)");

        TextField expiryField = new TextField();
        expiryField.setPromptText("Expiry (MM/YY)");

        Label errorLabel = new Label();
        errorLabel.setStyle("-fx-text-fill: red;");

        Button payButton = new Button("Submit Payment");
        payButton.setStyle("-fx-font-weight: bold;");

        payButton.setOnAction(e -> {
            String card = cardNumberField.getText().trim();
            String csv = csvField.getText().trim();
            String expiry = expiryField.getText().trim();

            String validationError = validatePaymentFields(card, csv, expiry);
            if (validationError != null) {
                errorLabel.setText(validationError);
            } else {
                mediator.saveBooking(currentBooking);
                // need to also save the user.
                Session.getUser().addBooking(currentBooking);
                mediator.saveUser(Session.getUser());
                modalStage.close();
                Payment payment = new Payment(price, parseCard(card), Session.getUser().getId());
                
                mediator.createPaymentRecord(payment);
                
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Payment Successful");
                alert.setHeaderText(null);
                alert.setContentText("Payment completed successfully!");
                alert.showAndWait();
            }
        });

        root.getChildren().addAll(priceLabel, cardNumberField, csvField, expiryField, errorLabel, payButton);

        Scene scene = new javafx.scene.Scene(root, 400, 300);
        modalStage.setScene(scene);
        modalStage.showAndWait();
        
    	SceneManager.changeScene(event, "HomePage.fxml", "Main Menu");
    }
    
    public static String parseCard(String cardNumber) {
        if (cardNumber == null || cardNumber.length() <= 4) {
            return cardNumber;
        }

        int length = cardNumber.length();
        String lastFour = cardNumber.substring(length - 4);
        String masked = "*".repeat(length - 4);

        return masked + lastFour;
    }

    
    private String validatePaymentFields(String card, String csv, String expiry) {
        if (card.isBlank() || !card.matches("\\d{16}")) {
            return "Card number must be 16 digits";
        }
        if (csv.isBlank() || !csv.matches("\\d{3}")) {
            return "CSV must be 3 digits";
        }
        if (expiry.isBlank() || !expiry.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            return "Expiry must be MM/YY";
        }
        
        String[] parts = expiry.split("/");
        int expMonth = Integer.parseInt(parts[0]);
        int expYear = Integer.parseInt(parts[1]) + 2000; 

        YearMonth exp = YearMonth.of(expYear, expMonth);
        YearMonth now = YearMonth.now();

        if (exp.isBefore(now)) {
            return "Card has expired";
        }

        return null;
    }
    
    // Method to add friend by email
    @FXML
    private void onAddAttendee() {
        String email = attendeeEmailField.getText();
        if(email.isEmpty()) {
            return; 
        }
        
        if(email.equalsIgnoreCase(Session.getUser().getEmail())) {
        	showAlert(
        		    "Invalid Attendee",
        		    "You're already invited!",
        		    "You can't invite yourself to a booking you're hosting. ",
        		    Alert.AlertType.ERROR
        		);
        }
        Optional<User> inviteeOpt = possibleInvitees.stream().filter(user -> user.getEmail().equalsIgnoreCase(email)).findFirst();
        
        if (!inviteeOpt.isPresent()) {
        	showAlert(
        		    "Invalid Attendee",
        		    "User not found",
        		    "No user with email \"" + email + "\" exists.",
        		    Alert.AlertType.ERROR
        		);
            attendeeEmailField.setText(""); // clear field
            return;
        }
        
        User invitee = inviteeOpt.get();

        
        
        List<String> attendeeIds = currentBooking.getAttendeeIds();
        if(attendeeIds == null) {
            attendeeIds = new ArrayList<>();
            currentBooking.setAttendeeIds(attendeeIds);
        }
        
        if(attendeeIds.contains(email)) {
        	showAlert(
        		    "Attendee already invited!",
        		    "Attendee already invited!",
        		    "You've already added " + email + " to this booking.",
        		    Alert.AlertType.ERROR
        		);
        	attendeeEmailField.clear();
            return;
        }
        
        attendeeIds.add(invitee.getId()); 
        addAttendeeToUI(invitee.getEmail());
        attendeeEmailField.clear();
    }
    
    public void showAlert(String title, String header, String content, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
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
            }
        });
        
        row.getChildren().addAll(idText, XButton);
        attendeesList.getChildren().add(row);
    }
    
    
    
    /// extend time
    @FXML
    private void onExtendTime() {
        String selected = comboExtendTime.getValue();
        if (selected == null) return;

        Duration extension = switch (selected) {
            case "30 min" -> Duration.ofMinutes(30);
            case "1 hr" -> Duration.ofHours(1);
            case "1.5 hr" -> Duration.ofMinutes(90);
            case "2 hr" -> Duration.ofHours(2);
            default -> Duration.ZERO;
        };
        
        // we can extend up to two hours
        
        if (!extension.isZero()) {
            currentBooking.setEndTime(currentBooking.getEndTime().plus(extension));
            mediator.saveBooking(currentBooking);

            LocalDateTime start = currentBooking.getStartTime();
            LocalDateTime end = currentBooking.getEndTime();
            dateTime.setText(start.format(timeFormatter) + " - " + end.format(timeFormatter));

            double hoursBetween = Duration.between(start, end).toMinutes() / 60.0;
            price = currentBooking.calculateDepositPrice(Session.getUser().getAccountRole());
            bookingPrice.setText(String.format("$ %.2f", price));

            showAlert("Booking extended", "You've extended your booking successfully!",  
                      "Booking extended by " + selected, Alert.AlertType.INFORMATION);

            populateExtendComboBox();
        }
    }
    
    private void populateExtendComboBox() {
        comboExtendTime.getItems().clear();
        comboExtendTime.getItems().addAll("30 min", "1 hr", "1.5 hr", "2 hr");

        // disable items that would exceed latestEndTime
        comboExtendTime.setCellFactory(lv -> new javafx.scene.control.ListCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setDisable(false);
                } else {
                    setText(item);
                    
                    // calculate the proposed new end time
                    Duration extension = switch (item) {
                        case "30 min" -> Duration.ofMinutes(30);
                        case "1 hr" -> Duration.ofHours(1);
                        case "1.5 hr" -> Duration.ofMinutes(90);
                        case "2 hr" -> Duration.ofHours(2);
                        default -> Duration.ZERO;
                    };
                    
                    LocalDateTime proposedEnd = currentBooking.getEndTime().plus(extension);
                    setDisable(proposedEnd.isAfter(latestEndTime));
                    
                    System.out.println("Proposed: " + proposedEnd + ", Latest: " + latestEndTime);
                }
            }
        });
    }
}