package org.openjfx.EECS_3311_Project;

import java.util.UUID;

import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.User;

import javafx.event.ActionEvent;

public class Mediator {

    private static Mediator instance;
//
//    private Session session;
//    private final BookingManager bookingManager;
    // private final RoomManager roomManager;
     private final UserManager userManager = new UserManager();
    // private final PaymentManager paymentManager;
     
     
     public static Mediator getInstance() {
 		
 		if (instance == null) instance = new Mediator();
 		return instance;
 		
 	}
	
	public User createAccount(String password, String email, AccountRole accountRole, String firstName, String lastName, String userType) {
		
		String id = UUID.randomUUID().toString();
		User user = new User(id, firstName,lastName,email,password,userType,accountRole);
		return userManager.createAccount(user); 
	}

	public boolean isEmailTaken(String text) {
		return userManager.isEmailTaken(text);
	}

	public User signIn( String email, String password) {
		return userManager.signIn(email, password);
		
	}
	
	

	
}
