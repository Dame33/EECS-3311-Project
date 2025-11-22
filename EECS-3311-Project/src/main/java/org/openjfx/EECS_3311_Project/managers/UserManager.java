package org.openjfx.EECS_3311_Project.managers;

import java.util.List;
import java.util.Optional;

import org.openjfx.EECS_3311_Project.csv.UserCSVOperations;
import org.openjfx.EECS_3311_Project.model.User;

public class UserManager {
	
	UserCSVOperations userCSV = new UserCSVOperations();

	public User createAccount(User user) {
		return userCSV.create(user);
	}

	public boolean isEmailTaken(String text) {
		Optional<User> userOpt = userCSV.readOne((user, cols) -> user.getEmail().equalsIgnoreCase(text)); // case insenstive - pass a filter to get one user who matches the email
		if (userOpt.isPresent()) return true;
		return false;
	}

	public User signIn(String email, String password) {
		Optional<User> userOpt = userCSV.readOne((user, cols) -> user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password));
		if (userOpt.isPresent()) return userOpt.get();
		return null;
	}
	
	public List<User> getAllUsers() {
		return userCSV.readAll();
	}
	
	public User getUserById(String userId) {
		Optional<User> userOpt = userCSV.readById(userId);
		if (userOpt.isPresent()) return userOpt.get();
		return null;
	}

	public List<User> getAllUsersNotId(String id) {
		return userCSV.readMany((user, cols) -> !user.getId().equals(id));
		
	}

	public User saveUser(User user) {
		return userCSV.upsert(user);
	}


	public List<User> getManyByIds(List<String> attendeeIds) {
		return userCSV.readMany((user, cols) -> attendeeIds.contains(user.getId()));
	}
	
	
	

}


