package org.openjfx.EECS_3311_Project.model;

public class Payment implements ICSVDataObject{
	private String id;
    private Double amount;
    private String cardNumber;
    private String userId;
    
    public Payment(Double amount, String cardNumber, String userId) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.userId= userId;
    }
    
    public Payment(String csvRow) {
        // amount, lastDigitsOfCard, userId
        String[] tokens = csvRow.split(",");
        this.amount = Double.parseDouble(tokens[0]);
        this.cardNumber = tokens[1];
        this.userId = Boolean.parseBoolean(tokens[2]);
    }
    
	public String toCSVRow() {
		// id, amount, lastDigitsOfCard, userId
		return String.join(",", this.id, ""+this.amount, this.cardNumber, this.userId);
	}
	
    public String getId() {
		return id;
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
}
