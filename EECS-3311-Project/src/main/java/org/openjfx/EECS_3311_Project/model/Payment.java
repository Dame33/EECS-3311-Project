package org.openjfx.EECS_3311_Project.model;

import java.util.UUID;

public class Payment implements ICSVDataObject{
	private String id;
    private Double amount;
    private String cardNumber;
    private String userId;
    private String bookingId;
    
    public Payment(Double amount, String cardNumber, String userId, String bookingId) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.userId= userId;
        this.bookingId= bookingId;
    }
    
    public Payment(String csvRow) {
        // amount, lastDigitsOfCard, userId
        String[] tokens = csvRow.split(",");
        this.id = tokens[0].trim();
        this.amount = Double.parseDouble(tokens[1].trim());
        this.cardNumber = tokens[2].trim();
        this.userId = tokens[3].trim();
        this.bookingId = tokens[4].trim();
    }
    
    
	public String toCSVRow() {
		// id, amount, lastDigitsOfCard, userId
		return String.join(",", this.id, ""+this.amount, this.cardNumber, this.userId, this.bookingId);
	}
	
    
    public double getAmount() {
		return amount;
	}
    
    public String getCardNumber() {
		return cardNumber;
	}
    
    public String getUserId() {
		return userId;
	}

	public String getId() {
		return id;
	}
	
	public String getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
