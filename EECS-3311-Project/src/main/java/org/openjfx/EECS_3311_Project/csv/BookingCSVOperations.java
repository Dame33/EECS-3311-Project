package org.openjfx.EECS_3311_Project.csv;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.openjfx.EECS_3311_Project.DatabaseUtils;
import org.openjfx.EECS_3311_Project.model.Booking;

public class BookingCSVOperations extends CSVOperations<Booking>{


	@Override
	protected Path getCSVPath() {
		return DatabaseUtils.bookingFilePath;
	}

	@Override
	protected String[] toColumns(Booking booking) {
		// serialize the attendees
		String attendees = "";
		if (booking.getAttendeeIds() != null && !booking.getAttendeeIds().isEmpty()) {
		    attendees = "[" + String.join(";", booking.getAttendeeIds()) + "]";
		} else {
		    attendees = "[]";
		}
		
		return new String[] {
								safe(booking.getId()),
								safe(booking.getRoomId()),
								safe(booking.getName()),
								booking.getIsCheckedIn() == null ? "" : booking.getIsCheckedIn().toString(),
								safe(booking.getHostId()), 
								attendees,
								safe(booking.getStartTime().toString()),
								safe(booking.getEndTime().toString()),
								booking.getCheckInTime() == null ? "" : booking.getCheckInTime().toString(),
								booking.getStudentOrOrganizationId()
							};
	}

	@Override
	protected List<Booking> parseLines(List<String> lines) {
		List<Booking> bookings = new ArrayList<Booking>();
		for(String l : lines) {
			bookings.add(new Booking(l));
		}
		return bookings;
	}



}
