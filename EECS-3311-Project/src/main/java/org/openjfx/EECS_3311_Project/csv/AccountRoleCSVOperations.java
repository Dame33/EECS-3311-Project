package org.openjfx.EECS_3311_Project.csv;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.openjfx.EECS_3311_Project.DatabaseUtils;
import org.openjfx.EECS_3311_Project.model.AccountRole;

public class AccountRoleCSVOperations extends CSVOperations<AccountRole>{

	@Override
	protected Path getCSVPath() {
		return DatabaseUtils.accountRolesFilePath;
	}

	@Override
	protected String[] toColumns(AccountRole role) {
	    return new String[] {safe(role.getId()),safe(role.getRoleName()),role.getHourlyRate() == null ? "0.0" : Double.toString(role.getHourlyRate())};
	}
	
	@Override
	protected List<AccountRole> parseLines(List<String> lines) {
		List<AccountRole> roles = new ArrayList<AccountRole>();
		for(String l : lines) {
			roles.add(new AccountRole(l));
		}
		return roles;
	}



}
