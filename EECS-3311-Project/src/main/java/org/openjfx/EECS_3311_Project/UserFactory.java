package org.openjfx.EECS_3311_Project;

import java.util.ArrayList;
import java.util.Arrays;
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

	    // Trim all columns
	    String[] cols = Arrays.stream(csvRow.split(",", -1)).map(String::trim).toArray(String[]::new);

	    user.setId(cols[0]);
	    user.setFirstName(cols[1]);
	    user.setLastName(cols[2]);
	    user.setEmail(cols[3]);
	    user.setPassword(cols[4]);
	    user.setUserType(cols[5]);

	    // Clean and split bookings
	    String rawBookings = cols[6].replace("[", "").replace("]", "").trim();
	    String[] bookingIds = rawBookings.isEmpty()
	            ? new String[0]
	            : rawBookings.split(";");

	    Mediator mediator = Mediator.getInstance();

	    for (String bookingId : bookingIds) {
	        if (bookingId.isBlank()) continue;

	        Booking booking = mediator.getBookingById(bookingId.trim());
	        if (booking != null) {
	            user.addBooking(booking);
	        }
	    }

	    AccountRole accountRole =
	            mediator.getAccountRoleRowById(cols[7].trim());
	    user.setAccountRole(accountRole);

	    return user;
	}

}
