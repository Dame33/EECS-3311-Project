package org.openjfx.EECS_3311_Project.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Booking implements ICSVDataObject{
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
    
    
    public Booking(String csvRow) {
        // id, roomId, name, checkedin, host, atds, starttime, endtime, checkintime, status
        String[] tokens = csvRow.split(",");
        this.id = tokens[0];
        this.roomId = tokens[1];
        this.name = tokens[2];
        this.isCheckedIn = tokens[3].isEmpty() ? null : Boolean.parseBoolean(tokens[3]); 

        String hostId = tokens[4];
        this.host = new User();
        this.host.setId(hostId);
        
        //attendees can be empty arraylist
        this.attendees = new ArrayList<>();
        String attendeeList = tokens[5];
        if(!"[]".equals(attendeeList)) { //if list isnt empty
        	String attendeeLine = attendeeList.substring(1, attendeeList.length() - 1); //remove the []
        	String[] attendeeID = attendeeLine.split(";"); //remove ;
        	
        	for(String userId : attendeeID) {
        		String cleanedIds = userId.trim(); //remove whitespace
        		User user = new User();
        		user.setId(hostId);
        		this.attendees.add(user);
        	}
        
        }
        
        this.startTime = LocalDateTime.parse(tokens[6]);
        this.endTime = LocalDateTime.parse(tokens[7]);
        this.checkInTime = LocalDateTime.parse(tokens[8]);
        this.status = Status.valueOf(tokens[9]);
        
        
        
    }
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
	
	public String getId() {
		return id;
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
	
	public User getHost() {
		return host;
	}
	
	public void setHost(User host) {
		this.host = host;
	}
	
	public ArrayList<String> getInvitedUserIds() {
		ArrayList<String> ids = new ArrayList<>();
		
        for (User user : attendees) {
        	String user_id = user.getId();
            ids.add(user_id);
        }
		
		return ids;
	}
	
	public Status getStatus() {
	    return status;
	}

	public void setStatus(Status status) {
	    this.status = status;
	}
	
	public LocalDateTime getStartTime() {
		return startTime;
	}
	
	public void setStartTime(LocalDateTime startTime) {
		this.startTime= startTime;
	}
	
	public LocalDateTime getEndTime() {
		return endTime;
	}
	
	public void setEndTime(LocalDateTime endTime) {
		this.endTime= endTime;
	}
	
	public LocalDateTime getCheckIn() {
		return checkInTime;
	}
	
	public void setCheckIn(LocalDateTime checkInTime) {
		this.checkInTime= checkInTime;
	}
	
	public ArrayList<User> getAttendees() {
	    return attendees;
	}

	public void setAttendees(ArrayList<User> attendees) {
	    this.attendees = attendees;
	}

	@Override
	public String toCSVRow() {
		// TODO Auto-generated method stub
		String hostId = host.getId();
		String atds = "[]";
		ArrayList<String> invitedppl = getInvitedUserIds();
		if(!invitedppl.isEmpty()) {
			atds = "[" + String.join(";", invitedppl)+"]";
			
		}
		String checkedIn = (isCheckedIn != null) ? isCheckedIn.toString():"";
		String start = startTime.toString();
		String end = endTime.toString();
		String checkedTime = (checkInTime != null)? checkInTime.toString(): "";
		String statusString = status.name();
		
		
		
		return String.join(",", id, roomId, name, checkedIn, hostId, atds, start, end, checkedTime, statusString);
	}
	
	
}

