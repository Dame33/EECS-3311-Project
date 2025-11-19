package org.openjfx.EECS_3311_Project.model;

public class Room {
	private String roomId;
    private String buildingName;
    private String roomName;
    private int capacity;
    public boolean isActive;
    
    public Room(String csvRow) {
        // id,roomName,isActive,capacity,buildingName
        String[] tokens = csvRow.split(",");
        this.roomId = tokens[0];
        this.roomName = tokens[1];
        this.isActive = Boolean.parseBoolean(tokens[2]);
        this.capacity = Integer.parseInt(tokens[3]);
        this.buildingName = tokens[4];
    }
    
    public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Room(String roomId, String buildingName, String roomName, int capacity, boolean isActive) {
        this.roomId = roomId;
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.capacity= capacity;
        this.isActive = true;
    }
}
