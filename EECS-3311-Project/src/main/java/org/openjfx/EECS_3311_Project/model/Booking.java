package org.openjfx.EECS_3311_Project.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Booking implements ICSVDataObject {
    private String id;
    private String roomId;
    private String name;
    private Boolean isCheckedIn;
    private String hostId;                 // store host as id only
    private List<String> attendeeIds;      // store attendees as user ids
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime checkInTime;
	private String studentOrOrganizationId;
	private boolean cancelled = false;
    
    public Booking(String csvRow) {
        String[] tokens = csvRow.split(",");

        this.id = tokens[0].trim();
        this.roomId = tokens[1].trim();
        this.name = tokens[2].trim();
        this.isCheckedIn = tokens[3].trim().isEmpty() ? null : Boolean.parseBoolean(tokens[3].trim());

        this.hostId = tokens[4].trim();

        this.attendeeIds = new ArrayList<>();
        String attendeeList = tokens[5].trim();
        if (!"[]".equals(attendeeList)) {
            String attendeeLine = attendeeList.substring(1, attendeeList.length() - 1).trim(); // remove brackets
            String[] ids = attendeeLine.split(";");
            for (String id : ids) {
                this.attendeeIds.add(id.trim());
            }
        }

        this.startTime = LocalDateTime.parse(tokens[6].trim());
        this.endTime = LocalDateTime.parse(tokens[7].trim());

        String checkInToken = tokens[8].trim();
        this.checkInTime = checkInToken.isEmpty() ? null : LocalDateTime.parse(checkInToken);

        this.studentOrOrganizationId = tokens[9].trim();

        if (tokens.length > 10 && !tokens[10].trim().isEmpty()) {
        	this.cancelled = Boolean.parseBoolean(tokens[10].trim());
        } 
        else {
        	this.cancelled = false;
        }
    }


    public Booking(String roomId, String hostId, LocalDateTime startTime, LocalDateTime endTime, String paymentId) {
    	this.id = UUID.randomUUID().toString();
    	this.roomId = roomId;
    	this.name = "New Meeting";
    	this.isCheckedIn = false;
    	this.hostId = hostId;
        this.attendeeIds = new ArrayList<String>();
        this.startTime = startTime;
        this.endTime = endTime;
        this.checkInTime = null;
        this.studentOrOrganizationId = "";
        this.cancelled = false;
    }

    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getRoomId() {
		return roomId;
	}


	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Boolean getIsCheckedIn() {
		return isCheckedIn;
	}


	public void setIsCheckedIn(Boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
	}


	public String getHostId() {
		return hostId;
	}


	public void setHostId(String hostId) {
		this.hostId = hostId;
	}


	public List<String> getAttendeeIds() {
		return attendeeIds;
	}


	public void setAttendeeIds(List<String> attendeeIds) {
		this.attendeeIds = attendeeIds;
	}


	public LocalDateTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}


	public LocalDateTime getEndTime() {
		return endTime;
	}


	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}


	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}


	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	
    public String toCSVRow() {
        String attendees = "[]";
        if (!attendeeIds.isEmpty()) {
            attendees = "[" + String.join(";", attendeeIds) + "]";
        }
        String checkedInStr = isCheckedIn != null ? isCheckedIn.toString() : "";
        String checkedTime = checkInTime != null ? checkInTime.toString() : "";

        return String.join(",", id, roomId, name, checkedInStr, hostId, attendees,
                startTime.toString(), endTime.toString(), checkedTime, studentOrOrganizationId, Boolean.toString(cancelled));
    }
    
    public double calculateDepositPrice(AccountRole user_type, Duration duration) {
    	if (duration.toMinutes() < 60) {
        	return user_type.getHourlyRate() / 2;
    	} else {
        	// req says user is charged 1 hour deposit fee upfront
        	return user_type.getHourlyRate();
    	}
    } 
    
    public double calculateTotalPrice(AccountRole user_type) {
    	// this is called when user checks in, so  subtract 1 hour from fee since it's been paid already.
    	
     	LocalDateTime start = this.getStartTime(); 
    	LocalDateTime end = this.getEndTime();
    	
    	long roundedHours = (long) Math.ceil(Duration.between(start, end).toMinutes() / 60.0);

    	Duration roundedDuration = Duration.ofHours(roundedHours);
   
    	long hours = roundedDuration.toHours();
    	return user_type.getHourlyRate() * (hours -1);
    }
    
    public double calculateExtendPrice(AccountRole user_type, Duration extension) {
    	// this is called when user checks in, so  subtract 1 hour from fee since it's been paid already.
    	long hours = extension.toHours();
    	return user_type.getHourlyRate() * (hours -1);
    	
    }

	public String getStudentOrOrganizationId() {
		return studentOrOrganizationId;
	}


	public void setStudentOrOrganizationId(String studentOrOrganizationId) {
		this.studentOrOrganizationId = studentOrOrganizationId;
	}


	public void checkIn() {
		this.setIsCheckedIn(true);
		this.setCheckInTime(LocalDateTime.now());
	}
	public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
