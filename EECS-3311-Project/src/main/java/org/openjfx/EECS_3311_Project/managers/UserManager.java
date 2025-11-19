package org.openjfx.EECS_3311_Project.managers;

import java.util.ArrayList;

import org.openjfx.EECS_3311_Project.CSVAdapter;
import org.openjfx.EECS_3311_Project.ICSVRepository;
import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.User;

public class UserManager {
	
	ICSVRepository csvRepository = CSVAdapter.getInstance();

	public User createAccount(User user) {
		// TODO Auto-generated method stub
		return csvRepository.createAccount(user);
	}

	public boolean isEmailTaken(String text) {
		return csvRepository.isEmailTaken(text);
	}

	public User signIn(String email, String password) {
		return csvRepository.signIn(email, password);
	}

	public ArrayList<AccountRole> getAccountRoles() {
		return csvRepository.getAccountRoles();
	}


}
