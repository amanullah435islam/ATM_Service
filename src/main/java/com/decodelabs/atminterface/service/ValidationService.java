package com.decodelabs.atminterface.service;

import com.decodelabs.atminterface.constant.AppConstants;
import com.decodelabs.atminterface.model.BankAccount;

public class ValidationService {

	public boolean isValidAmmount(double amount) {
		
		
		return amount > AppConstants.MIN_TRANSACTION_AMOUNT;
	}
	
	
	
	public boolean hasSufficientBalance(BankAccount account, double amount) {		
		
		return account.getBalance() >= amount;
	}
	
	
	
}
