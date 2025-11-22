package org.openjfx.EECS_3311_Project.managers;
import org.openjfx.EECS_3311_Project.model.AccountRole;
import java.util.List;
import java.util.Optional;

import org.openjfx.EECS_3311_Project.csv.AccountRoleCSVOperations;

public class AccountRoleManager {
	
	AccountRoleCSVOperations rolesCSV = new AccountRoleCSVOperations();

	public List<AccountRole> getAccountRoles() {
		return rolesCSV.readAll();
	}

	public AccountRole getAccountRoleById(String id) {
		Optional<AccountRole> roleOpt = rolesCSV.readById(id);
		if (roleOpt.isPresent()) return roleOpt.get();
		return null;
	}
	
	
	public AccountRole upsertAccountRole(AccountRole role) {
		return rolesCSV.upsert(role);
		
	}
	
	public AccountRole removeAccountRole(AccountRole role) {
		rolesCSV.delete(role);
		return role;
		
	}
}
