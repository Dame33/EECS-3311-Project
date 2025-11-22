package org.openjfx.EECS_3311_Project;

import java.util.ArrayList;
import java.util.UUID;

import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.User;

public class UserFactory {
	/*
	 * Creates a user either...:
	 * 1. from a csv (load user), hydrate the user with bookings and account role
	 * 2. new user, generate UUID
	 */
	
	public static User createNew(String first, String last, String email, String password, AccountRole accountRole) {
		User user = new User();
		user.setFirstName(first);
		user.setLastName(last);
		user.setEmail(email);
		user.setUserType("User"); // by default, all new users are users
		user.setPassword(password);
		String id = UUID.randomUUID().toString();
		user.setId(id);
		user.setAccountRole(accountRole);
		
		return user;	
	}
	// maybe its bad that we are calling a repository from the factory, but i think its cleanest this way: only have to worry about one method call to make/load a user
	public static User loadFromCSV(String csvRow) {
		User user = new User();
		String[] cols = csvRow.split(",", -1); // -1 keeps empty spaces
		String id = cols[0].trim();
        String firstName = cols[1].trim();
        String lastName = cols[2].trim();
        String email = cols[3].trim();
        String password = cols[4].trim();
        String userType = cols[5].trim();
       
        String[] bookingIds = cols[6].trim().replace("[", "").replace("]", "").split(";",0);
        String accountRoleId = cols[7].trim();
        
        user.setId(id);
        user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setUserType(userType);
		
		// hydrate the user with bookings and account role
		ICSVRepository csv = CSVRepository.getInstance();
		
		for (String bookingId : bookingIds){
			Booking booking = csv.getBookingById(bookingId);
			user.addBooking(booking);
		}
		
		String accountRoleRow = csv.getAccountRoleRowById(user.getAccountRole().getId());
    	AccountRole accountRole = new AccountRole(accountRoleRow);
    	user.setAccountRole(accountRole);
		
		return user;
	}

}
