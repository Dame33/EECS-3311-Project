package org.openjfx.EECS_3311_Project.controllers;

import java.time.Duration;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.model.AccountRole;
import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.User;

public class BookingController {
    private final Mediator mediator = Mediator.getInstance();

    public void saveBooking(Booking booking, User user) {
        mediator.saveBooking(booking);
        user.addBooking(booking);
        mediator.saveUser(user);
    }

    public Booking extendBooking(Booking booking, Duration extension) {
        booking.setEndTime(booking.getEndTime().plus(extension));
        return mediator.saveBooking(booking);
    }
}
