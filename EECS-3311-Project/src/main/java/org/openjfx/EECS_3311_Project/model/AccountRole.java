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
	    if (csvRow == null || csvRow.trim().isEmpty()) {
	        throw new IllegalArgumentException("Empty CSV row for AccountRole");
	    }

	    String[] parts = csvRow.split(",");
	    if (parts.length != 3) {
	        throw new IllegalArgumentException("Invalid CSV row for AccountRole: " + csvRow);
	    }

	    this.id = parts[0].trim();
	    this.roleName = parts[1].trim();

	    try {
	        this.hourlyRate = Double.parseDouble(parts[2].trim());
	    } catch (NumberFormatException e) {
	        throw new IllegalArgumentException("Invalid hourly rate: " + parts[2]);
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
		return id + "," + roleName + "," + hourlyRate;
	}
	

}
