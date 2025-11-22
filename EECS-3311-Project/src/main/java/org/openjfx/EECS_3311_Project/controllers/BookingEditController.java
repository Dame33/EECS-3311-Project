package org.openjfx.EECS_3311_Project.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.model.Booking;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class BookingEditController implements Initializable{
	
	@FXML
	private Label text_name;

    private Booking booking; 
    
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
    	booking = Session.getNewBooking();
    	
    	if (booking != null)
    	{
    		text_name.setText("Editing Booking for: " + booking.getName());
    	}
    	else
    	{
    		text_name.setText("Error: No booking selected");
    	}
    }



}