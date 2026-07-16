package com.decodelabs.atminterface.service;

import com.decodelabs.atminterface.constant.AppConstants;
import com.decodelabs.atminterface.model.BankAccount;

public class ATMService {

	
	 	private final BankAccount bankAccount;

	 
	    public ATMService() {
	        this.bankAccount = new BankAccount(
	        		
	        		AppConstants.DEFAULT_ACCOUNT_NAME,
	        		AppConstants.INITIAL_BALANCE
	        		
	        		);
	    }

	    
	    
	    
	    public void deposit(double amount) {

	    double currentBalance = bankAccount.getBalance();
	    currentBalance += amount;
	    bankAccount.setBalance(currentBalance);
	       
	    }
	
	
	public boolean withdraw(double amount) {
		
		if (amount > bankAccount.getBalance()) {
			return false;
		}
		
		double currentBalnce = bankAccount.getBalance();
		currentBalnce -= amount;
		bankAccount.setBalance(currentBalnce);
		
		return true;
	};
	
	
	
	
	public double checkBalance() {
		
		return bankAccount.getBalance();
	};
	
	public BankAccount getBankAccount() {
		
		return bankAccount;
	}
}





