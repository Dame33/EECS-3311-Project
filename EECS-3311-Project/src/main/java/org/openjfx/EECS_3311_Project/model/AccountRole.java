package org.openjfx.EECS_3311_Project.model;

public class AccountRole implements ICSVDataObject{
	
	private String id;
	private String roleName;
	private Double hourlyRate;
	
	public AccountRole(String name, String id, Double hourlyRate) {
		this.id = id;
		this.roleName = name;
		this.hourlyRate = hourlyRate;
	}
	public AccountRole() {
	}
	

	public AccountRole(String csvRow) {
		String[] parts=csvRow.split(",");
		try{
			this.id = parts[0];
			this.roleName= parts[1];
			this.hourlyRate = Double.parseDouble(parts[2]);
		}
		catch(Exception e) {
			throw new IllegalArgumentException("Invalid CSV row: " + csvRow);
		}
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

	@Override
	public String toString() {
		return roleName;
	}
	@Override
	public String toCSVRow() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
