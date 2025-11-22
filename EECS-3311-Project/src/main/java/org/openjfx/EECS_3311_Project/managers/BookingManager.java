package org.openjfx.EECS_3311_Project.managers;

import org.openjfx.EECS_3311_Project.CSVRepository;
import org.openjfx.EECS_3311_Project.ICSVRepository;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.Status;
import org.openjfx.EECS_3311_Project.model.User;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;

public class BookingManager {

	private final ICSVRepository csv = CSVRepository.getInstance();
	
	
	public BookingManager() {
	}


	public Booking checkInBooking(String bookingID) {
		Booking booking = findBookingByID(bookingID, Session.getUser().getId());
		if (booking == null) {
			return null;
		}
		booking.setActive();
		//NTS need to set check in time, add it to booking
		booking.setCheckInTime(LocalDateTime.now());
		return csv.upsertBooking(booking);
	}
	
	public Booking cancelBooking(String bookingID) {
		Booking booking = findBookingByID(bookingID, Session.getUser().getId());
		if (booking == null) {
			return null;
		}
		booking.setStatus(Status.CANCELLED);
		csv.upsertBooking(booking);
		csv.cancelBooking(bookingID);
		return booking;
	}
	
	
	public Booking addTime(String bookingID, int minutes) {
		Booking booking = findBookingByID(bookingID, Session.getUser().getId());
		if (booking == null) {
			return null;
		}
		//need to add endtime to booking class
		LocalDateTime endTime = booking.getEndTime().plusMinutes(minutes);
		booking.setEndTime(endTime);
		return csv.upsertBooking(booking);
		
	}
	
	public Booking saveBooking(String bookingID) {
		Booking booking = findBookingByID(bookingID, Session.getUser().getId());
		return csv.upsertBooking(booking);
	}
	
	//Not sure if we want to add users based off id or add their user object, need to double check this.
	public void inviteUsers(ArrayList<User> users, Booking booking) {
		if (users == null ||booking == null) {
			return;
		}
		
		ArrayList<String> attendees = (ArrayList) booking.getAttendeeIds();
		if (attendees == null) {
			attendees = new ArrayList<>();
		}
		
		for (User user : users){
			if (user == null) {
				continue;
			}
			
			boolean Invited = false;
			
			for(String x : attendees) {
				if (x.equals(user.getId())) {
					Invited = true;
					break;
				}
			}
			
			if(Invited == false) {
				attendees.add(user.getId());
			}
		}
		booking.setAttendeeIds(attendees);
	}
	
	
	//double check formatting of booking, this should be based off how 
	public Booking bookRoom(String roomId, LocalDateTime startTime, LocalDateTime endTime, String bookingName, User host, ArrayList<String> attendees) {
		if(attendees == null) {
			attendees = new ArrayList<>();
		}
		Booking booking = new Booking(roomId, bookingName, false, host.getId(), attendees, startTime, endTime, null);
		return csv.upsertBooking(booking);
	}
	
	
	
	//Helper to find booking, should i move this somewhere else?
	private Booking findBookingByID(String bookingID, String userId) {
		if(bookingID.length() < 1 || userId == null) {
			return null;
		}
		
		ArrayList<Booking> hostBookings = csv.getHostBookingsByUserId(userId);
		ArrayList<Booking> invitedBookings = csv.getInvitedBookingsByUserId(userId);
		
		ArrayList<Booking> temp = new ArrayList<>();
		temp.addAll(hostBookings);
		temp.addAll(invitedBookings);
		
		for(Booking b : temp) {
			if(b != null && bookingID.equals(b.getId())) {
				return b;
			}
		}
		return null;
	}


	public ArrayList<Booking> getBookingsByRoomAndDate(String roomId, LocalDate date) {
		return csv.getBookingsByRoomAndDate(roomId, date);
	}
}