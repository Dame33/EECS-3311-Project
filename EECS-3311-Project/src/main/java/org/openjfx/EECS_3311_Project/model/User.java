package org.openjfx.EECS_3311_Project.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

public class User implements ICSVDataObject {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userType;
	private ArrayList<Booking> allBookings;
	private ArrayList<Booking> hostBookings;
	private ObservableList<Booking> observableHostBookings;
	private ArrayList<Booking> invitedBookings;
	private ObservableList<Booking> observableInvitedBookings;
	private AccountRole accountRole;


	public User(String id, String firstName, String lastName, String email, String password) {
		this.id = UUID.randomUUID().toString();
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	    this.password= password;
		this.hostBookings  = new ArrayList<Booking>();
		this.observableHostBookings = FXCollections.observableList(hostBookings);
		this.invitedBookings = new ArrayList<Booking>();
		this.observableInvitedBookings = FXCollections.observableList(invitedBookings);
		this.allBookings = new ArrayList<Booking>();
    }
	
	public User(String firstName, String lastName, String email, String password) {
		this.id = UUID.randomUUID().toString();
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	    this.password= password;
		this.hostBookings  = new ArrayList<Booking>();
		this.observableHostBookings = FXCollections.observableList(hostBookings);
		this.invitedBookings = new ArrayList<Booking>();
		this.observableInvitedBookings = FXCollections.observableList(invitedBookings);
		this.allBookings = new ArrayList<Booking>();
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
		this.hostBookings  = new ArrayList<Booking>();
		this.observableHostBookings = FXCollections.observableList(hostBookings);
		this.invitedBookings = new ArrayList<Booking>();
		this.observableInvitedBookings = FXCollections.observableList(invitedBookings);
		this.allBookings = new ArrayList<Booking>();
	}
	
	public User()
	{

	}
	
	public User(String userCSVRow) {
		String[] parts = userCSVRow.split(",", -1);
		
		if (parts.length < 8 ) {
            System.err.println("Can't parse user from this row: " + userCSVRow);
            return;
        }


        

        String id = parts[0];
        String firstName = parts[1];
        String lastName = parts[2];
        String email = parts[3];
        String password = parts[4];
        String userType = parts[5];
        // parts[6] is bookings
        //String bookings = parts[6];
        String accountRoleId = parts[7];
        
        
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.accountRole = new AccountRole();
        this.accountRole.setId(accountRoleId);
        this.hostBookings  = new ArrayList<Booking>();
		this.observableHostBookings = FXCollections.observableList(hostBookings);
		this.invitedBookings = new ArrayList<Booking>();
		this.observableInvitedBookings = FXCollections.observableList(invitedBookings);
		this.allBookings = new ArrayList<Booking>();

	}
	
	
	public String toCSVRow() {// update to join by comma, added suppoort for bookings
		String bookings = this.getHostBookings().stream() 
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

	public ArrayList<Booking> getHostBookings() {
		return hostBookings;
	}

	public ObservableList<Booking> getObservableHostBookings()
	{
		return observableHostBookings;
	}
	
	public ArrayList<Booking> getInvitedBookings()
	{
		return invitedBookings;
	}
	public ObservableList<Booking> getObservableInvitedBookings()
	{
		return observableInvitedBookings;
	}
	
	public void addBooking(Booking b)
	{
		observableHostBookings.add(b);
	}
	
	public void updateHostBookingsFromDatabase(ArrayList<Booking> updatedData)
	{
		this.hostBookings = updatedData;
		observableHostBookings.setAll(updatedData);
	}
	
	public void updateInvitedBookingsFromDatabase(ArrayList<Booking> updatedData)
	{
		this.invitedBookings = updatedData;
		observableInvitedBookings.setAll(updatedData);
	}
	
	public void setHostBookings(ArrayList<Booking> bookings)
	{
		this.hostBookings = bookings;
	}
	
	public void setInvitedBookings(ArrayList<Booking> bookings)
	{
		this.invitedBookings = bookings;
	}


	public AccountRole getAccountRole() {
		return accountRole;
	}

	public void setAccountRole(AccountRole accountType) {
		this.accountRole = accountType;
	}
	
	public ArrayList<Booking> getAllBookings()
	{
		return allBookings;
	}
	
	public void setAllBookings(ArrayList<Booking> bookings)
	{
		allBookings = bookings;
	}
	
	
	
	
}


