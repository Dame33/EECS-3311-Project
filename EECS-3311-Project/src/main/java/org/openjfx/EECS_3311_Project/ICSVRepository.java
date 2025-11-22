package org.openjfx.EECS_3311_Project;

import javafx.event.ActionEvent;

import java.time.LocalDate;
import java.util.ArrayList;

import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.Payment;
import org.openjfx.EECS_3311_Project.model.Room;
import org.openjfx.EECS_3311_Project.model.User;

public interface ICSVRepository {

    Booking upsertBooking(Booking booking);
    String cancelBooking(String bookingId);
    ArrayList<Booking> getHostBookingsByUserId(String userId);
    ArrayList<Booking> getInvitedBookingsByUserId(String userId);

    User getUserById(String userId);
    

//    User createUser(ActionEvent event, String firstName, String lastName, String email, String password, String userType, String accountType);
//    void signIn(ActionEvent event, String email, String password);
//    boolean validateCredentials(String email, String password);
//    String getUserID(String email, String password);
    
    // update to match uml
    User createAccount(User user);
    User signIn(String email, String password);
    ArrayList<User> getAllUsers(); 
    User updateAdmin(User user, Boolean isAdmin);
	boolean isEmailTaken(String text);
	ArrayList<AccountRole> getAccountRoles();
	ArrayList<Room> getAllRooms();
	Room upsertRoom(Room room);
	Room removeRoom(String roomId);
	ArrayList<Booking> getBookingsByRoomAndDate(String roomId, LocalDate date);
	Payment createRecord(Payment payment);
	boolean validatePayment(Payment payment);
}