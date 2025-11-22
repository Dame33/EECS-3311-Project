package org.openjfx.EECS_3311_Project.csv;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.openjfx.EECS_3311_Project.DatabaseUtils;
import org.openjfx.EECS_3311_Project.model.Payment;

public class PaymentCSVOperations extends CSVOperations<Payment>{

	@Override
	protected Path getCSVPath() {
		return DatabaseUtils.paymentsFilePath;
	}

	@Override
	protected String[] toColumns(Payment item) {
	    return new String[] {
	        String.valueOf(item.getAmount()),
	        item.getCardNumber(),     // last digits of card
	        item.getUserId()
	    };
	}
	
	@Override
	protected List<Payment> parseLines(List<String> lines) {
		List<Payment> payments = new ArrayList<Payment>();
		for(String l : lines) {
			payments.add(new Payment(l));
		}
		return payments;
	}

}
