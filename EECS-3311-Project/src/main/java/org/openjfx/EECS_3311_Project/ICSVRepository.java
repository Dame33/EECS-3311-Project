package org.openjfx.EECS_3311_Project;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ICSVRepository {
	private final Path bookingFilePath;
	private final Path userFilePath;
	
	public ICSVRepository (String bookingFileName, String userFileName) {
        this.bookingFilePath = Paths.get(bookingFileName);
        this.userFilePath = Paths.get(userFileName);
    }
	
    public Booking upsertBooking(Booking booking) {
        ArrayList<Booking> all = getAllBookingsFromFile();

        all.removeIf(b -> b.getRoomId().equals(booking.getRoomId()));
        all.add(booking);

        writeAllBookingsToFile(all);
        return booking;
    }

    public String cancelBooking(String bookingId) {
        ArrayList<Booking> all = getAllBookingsFromFile();

        for (Booking b : all) {
            if (b.getRoomId().equals(bookingId)) {
                b.setInactive(); 
            }
        }

        writeAllBookingsToFile(all);
        return bookingId;
    }

    public ArrayList<Booking> getHostBookingsByUserId(String userId) {
        ArrayList<Booking> result = new ArrayList<>();
        for (Booking b : getAllBookingsFromFile()) {
            if (b.getHostUserId().equals(userId)) {
                result.add(b);
            }
        }
        return result;
    }

    public ArrayList<Booking> getInvitedBookingsByUserId(String userId) {
        ArrayList<Booking> result = new ArrayList<>();
        for (Booking b : getAllBookingsFromFile()) {
            if (b.getInvitedUserIds().contains(userId)) {
                result.add(b);
            }
        }
        return result;
    }
    
    private ArrayList<Booking> getAllBookingsFromFile() {
        ArrayList<Booking> bookings = new ArrayList<>();

        if (!Files.exists(bookingFilePath)) {
            return bookings;
        }

        try (BufferedReader reader = Files.newBufferedReader(bookingFilePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                Booking b = parseBooking(line);
                bookings.add(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookings;
    }

    private void writeAllBookingsToFile(ArrayList<Booking> bookings) {
        try (BufferedWriter writer = Files.newBufferedWriter(bookingFilePath)) {
            for (Booking b : bookings) {
                writer.write(bookingToCsvLine(b));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Booking parseBooking(String line) {
        String[] parts = line.split(",", -1);

        if (parts.length < 10) {
            throw new IllegalArgumentException("Invalid booking CSV line: " + line);
        }

        String id = parts[0];
        String roomId = parts[1];
        String name = parts[2];
        Boolean isCheckedIn = Boolean.parseBoolean(parts[3]);        
        String hostUserId = parts[4];
        String[] attendeeIds = parts[5].split(";");
        LocalDateTime startTime  = LocalDateTime.parse(parts[6]);
        LocalDateTime endTime = LocalDateTime.parse(parts[7]);
        LocalDateTime checkInTime = LocalDateTime.parse(parts[8]);
        Status status = Status.valueOf(parts[9]);
        
        User host = getUserById(hostUserId);
        ArrayList<User> attendees = getUsersByIds(attendeeIds);
        
        return new Booking(id, roomId, name, isCheckedIn, host, attendees, startTime, endTime, checkInTime, status);
    }
    
    private User getUserById(String userId) {
        ArrayList<User> allUsers = getAllUsers();  // read from CSV
        for (User u : allUsers) {
            if (u.getId().equals(userId)) {
                return u;
            }
        }
        return null;
    }
    
    private ArrayList<User> getUsersByIds(String[] userIds) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<User> allUsers = getAllUsers();

        for (String userId : userIds) {
            for (User u : allUsers) {
                if (u.getId().equals(userId)) {
                    users.add(u);
                    break;
                }
            }
        }
        return users;
    }
    
    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(userFilePath)) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;
                users.add(parseUser(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
    
    private User parseUser(String line) {
        String[] parts = line.split(",", -1);

        if (parts.length < 5) {
            throw new IllegalArgumentException("Invalid user CSV line: " + line);
        }

        String id = parts[0];
        String name = parts[1];
        String email = parts[2];
        String role = parts[3];
        String isActive = parts[4];
        
        return new User(id, name, email, role, isActive);    
    }
    
    private String bookingToCsvLine(Booking b) {
        // convert Booking fields → CSV line string
        return "";
    }
}