package org.openjfx.EECS_3311_Project.model;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

public class User {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userType;
	private ArrayList<Booking> bookings = new ArrayList<Booking>();
	private AccountRole accountRole;


	public User(String id, String firstName, String lastName, String email, String password) {
		this.id = UUID.randomUUID().toString();
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	    this.password= password;
    }
	
	public User(String firstName, String lastName, String email, String password) {
		this.id = UUID.randomUUID().toString();
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	    this.password= password;
    }

	//constructor with added parameters not including bookings
//	public User(String id, String firstName, String lastName, String email, String password, String userType, String accountType)
//	{
//		this.id = UUID.randomUUID().toString();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.password = password;
//		this.userType = userType;
//		this.accountType = accountType;
//	}
	
	public User(String id, String firstName, String lastName, String email, String password, String userType, AccountRole accountType)
	{
		this.id = UUID.randomUUID().toString();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.accountRole = accountType;
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
}


