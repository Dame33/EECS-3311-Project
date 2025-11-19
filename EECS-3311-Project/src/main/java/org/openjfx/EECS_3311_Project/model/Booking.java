package org.openjfx.EECS_3311_Project.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Booking {
	private String id;
    private String roomId;
    private String name;
    private Boolean isCheckedIn;
    private User host;
    private ArrayList<User> attendees;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime checkInTime;
    private Status status;
    
	public Booking(String id, String roomId, String name, Boolean isCheckedIn, User host, ArrayList<User> attendees, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime checkInTime, Status status) {
		this.id = id;
		this.roomId = roomId;
	    this.name = name;
	    this.isCheckedIn = isCheckedIn;
	    this.host= host;
	    this.attendees = attendees;
	    this.startTime = startTime;
	    this.endTime = endTime;
	    this.checkInTime = checkInTime;
	    this.status = status;
    }
	
	public Booking(String roomId, String name, Boolean isCheckedIn, User host, ArrayList<User> attendees, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime checkInTime) {
		this.id = UUID.randomUUID().toString();
		this.roomId = roomId;
	    this.name = name;
	    this.isCheckedIn = isCheckedIn;
	    this.host= host;
	    this.attendees = attendees;
	    this.startTime = startTime;
	    this.endTime = endTime;
	    this.checkInTime = checkInTime;
	    this.status = Status.ACTIVE;
    }
	
	public String getId()
	{
		return this.id;
	}

	public String getRoomId() {
		return roomId;
	}
	
	public void setActive() {
		this.isCheckedIn = true;
	}
	
	public void setInactive() {
		this.isCheckedIn = false;
	}
	
	public String getHostUserId() {
		return host.getId();
	}
	
	public ArrayList<String> getInvitedUserIds() {
		ArrayList<String> ids = new ArrayList<>();
		
        for (User user : attendees) {
        	String user_id = user.getId();
            ids.add(user_id);
        }
		
		return ids;
	}
}
