package org.openjfx.EECS_3311_Project.csv;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openjfx.EECS_3311_Project.DatabaseUtils;
import org.openjfx.EECS_3311_Project.UserFactory;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.User;

public class UserCSVOperations extends CSVOperations<User>{

	@Override
	protected Path getCSVPath() {
		return DatabaseUtils.userFilePath;
	}

	@Override
	protected String[] toColumns(User user) {
	    // serialize bookings
	    String bookings = "";
	    if (user.getBookings() != null && !user.getBookings().isEmpty()) {
	        bookings = user.getBookings().stream().map(Booking::getId) .collect(Collectors.joining(";"));
	    }

	    String accountRoleId = user.getAccountRole() != null ? user.getAccountRole().getId() : "";

	    return new String[] {
	        safe(user.getId()),
	        safe(user.getFirstName()),
	        safe(user.getLastName()),
	        safe(user.getEmail()),
	        safe(user.getPassword()),
	        safe(user.getUserType()),
	        "[" + bookings + "]",
	        accountRoleId
	    };
	}

	@Override
	protected List<User> parseLines(List<String> lines) {
		List<User> users = new ArrayList<User>();
		for(String l : lines) {
			users.add(UserFactory.loadFromCSV(l));
		}
		return users;
	}



}
