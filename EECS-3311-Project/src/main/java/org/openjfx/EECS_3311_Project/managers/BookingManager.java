package org.openjfx.EECS_3311_Project.managers;

import java.util.List;
import java.util.Optional;

import org.openjfx.EECS_3311_Project.ICSVRepository;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.Status;
import org.openjfx.EECS_3311_Project.model.User;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {

	private final ICSVRepository csv;
	private final String currentUserID;
	
	public BookingManager(ICSVRepository csv, String currentUserID) {
		this.csv = csv;
		this.currentUserID = currentUserID;
	}
	
	
	public Booking checkInBooking(String bookingID) {
		Booking booking = findBookingByID(bookingID);
		if (booking == null) {
			return null;
		}
		booking.setActive();
		//NTS need to set check in time, add it to booking
		booking.setCheckIn(LocalDateTime.now());
		return csv.upsertBooking(booking);
	}
	
	public Booking cancelBooking(String bookingID) {
		Booking booking = findBookingByID(bookingID);
		if (booking == null) {
			return null;
		}
		booking.setStatus(Status.CANCELLED);
		csv.upsertBooking(booking);
		csv.cancelBooking(bookingID);
		return booking;
	}
	
	
	public Booking addTime(String bookingID, int minutes) {
		Booking booking = findBookingByID(bookingID);
		if (booking == null) {
			return null;
		}
		//need to add endtime to booking class
		LocalDateTime endTime = booking.getEndTime().plusMinutes(minutes);
		booking.setEndTime(endTime);
		return csv.upsertBooking(booking);
		
	}
	
	public Booking saveBooking(String bookingID) {
		Booking booking = findBookingByID(bookingID);
		return csv.upsertBooking(booking);
	}
	
	//Not sure if we want to add users based off id or add their user object, need to double check this.
	public void inviteUsers(ArrayList<User> users, Booking booking) {
		if (users == null ||booking == null) {
			return;
		}
		
		ArrayList<User> attendees = booking.getAttendees();
		if (attendees == null) {
			attendees = new ArrayList<>();
		}
		
		for (User user : users){
			if (user == null) {
				continue;
			}
			
			boolean Invited = false;
			
			for(User x : attendees) {
				if (x.getId().equals(user.getId())) {
					Invited = true;
					break;
				}
			}
			
			if(Invited == false) {
				attendees.add(user);
			}
		}
		booking.setAttendees(attendees);
	}
	
	
	//double check formatting of booking, this should be based off how 
	public Booking bookRoom(String roomId, LocalDateTime startTime, LocalDateTime endTime, String bookingName, User host, ArrayList<User> attendees) {
		if(attendees == null) {
			attendees = new ArrayList<>();
		}
		Booking booking = new Booking(roomId, bookingName, false, host, attendees, startTime, endTime, null);
		return csv.upsertBooking(booking);
	}
	
	
	
	//Helper to find booking, should i move this somewhere else?
	private Booking findBookingByID(String bookingID) {
		if(bookingID.length() < 1 || currentUserID == null) {
			return null;
		}
		
		ArrayList<Booking> hostBookings = csv.getHostBookingsByUserId(currentUserID);
		ArrayList<Booking> invitedBookings = csv.getInvitedBookingsByUserId(currentUserID);
		
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
}