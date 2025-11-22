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
    
    public Booking(String roomId, String hostId, LocalDateTime startTime, LocalDateTime endTime) {
    	this.id = UUID.randomUUID().toString();
    	this.roomId = roomId;
    	this.name = "New Meeting";
    	this.isCheckedIn = false;
    	this.hostId = hostId;
        this.attendeeIds = new ArrayList<String>();
        this.startTime = startTime;
        this.endTime = endTime;
        this.checkInTime = null;
        this.status = Status.DRAFT;
    }

    public Booking(String roomId, String name, 
    				Boolean isCheckedIn,String hostId, 
    				List<String> attendeeIds,
					LocalDateTime startTime,
					LocalDateTime endTime, LocalDateTime checkInTime) {
        this(UUID.randomUUID().toString(), roomId, name, isCheckedIn, hostId, attendeeIds, startTime, endTime, checkInTime, Status.ACTIVE);
    }

    public Booking(String name, String roomId, LocalDateTime startTime, LocalDateTime endTime, boolean isCheckedIn)
    {
        this.name = name;
        this.roomId = roomId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isCheckedIn = isCheckedIn;
    }

    public String getId() { return id; }
    public String getRoomId() { return roomId; }
    public Boolean getIsCheckedIn() { return isCheckedIn; }
    public void setActive() { this.isCheckedIn = true; }
    public void setInactive() { this.isCheckedIn = false; }
    public String getHostId() { return hostId; }
    public void setHostId(String hostId) { this.hostId = hostId; }
    public List<String> getAttendeeIds() { return attendeeIds; }
    public void setAttendeeIds(List<String> attendeeIds) { this.attendeeIds = attendeeIds; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }
    public LocalDateTime getCheckIn() { return checkInTime; }
    public void setCheckIn(LocalDateTime checkInTime) { this.checkInTime = checkInTime; }
    public String getName() {
    	return name;
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
    
    public double calculatePrice(AccountRole user_type, double hours) {
    	return user_type.getHourlyRate() * hours;
    }
}
