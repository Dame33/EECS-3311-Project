package org.openjfx.EECS_3311_Project;

import java.util.ArrayList;
import java.util.UUID;

public class User {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

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
	
	public String getId() {
		return id;
	}
}
