package org.openjfx.EECS_3311_Project.model;

public class Payment {
	private String id;
    private Double amount;
    private String lastDigitsOfCard;
    private String userId;
    
    public Payment(String id, Double amount, String lastDigitsOfCard, String userId) {
        this.id = id;
        this.amount = amount;
        this.lastDigitsOfCard = lastDigitsOfCard;
        this.userId= userId;
    }
}
