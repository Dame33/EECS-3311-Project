package org.openjfx.EECS_3311_Project.managers;

import java.util.Optional;

import org.openjfx.EECS_3311_Project.csv.UserCSVOperations;
import org.openjfx.EECS_3311_Project.model.User;

public class UserManager {
	
	//ICSVRepository csvRepository = CSVRepository.getInstance();
	UserCSVOperations userCSV = new UserCSVOperations();

	public User createAccount(User user) {
		return userCSV.create(user);
		//return csvRepository.createAccount(user);
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

//	public ArrayList<AccountRole> getAccountRoles() {
//		return csvRepository.getAccountRoles();
//	}


}
