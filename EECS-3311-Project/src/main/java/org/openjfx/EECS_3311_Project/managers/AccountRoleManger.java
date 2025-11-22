package org.openjfx.EECS_3311_Project.managers;
import org.openjfx.EECS_3311_Project.model.AccountRole;

import java.util.List;

import org.openjfx.EECS_3311_Project.csv.AccountRoleCSVOperations;

public class AccountRoleManger {
	
	AccountRoleCSVOperations rolesCSV = new AccountRoleCSVOperations();

	public List<AccountRole> getAccountRoles() {
		return rolesCSV.readAll();
	}
}
