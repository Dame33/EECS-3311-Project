package org.openjfx.EECS_3311_Project.model;

public class Room {
	private String roomId;
    private String buildingName;
    private String roomName;
    private int capacity;
    public boolean isActive;
    
    public Room(String roomId, String buildingName, String roomName, int capacity, boolean isActive) {
        this.roomId = roomId;
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.capacity= capacity;
        this.isActive = true;
    }
}
