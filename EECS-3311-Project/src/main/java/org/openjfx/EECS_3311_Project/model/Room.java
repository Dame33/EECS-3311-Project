package org.openjfx.EECS_3311_Project.model;

import java.util.UUID;

public class Room implements ICSVDataObject{
	private String id;
    private String buildingName;
    private String roomName;
    private int capacity;
    public boolean isActive;
    
    public Room(String csvRow) {
        // id,roomName,isActive,capacity,buildingName
        String[] tokens = csvRow.split(",");
        this.id = tokens[0];
        this.roomName = tokens[1];
        this.isActive = Boolean.parseBoolean(tokens[2]);
        this.capacity = Integer.parseInt(tokens[3]);
        this.buildingName = tokens[4];
    }
    
    
    public String getId() {
		return id;
	}

	public void setId(String roomId) {
		this.id = roomId;
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
        this.id = roomId;
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.capacity= capacity;
        this.isActive = true;
    }
	
	public Room(String buildingName, String roomName, int capacity, boolean isActive) {
		// no id
		this.id = UUID.randomUUID().toString();
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.capacity= capacity;
        this.isActive = true;
    }


	@Override
	public String toCSVRow() {
		//1,Room 101,true,50,Building A
		// id, roomname,isactive,capactity,buildingname
		return String.join(",", this.id, this.roomName, ""+this.isActive, ""+this.capacity, this.buildingName);
	}
}
