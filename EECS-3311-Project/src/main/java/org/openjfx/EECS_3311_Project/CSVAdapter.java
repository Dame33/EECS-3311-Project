package org.openjfx.EECS_3311_Project;

import javafx.scene.control.Alert;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.Double;
import org.openjfx.EECS_3311_Project.model.Room;
import org.openjfx.EECS_3311_Project.model.Payment;
import org.openjfx.EECS_3311_Project.model.Status;
import org.openjfx.EECS_3311_Project.model.String;
import org.openjfx.EECS_3311_Project.model.User;

public class CSVAdapter implements ICSVRepository{
    

	
	public static CSVAdapter instance;
	
	public static CSVAdapter getInstance() {
		
		if(instance == null) instance = new CSVAdapter();
		return instance;
	}
//    private final String userDB_CSV = "UserDB.csv";
//    private final String bookingDB = "BookingDB.csv";

    public Booking upsertBooking(Booking booking) {
        ArrayList<Booking> all = getAllBookingsFromFile();

        all.removeIf(b -> b.getRoomId().equals(booking.getRoomId()));
        all.add(booking);

        writeAllBookingsToFile(all);
        return booking;
    }

    public String cancelBooking(String bookingId) {
        ArrayList<Booking> all = getAllBookingsFromFile();

        for (Booking b : all) {
            if (b.getRoomId().equals(bookingId)) {
                b.setInactive(); 
            }
        }

        writeAllBookingsToFile(all);
        return bookingId;
    }

    public ArrayList<Booking> getHostBookingsByUserId(String userId) {
        ArrayList<Booking> result = new ArrayList<>();
        for (Booking b : getAllBookingsFromFile()) {
            if (b.getHostId().equals(userId)) {
                result.add(b);
            }
        }
        return result;
    }

    public ArrayList<Booking> getInvitedBookingsByUserId(String userId) {
        ArrayList<Booking> result = new ArrayList<>();
        for (Booking b : getAllBookingsFromFile()) {
            if (b.getAttendeeIds().contains(userId)) {
                result.add(b);
            }
        }
        return result;
    }
    
