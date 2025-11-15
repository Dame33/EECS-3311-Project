package org.openjfx.EECS_3311_Project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CSVAdapter implements ICSVRepository {
    private final ICSVRepository csvRepository;

    public CSVAdapter(ICSVRepository csvRepository) {
        this.csvRepository = csvRepository;
    }
    
    // create the append function using the private upsertBooking
    // create the listall function using the function in ICSV Repository -> getAllUsers
    // create getHostBookingsByUserId using the function in ICSV Repository -> getHostBookingsByUserId
    // create getInvitedBookingsByUserId using the function in ICSV Repository -> getInvitedBookingsByUserId

    @Override
	public Booking upsertBooking(Booking booking) {
		
		return null;
	}

    @Override
	public String cancelBooking(String bookingId) {

		return null;
	}

    @Override
	public ArrayList<Booking> getHostBookingsByUserId(String userId) {

		return null;
	}

    @Override
	public ArrayList<Booking> getInvitedBookingsByUserId(String userId) {

		return null;
	}
}
