package org.openjfx.EECS_3311_Project.model;

public class Payment  implements ICSVDataObject{
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

	@Override
	public String toCSVRow() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getLastDigitsOfCard() {
		return lastDigitsOfCard;
	}

	public void setLastDigitsOfCard(String lastDigitsOfCard) {
		this.lastDigitsOfCard = lastDigitsOfCard;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


}
