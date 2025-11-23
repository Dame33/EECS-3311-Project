package org.openjfx.EECS_3311_Project.managers;
import org.openjfx.EECS_3311_Project.csv.BookingCSVOperations;
import org.openjfx.EECS_3311_Project.model.Booking;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;


public class BookingManager {

	private final BookingCSVOperations bookingCSV = new BookingCSVOperations();
	
	
	public BookingManager() {
	}


//	public Booking checkInBooking(String bookingID) {
//		Booking booking = findBookingByID(bookingID, Session.getUser().getId());
//		if (booking == null) {
//			return null;
//		}
//		booking.setActive();
//		//NTS need to set check in time, add it to booking
//		booking.setCheckInTime(LocalDateTime.now());
//		return csv.upsertBooking(booking);
//	}
//	
//	public Booking cancelBooking(String bookingID) {
//		Booking booking = findBookingByID(bookingID, Session.getUser().getId());
//		if (booking == null) {
//			return null;
//		}
//		booking.setStatus(Status.CANCELLED);
//		csv.upsertBooking(booking);
//		csv.cancelBooking(bookingID);
//		return booking;
//	}
//	
//	
//	public Booking addTime(String bookingID, int minutes) {
//		Booking booking = findBookingByID(bookingID, Session.getUser().getId());
//		if (booking == null) {
//			return null;
//		}
//		//need to add endtime to booking class
//		LocalDateTime endTime = booking.getEndTime().plusMinutes(minutes);
//		booking.setEndTime(endTime);
//		return csv.upsertBooking(booking);
//		
//	}
//	
//	public Booking saveBooking(String bookingID) {
//		Booking booking = findBookingByID(bookingID, Session.getUser().getId());
//		return csv.upsertBooking(booking);
//	}
//	
//	//Not sure if we want to add users based off id or add their user object, need to double check this.
//	public void inviteUsers(ArrayList<User> users, Booking booking) {
//		if (users == null ||booking == null) {
//			return;
//		}
//		
//		ArrayList<String> attendees = (ArrayList) booking.getAttendeeIds();
//		if (attendees == null) {
//			attendees = new ArrayList<>();
//		}
//		
//		for (User user : users){
//			if (user == null) {
//				continue;
//			}
//			
//			boolean Invited = false;
//			
//			for(String x : attendees) {
//				if (x.equals(user.getId())) {
//					Invited = true;
//					break;
//				}
//			}
//			
//			if(Invited == false) {
//				attendees.add(user.getId());
//			}
//		}
//		booking.setAttendeeIds(attendees);
//	}
//	
//	
//	public void removeAttendee(Booking booking, String userId) {
//		if(userId.isEmpty()) {
//			return;
//		}
//		List<String> attendeeIds= booking.getAttendeeIds();
//		
//		if (attendeeIds == null) {
//			return;
//		}
//		if (attendeeIds.remove(userId)) {
//			csv.upsertBooking(booking);
//		}
//	}
//	
//
//	public void inviteUser(User user, Booking booking) {
//		if (user == null || booking == null) {
//			return;
//		}
//
//		ArrayList<User> userList = new ArrayList<>();
//		userList.add(user);
//
//		inviteUsers(userList, booking);
//		csv.upsertBooking(booking);
//	}
	
	
//	//double check formatting of booking, this should be based off how 
//	public Booking bookRoom(String roomId, LocalDateTime startTime, LocalDateTime endTime, String bookingName, User host, ArrayList<String> attendees) {
//		if(attendees == null) {
//			attendees = new ArrayList<>();
//		}
//		Booking booking = new Booking(roomId, bookingName, false, host.getId(), attendees, startTime, endTime, null);
//		return csv.upsertBooking(booking);
//	}
//	
	
	
	//Helper to find booking, should i move this somewhere else?
	
//	// rename to getUserInvitedAndHostBookings
//	private Booking findBookingByID(String bookingID, String userId) {
//		if(bookingID.length() < 1 || userId == null) {
//			return null;
//		}
//		
//		ArrayList<Booking> hostBookings = csv.getHostBookingsByUserId(userId);
//		ArrayList<Booking> invitedBookings = csv.getInvitedBookingsByUserId(userId);
//		
//		ArrayList<Booking> temp = new ArrayList<>();
//		temp.addAll(hostBookings);
//		temp.addAll(invitedBookings);
//		
//		for(Booking b : temp) {
//			if(b != null && bookingID.equals(b.getId())) {
//				return b;
//			}
//		}
//		return null;
//	}


	public List<Booking> getBookingsByRoomAndDate(String roomId, LocalDate date) {
		return bookingCSV.readMany((booking, cols) -> booking.getRoomId().equalsIgnoreCase(roomId) && booking.getStartTime().toLocalDate().equals(date) );
	}
	
	public List<Booking> getAllHostBookings(String userId)
	{
		return bookingCSV.readMany((booking, cols) -> booking.getHostId().equals(userId));
	}
	
	public List<Booking> getAllInvitedBookings(String userId)
	{
		return bookingCSV.readMany((booking, cols) -> booking.getAttendeeIds().contains(userId));
		
	}
	
	public Booking getBookingById(String bookingId) {
		Optional<Booking> bookingOpt = bookingCSV.readById(bookingId);
		if (bookingOpt.isPresent()) return bookingOpt.get();
		return null;
	}


	public Booking upsertBooking(Booking booking) {
		return bookingCSV.upsert(booking);
	}


	public LocalDateTime getLatestEndTime(String roomId, LocalDateTime endTime) {
		List<Booking> bookings = getBookingsByRoomAndDate(roomId, endTime.toLocalDate());
		LocalDateTime latestEnd = LocalDateTime.of(endTime.toLocalDate(), LocalTime.of(22, 0));
		
		// with all bookings, get the next booking time that starts after the given end time.
		for (Booking b : bookings) {
			LocalDateTime nextStart = b.getStartTime();
			// we only care about bookings that start after the current end time
			if (nextStart.isAfter(endTime)) {
				// take the earliest such booking as the limit
				if (nextStart.isBefore(latestEnd)) {
					latestEnd = nextStart;
			}
		}
}
		// if not found, then return end of day (10 pm, hardcoded lol)
		
		return latestEnd;
	}
	
	


	public Booking cancelBooking(Booking booking) {
		bookingCSV.delete(booking);
		return booking;
	}
	



}