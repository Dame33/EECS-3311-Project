package org.openjfx.EECS_3311_Project.model;

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
    private Status status;


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

        this.status = Status.valueOf(tokens[9].trim());
    }


    public Booking(String id, String roomId, String name, Boolean isCheckedIn, String hostId, List<String> attendeeIds,
                   LocalDateTime startTime, LocalDateTime endTime, LocalDateTime checkInTime, Status status) {
        this.id = id;
        this.roomId = roomId;
        this.name = name;
        this.isCheckedIn = isCheckedIn;
        this.hostId = hostId;
        this.attendeeIds = attendeeIds != null ? attendeeIds : new ArrayList<>();
        this.startTime = startTime;
        this.endTime = endTime;
        this.checkInTime = checkInTime;
        this.status = status;
    }
    // new booking from the calendar selct page
    public Booking(String roomId,String hostId, LocalDateTime startTime,LocalDateTime endTime) {
    	id = UUID.randomUUID().toString();
    	name = "New Meeting";
    	isCheckedIn = false;
    	attendeeIds = new ArrayList<String>();
    	checkInTime = null;
}


    public Booking(String roomId, String name, 
    				Boolean isCheckedIn,String hostId, 
    				List<String> attendeeIds,
					LocalDateTime startTime,
					LocalDateTime endTime, LocalDateTime checkInTime) {
        this(UUID.randomUUID().toString(), roomId, name, isCheckedIn, hostId, attendeeIds, startTime, endTime, checkInTime, Status.ACTIVE);
    }

    
    public void setActive(){
    	this.status = Status.ACTIVE;
    	
    }
    
    public void setInactive() {
    	this.status = Status.CANCELLED;
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


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	@Override
    public String toCSVRow() {
        String attendees = "[]";
        if (!attendeeIds.isEmpty()) {
            attendees = "[" + String.join(";", attendeeIds) + "]";
        }
        String checkedInStr = isCheckedIn != null ? isCheckedIn.toString() : "";
        String checkedTime = checkInTime != null ? checkInTime.toString() : "";

        return String.join(",", id, roomId, name, checkedInStr, hostId, attendees,
                startTime.toString(), endTime.toString(), checkedTime, status.name());
    }
}
