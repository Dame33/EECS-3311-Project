package org.openjfx.EECS_3311_Project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openjfx.EECS_3311_Project.managers.*;
import org.openjfx.EECS_3311_Project.model.*;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class Mediator {

    private static Mediator instance;
//
//    private Session session;
    	private final BookingManager bookingManager = new BookingManager();
     private final UserManager userManager = new UserManager();
     private final AccountRoleManager accountRoleManager = new AccountRoleManager();
     private final RoomManager roomManager = new RoomManager();
     private final PaymentManager paymentManager = new PaymentManager();
     
     
     public static Mediator getInstance() {
 		
 		if (instance == null) instance = new Mediator();
 		return instance;
 		
 	}
     /// user
	
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
	
	public List<User> getAllUsers() {
		return userManager.getAllUsers();
	}
	
	public User getUserById(String userId) {
		return userManager.getUserById(userId);
	}
	
	/// account role

	public List<AccountRole> getAccountRoles() {
		return accountRoleManager.getAccountRoles();
	}
	/// room
	public List<Room> getAllRooms() {
		return roomManager.getAllRooms();
	}

	public Room upsertRoom(Room room) {
		return roomManager.upsertRoom(room);
		
	}


	public Room removeRoom(Room room) {
		return roomManager.removeRoom(room);
		
	}
	/// booking
	public List<Booking> getBookingsByRoomAndDate(String roomId, LocalDate date) {
		return bookingManager.getBookingsByRoomAndDate(roomId,  date);
	}

	
	public Booking saveBooking(Booking booking) {
        return bookingManager.upsertBooking(booking);
    }
	
	public List<Booking> getAllHostBookings(String userId)
	{
		return bookingManager.getAllHostBookings(userId);
	}
	public List<Booking> getAllInvitedBookings(String userId)
	{
		return bookingManager.getAllInvitedBookings(userId);
	}

	public Booking getBookingById(String bookingId) {
		return bookingManager.getBookingById(bookingId);
	}

	public AccountRole getAccountRoleRowById(String id) {
		return accountRoleManager.getAccountRoleById(id);
	}

	public boolean validatePayment(String cardNum) {
		return paymentManager.isValidLuhn(cardNum);
		
	}

	public List<User> getPossibleInvitees(String id) {
		return userManager.getAllUsersNotId(id);
	}

	public User saveUser(User user) {
		return userManager.saveUser(user);
		
	}

	public List<User> getManyUsersByIds(List<String> attendeeIds) {
		return userManager.getManyByIds(attendeeIds);
	}

	public LocalDateTime getLastestEndTime(String roomId, LocalDateTime endTime) {
		return bookingManager.getLatestEndTime(roomId,endTime );
	}

	public Booking cancelBooking(Booking booking) {
		return bookingManager.cancelBooking(booking);
		
	}
	
	public UserManager getUserManager() {
	    return userManager;
	}

	public void toggleAdmin(User user, boolean isAdmin) {
		if(isAdmin) user.setUserType("Admin");
		if(!isAdmin) user.setUserType("User");
		
		userManager.saveUser(user);

	}

	public Payment createPaymentRecord(Payment payment) {
		return paymentManager.createRecord(payment);
		
	}
	

	
}
