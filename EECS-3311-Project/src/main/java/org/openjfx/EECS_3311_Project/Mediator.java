package org.openjfx.EECS_3311_Project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openjfx.EECS_3311_Project.managers.BookingManager;
import org.openjfx.EECS_3311_Project.managers.UserManager;
import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.Room;
import org.openjfx.EECS_3311_Project.model.User;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class Mediator {

    private static Mediator instance;
//
//    private Session session;
    	private final BookingManager bookingManager = new BookingManager();
     private final UserManager userManager = new UserManager();
     private final RoomManager roomManager = new RoomManager();
    // private final PaymentManager paymentManager;
     
     
     public static Mediator getInstance() {
 		
 		if (instance == null) instance = new Mediator();
 		return instance;
 		
 	}
	
	public User createAccount(String password, String email, AccountRole accountRole, String firstName, String lastName) {
		User user = UserFactory.createNew(firstName,lastName,email,password,accountRole);
		return userManager.createAccount(user); 
	}

	public boolean isEmailTaken(String text) {
		return userManager.isEmailTaken(text);
	}

	public User signIn( String email, String password) {
		return userManager.signIn(email, password);
		
	}

	public List<AccountRole> getAccountRoles() {
		return userManager.getAccountRoles();
	}

	public List<Room> getAllRooms() {
		return roomManager.getAllRooms();
	}

	public Room upsertRoom(Room room) {
		return roomManager.upsertRoom(room);
		
	}

	public Room removeRoom(Room room) {
		return roomManager.removeRoom(room);
		
	}

	public ArrayList<Booking> getBookingsByRoomAndDate(String roomId, LocalDate date) {
		return bookingManager.getBookingsByRoomAndDate(roomId,  date);
	}
	
	

	
}
