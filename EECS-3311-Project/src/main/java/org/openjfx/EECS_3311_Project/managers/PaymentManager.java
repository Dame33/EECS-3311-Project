package org.openjfx.EECS_3311_Project.managers;
import org.openjfx.EECS_3311_Project.csv.*;
import org.openjfx.EECS_3311_Project.model.Payment;

public class PaymentManager{
	private final PaymentCSVOperations paymentCSV = new PaymentCSVOperations();

	
//	public boolean validatePayment(Payment payment) {
//		boolean valid_payment_record = true;
//	    if (payment == null) {
//	    	valid_payment_record = false;
//	        throw new IllegalArgumentException("Payment cannot be null");
//	    }
//
//	    // Validate id
//	    if (payment.getId().trim().isEmpty()) {
//	    	valid_payment_record = false;
//	        throw new IllegalArgumentException("Payment id cannot be null or blank");
//	    }
//
//	    // Validate amount
//	    if (payment.getAmount() <= 0.0) {
//	    	valid_payment_record = false;
//	        throw new IllegalArgumentException("Amount must be greater than 0");
//	    }
//
//	    // Validate last digits / card number
//	    String cardNumber = payment.getCardNumber();
//	    if (cardNumber.trim().isEmpty()) {
//	    	valid_payment_record = false;
//	        throw new IllegalArgumentException("Card digits cannot be null or blank");
//	    }
//	    if (!cardNumber.matches("\\d+")) {
//	    	valid_payment_record = false;
//	        throw new IllegalArgumentException("Card digits must contain only numbers");
//	    }
//	    if (cardNumber.length() >= 13 && !isValidLuhn(cardNumber)) {
//	    	valid_payment_record = false;
//	        throw new IllegalArgumentException("Invalid card number (failed Luhn check)");
//	    }
//
//	    // Validate userId
//	    if (payment.getUserId().trim().isEmpty()) {
//	    	valid_payment_record = false;
//	        throw new IllegalArgumentException("User ID cannot be null or blank");
//	    }
//	    
//	    return valid_payment_record;
//	}
	
	public boolean isValidLuhn(String cardNumber) {
	    int sum = 0;
	    boolean alternate = false;

	    for (int i = cardNumber.length() - 1; i >= 0; i--) {
	        int n = cardNumber.charAt(i) - '0';

	        if (alternate) {
	            n *= 2;
	            if (n > 9) {
	                n = (n % 10) + 1;
	            }
	        }

	        sum += n;
	        alternate = !alternate;
	    }

	    return (sum % 10 == 0);
	}
	
	public Payment createRecord(Payment payment) {
		return paymentCSV.create(payment);
	
	}

	public Payment upsertRecord(Payment payment) {
		// TODO Auto-generated method stub
		return paymentCSV.upsert(payment);
	}
}