    private ArrayList<Booking> getAllBookingsFromFile() {
        ArrayList<Booking> bookings = new ArrayList<>();

        if (!Files.exists(DatabaseUtils.bookingFilePath)) {
            return bookings;
        }

        try (BufferedReader reader = Files.newBufferedReader(DatabaseUtils.bookingFilePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                Booking b = new Booking(line);
                bookings.add(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookings;
    }

    private void writeAllBookingsToFile(ArrayList<Booking> bookings) {
        try (BufferedWriter writer = Files.newBufferedWriter(DatabaseUtils.bookingFilePath)) {
            for (Booking b : bookings) {
                writer.write(bookingToCsvLine(b));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private Booking parseBooking(String line) {
//       Booking booking = new Booking(line);
//       booking.setHost(getUserById(booking.getHost().getId()));
//       
//       ArrayList<String> invitedppl = booking.getInvitedUserIds();
//       ArrayList<User> attendees = new ArrayList<>();
//       for(String userId: invitedppl) {
//    	   User attendee = getUserById(userId);
//    	   if(attendee != null) {
//    		   attendees.add(attendee);
//    	   }
//       }
//       booking.setAttendeeIds(attendees);
//       
//       return booking;
//    }
    
    
    
    public User getUserById(String userId) {
        ArrayList<User> allUsers = getAllUsers();  // read from CSV
        for (User u : allUsers) {
            if (u.getId().equals(userId)) {
                return u;
            }
        }
        return null;
    }
    
    private ArrayList<User> getUsersByIds(String[] userIds) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<User> allUsers = getAllUsers();

        for (String userId : userIds) {
            for (User u : allUsers) {
                if (u.getId().equals(userId)) {
                    users.add(u);
                    break;
                }
            }
        }
        return users;
    }

    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(DatabaseUtils.userFilePath)) {

            String line;
            // Skip the header
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;
                
                User user = getUserWithAccountRoleAndBookings(line);
                // add account role
                
                if (user != null) {
                    users.add(user);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
    
    private User getUserWithAccountRoleAndBookings(String userCSV) {
    	User user = new User(userCSV);
    	
    	String accountRoleRow = getAccountRoleRowById(user.getAccountRole().getId());
    	AccountRole accountRole = new AccountRole(accountRoleRow);
    	user.setAccountRole(accountRole);
    	
    	String user_id = user.getId(); 
    	 	
    	//ArrayList<Booking> invitedBookings = getInvitedBookingsByUserId(user_id);
    	ArrayList<Booking> hostBookings = getHostBookingsByUserId(user_id);

    	//ArrayList<Booking> allBookings = new ArrayList<>(invitedBookings);
    	//allBookings.addAll(hostBookings);
    	
    	user.setBookings(hostBookings); // we only need the user's hosted bookings
    	return user;
    }
    
    private String getAccountRoleRowById(String id) {
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(DatabaseUtils.accountRolesFilePath.toString()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length > 0 && parts[0].equals(id)) {
                    return line; // return full row
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    	return null;
    };

  
    private String bookingToCsvLine(Booking b) {
        // convert Booking fields → CSV line string
        return "";
    }

    //function for creating a user into the userDB
    public User createAccount(User user)
    {
        //checking whether the email address is taken
        if (isEmailTaken(user.getEmail()))
        {
            //display an alert box
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Email address is already in use!");
            alert.show();

            return null;

        }
        else {
            //generate the random id
            
            String newUserInfo = user.toCSVRow();

            System.out.println("Writing new user to: " + DatabaseUtils.userFilePath.toString());
            //append to the end of the csv
            try (
                FileWriter filewriter = new FileWriter(DatabaseUtils.userFilePath.toString(), true);
                PrintWriter printwriter = new PrintWriter(filewriter))
                {
                    //adding the new line to the file
                    printwriter.println(newUserInfo);

                    System.out.println("file written");
                }
                 catch (IOException e) {
                e.printStackTrace();
                return null;
            }

                return user;

        }
    }

    //login
    public User signIn(String email, String password)
    {
        //checking whether the user is a valid one
        User user = validateAndGetUser(email, password);

        if (user != null) {

            String accountType = user.getAccountRole().getRoleName();
            return user;
           // UsersDatabaseUtils.changeScene(event, "HomePage.fxml", "Home", user.getEmail(), accountType);
        } else {

//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("Invalid credentials entered.");
//            alert.show();
        	// moved to controller
            return null;
        }
    }

    //helper function for validating credentials
    public boolean validateCredentials(String email, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader(DatabaseUtils.userFilePath.toString()))) {
            String line;

            //skip line 1
            br.readLine();

            //check all lines of the db
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";", -1);


                if (values.length > 4) {
                    String emailInFile = values[3];
                    String passwordInFile = values[4];


                    if (emailInFile.equalsIgnoreCase(email) && passwordInFile.equals(password)) {
                        //validate
                        return true;
                    }
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }


        return false;
    }

    //helper function for checking whether the email address is already taken
    public boolean isEmailTaken(String email) {

        try (BufferedReader br = new BufferedReader(new FileReader(DatabaseUtils.userFilePath.toString()))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] values = line.split(";", -1);


                if (values.length > 3) {
                    String emailInFile = values[3];

                    if (emailInFile.equalsIgnoreCase(email)) {

                        return true;
                    }
                }
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
        return false;
    }

    //helper function to get userID
    public String getUserID(String email, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader(DatabaseUtils.userFilePath.toString()))) {
            String line;

            //skip line 1
            br.readLine();

            //check all lines of the db
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";", -1);


                if (values.length > 4) {
                    String emailInFile = values[3];
                    String passwordInFile = values[4];


                    if (emailInFile.equalsIgnoreCase(email) && passwordInFile.equals(password)) {
                        //validate
                        return values[0]; //the user ID
                    }
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }


        return null;
    }

    public User validateAndGetUser(String email, String password) {
        //if whitespace was entered in the email, remove it
        String cleanEmail = email.trim();
        //String cleanPassword = password.trim();
        System.out.println("looking for " + email + " " + password);

        try (BufferedReader br = new BufferedReader(new FileReader(DatabaseUtils.userFilePath.toString()))) {
            String line;
            //br.readLine(); // skip line 1

            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;


                String[] values = line.split(",", -1);

                if (values.length > 4) {
                    String emailInFile = values[3].trim();
                    String passwordInFile = values[4].trim();


                    if (emailInFile.equalsIgnoreCase(cleanEmail) && passwordInFile.equals(password)) {

                    	return getUserWithAccountRoleAndBookings(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }



	@Override
	public User updateAdmin(User user, Boolean isAdmin) {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public ArrayList<AccountRole> getAccountRoles() {
	    ArrayList<AccountRole> roles = new ArrayList<>();


	    try (BufferedReader br = new BufferedReader(new FileReader(DatabaseUtils.accountRolesFilePath.toString()))) {
	        String line;

	        while ((line = br.readLine()) != null) {
	            if (line.trim().isEmpty()) continue;

	            AccountRole role = new AccountRole(line);

	            roles.add(role);
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return roles;
	}






	@Override
	public ArrayList<Room> getAllRooms() {
		        ArrayList<Room> rooms = new ArrayList<>();

		        try {
		            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Path.of(DatabaseUtils.roomsFilePath.toString())));

		            for (int i = 0; i < lines.size(); i++) {
		                String line = lines.get(i);
		                Room room = new Room(line); 
		                rooms.add(room);
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        return rooms;
		    
	}




	@Override
	public Room upsertRoom(Room room) {
		 try {
			 	System.out.println("upserting room: " + room.toCSVRow());
		        List<String> lines = new ArrayList<>();

		        if (Files.exists(DatabaseUtils.roomsFilePath)) {
		            lines = Files.readAllLines(DatabaseUtils.roomsFilePath);
		        }

		        String targetId = room.getRoomId();
		        boolean updated = false;

		        // find row with the same id
		        for (int i = 0; i < lines.size(); i++) {
		            String[] parts = lines.get(i).split(",");

		            if (parts.length > 0 && parts[0].equals(targetId)) {
		            	System.out.println("going to update!");
		                // update if found
		                lines.set(i, room.toCSVRow());
		                updated = true;
		                break;
		            }
		        }

		        // insert if this is not an update
		        if (!updated) {
		            lines.add(room.toCSVRow());
	            	System.out.println("going to insert!");

		        }

		        // we need to rewrite the whole file for an update :/
		        Files.write(
		        	DatabaseUtils.roomsFilePath,
		            lines,
		            StandardOpenOption.CREATE,
		            StandardOpenOption.TRUNCATE_EXISTING
		        );

		        return room;

		    } catch (IOException ex) {
		        ex.printStackTrace();
		        return null;
		    }
	}


	@Override
	public Room removeRoom(String roomId) {
	    try {
	        if (!Files.exists(DatabaseUtils.roomsFilePath)) {
	            return null; //no db
	        }

	        List<String> lines = Files.readAllLines(DatabaseUtils.roomsFilePath);
	        Room removedRoom = null;

	        // find room to remove
	        for (int i = 0; i < lines.size(); i++) {
	            String[] parts = lines.get(i).split(",");
	            if (parts.length > 0 && parts[0].equals(roomId)) {
	                removedRoom = new Room(lines.get(i)); // get room that is being removed
	                lines.remove(i);
	                break;
	            }
	        }

	        // rewrite the csv without the line we are removing
	        Files.write(
	            DatabaseUtils.roomsFilePath,
	            lines,
	            StandardOpenOption.CREATE,
	            StandardOpenOption.TRUNCATE_EXISTING
	        );
	        
	        System.out.println("removed " + removedRoom.getRoomName());

	        return removedRoom;

	    } catch (IOException ex) {
	        ex.printStackTrace();
	        return null;
	    }
	}




	@Override
	public ArrayList<Booking> getBookingsByRoomAndDate(String roomId, LocalDate date) {
	    ArrayList<Booking> bookings = new ArrayList<>();
	    Path path = DatabaseUtils.bookingFilePath;

	    if (!Files.exists(path)) {
	        return bookings; // return empty list if file doesn't exist
	    }

	    try (BufferedReader br = Files.newBufferedReader(path)) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            if (line.isBlank()) continue; // skip empty lines
	            Booking booking;
	            try {
	                booking = new Booking(line);
	            } catch (Exception ex) {
	                System.err.println("Failed to parse booking: " + line);
	                continue; // skip invalid rows
	            }

	            if (booking.getRoomId().equals(roomId) &&
	                !booking.getEndTime().toLocalDate().isBefore(date) &&
	                !booking.getStartTime().toLocalDate().isAfter(date)) {
	                // the booking occurs on the given date
	                bookings.add(booking);
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return bookings;
	}
	
	
	@Override
	public Payment createRecord(Payment payment) {
		 try {
			 	System.out.println("creating record payment: " + payment.toCSVRow());
		        List<String> lines = new ArrayList<>();

		        if (Files.exists(DatabaseUtils.paymentsFilePath)) {
		            lines = Files.readAllLines(DatabaseUtils.paymentsFilePath);
		        }

		        String targetId = payment.getId();
		        boolean new_record = true;

		        // find row with the same id
		        for (int i = 0; i < lines.size(); i++) {
		            String[] parts = lines.get(i).split(",");

		            if (parts.length > 0 && parts[0].equals(targetId)) {
		            	System.out.println("not a new record");
		                // update if found
		                lines.set(i, payment.toCSVRow());
		                new_record = false;
		                break;
		            }
		        }

		        // insert if this is not an update
		        if (!new_record) {
		            lines.add(payment.toCSVRow());
	            	System.out.println("going to insert!");

		        }

		        // we need to rewrite the whole file for an update :/
		        Files.write(
		        	DatabaseUtils.paymentsFilePath,
		            lines,
		            StandardOpenOption.CREATE,
		            StandardOpenOption.TRUNCATE_EXISTING
		        );

		        return room;

		    } catch (IOException ex) {
		        ex.printStackTrace();
		        return null;
		    }
	}
	
	public boolean validatePayment(Payment payment) {
		boolean valid_payment_record = true;

	    if (payment == null) {
	    	valid_payment_record = false;
	        throw new IllegalArgumentException("Payment cannot be null");
	    }

	    // Validate id
	    if (payment.getId().trim().isEmpty()) {
	    	valid_payment_record = false;
	        throw new IllegalArgumentException("Payment id cannot be null or blank");
	    }

	    // Validate amount
	    if (payment.getAmount() <= 0.0) {
	    	valid_payment_record = false;
	        throw new IllegalArgumentException("Amount must be greater than 0");
	    }

	    // Validate last digits / card number
	    String cardNumber = payment.getCardNumber();
	    if (cardNumber.trim().isEmpty()) {
	    	valid_payment_record = false;
	        throw new IllegalArgumentException("Card digits cannot be null or blank");
	    }
	    if (!cardNumber.matches("\\d+")) {
	    	valid_payment_record = false;
	        throw new IllegalArgumentException("Card digits must contain only numbers");
	    }
	    if (cardNumber.length() >= 13 && !isValidLuhn(cardNumber)) {
	    	valid_payment_record = false;
	        throw new IllegalArgumentException("Invalid card number (failed Luhn check)");
	    }

	    // Validate userId
	    if (payment.getUserId().trim().isEmpty()) {
	    	valid_payment_record = false;
	        throw new IllegalArgumentException("User ID cannot be null or blank");
	    }
	    
	    return valid_payment_record;
	}
	
	private static boolean isValidLuhn(String cardNumber) {
	    int sum = 0;
	    boolean alternate = false;

	    for (int i = cardNumber.length() - 1; i >= 0; i--) {
	        int n = cardNumber.charAt(i) - '0';

	        if (alternate) {
	            n *= 2;
	            if (n > 9) {
	                n = (n % 10) + 1;
	            }
	        }

	        sum += n;
	        alternate = !alternate;
	    }

	    return (sum % 10 == 0);
	}
}