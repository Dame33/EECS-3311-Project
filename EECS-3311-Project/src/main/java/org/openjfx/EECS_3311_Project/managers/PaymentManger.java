package org.openjfx.EECS_3311_Project.managers;

import org.openjfx.EECS_3311_Project.CSVAdapter;
import org.openjfx.EECS_3311_Project.ICSVRepository;
import org.openjfx.EECS_3311_Project.Session;
import org.openjfx.EECS_3311_Project.model.Payment;
import org.openjfx.EECS_3311_Project.model.Status;
import org.openjfx.EECS_3311_Project.model.User;

public class PaymentManger {
	ICSVRepository csvRepository = CSVAdapter.getInstance();	
	
	public PaymentManger() {
	}
	
	public boolean validatePayment(Payment payment) {
		return csvRepository.validatePayment(payment);
	}
	
	public Payment createRecord(double amount, String lastDigitsOfCard, String userId) {
		Payment payment = new Payment(amount, lastDigitsOfCard, userId);

		csvRepository.createRecord(payment);
		return payment;
	}
}
