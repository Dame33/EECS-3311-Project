package org.openjfx.EECS_3311_Project.model;

import java.util.UUID;

public class Room implements ICSVDataObject, Observer {
	private String roomId;
    private String buildingName;
    private String roomName;
    private int capacity;
    public boolean isActive;
    
    private int occupancy = 0;
    private Sensor sensor;
    
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
	
    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = Math.max(0, occupancy);
    }

	public Room(String roomId, String buildingName, String roomName, int capacity, boolean isActive) {
        this.roomId = roomId;
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.capacity= capacity;
        this.isActive = true;
    }
	
	public Room(String buildingName, String roomName, int capacity, boolean isActive) {
		// no id
		this.roomId = UUID.randomUUID().toString();
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.capacity= capacity;
        this.isActive = true;
    }

	public String toCSVRow() {
		//1,Room 101,true,50,Building A
		// id, roomname,isactive,capactity,buildingname
		return String.join(",", this.roomId, this.roomName, ""+this.isActive, ""+this.capacity, this.buildingName);
	}
	
    public void attachScanner(Sensor sensor) {
        if (this.sensor != null) {
            this.sensor.detach(this);
        }
        this.sensor = sensor;
        if (this.sensor != null) {
            this.sensor.attach(this);
        }
    }

	public void update(Sensor sensor, String eventType) {
		if (sensor != this.sensor) return;

        switch (eventType) {
            case "enter":
                if (occupancy < capacity) {
                    occupancy++;
                }
                break;

            case "exit":
                occupancy = Math.max(0, occupancy - 1);
                break;
        }

        System.out.println("Room '" + this.roomName + "' occupancy: " + this.occupancy);
	}
}
