package org.openjfx.EECS_3311_Project;

import java.util.List;
import java.util.Optional;

public class BookingManager {

    private final CSVAdapter csv;

    public BookingManager(CSVAdapter csv) {
        this.csv = csv;
    }

    public Booking createBooking(Booking booking) {
        csv.append(booking);
        return booking;
    }

    public List<Booking> loadAll() {
        return csv.readAll();
    }

    public Optional<Booking> getById(String id) {
        return csv.findById(id);
    }
}