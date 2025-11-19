package org.openjfx.EECS_3311_Project.model;

public class AccountRole {
	
	private String id;
	private String roleName;
	private Double hourlyRate;
	
	public AccountRole(String name, String id, Double hourlyRate) {
		this.id = id;
		this.roleName = name;
		this.hourlyRate = hourlyRate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	

}
