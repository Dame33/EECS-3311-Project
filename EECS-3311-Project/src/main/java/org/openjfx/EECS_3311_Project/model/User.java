package org.openjfx.EECS_3311_Project.model;

import java.util.ArrayList;
import java.util.stream.Collectors;



public class User implements ICSVDataObject {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userType;
	private ArrayList<Booking> bookings = new ArrayList<Booking>();
	private AccountRole accountRole;
	
	public Booking addBooking(Booking booking) {
	    if (booking == null) return null;

	    boolean exists = bookings.stream().anyMatch(b -> b.getId().equals(booking.getId()));

	    if (!exists) {
	        bookings.add(booking);
	        return booking;
	    }

	    return null;
	}
	
	public String toCSVRow() {// update to join by comma, added suppoort for bookings
		String bookings = this.getBookings().stream()
		        .map(Booking::getId)     
		        .map(String::valueOf)   
		        .collect(Collectors.joining(";")); 
		return String.join(",", id, this.getFirstName(), this.getLastName(), this.getEmail(), this.getPassword(), this.getUserType(), "[" + bookings + "]", this.getAccountRole().getId());
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public ArrayList<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(ArrayList<Booking> bookings) {
		this.bookings = bookings;
	}

	public AccountRole getAccountRole() {
		return accountRole;
	}

	public void setAccountRole(AccountRole accountType) {
		this.accountRole = accountType;
	}

	public void removeBooking(Booking booking) {
		this.bookings.remove(booking);
		
	}
	
	
}

