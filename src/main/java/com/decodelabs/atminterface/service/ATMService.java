package com.decodelabs.atminterface.service;

import com.decodelabs.atminterface.constant.AppConstants;
import com.decodelabs.atminterface.exception.InsufficientBalanceException;
import com.decodelabs.atminterface.exception.InvalidAmountException;
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
   
	    if (amount < AppConstants.MIN_TRANSACTION_AMOUNT) {

	        throw new InvalidAmountException(
	                AppConstants.INVALID_AMOUNT
	        );

	    }

	    bankAccount.setBalance(

	            bankAccount.getBalance()+amount

	    );
	    

	    }
	
	
	public boolean withdraw(double amount) {
		
		if (amount > bankAccount.getBalance()) {
			
			throw new InsufficientBalanceException(
	                AppConstants.INSUFFICIENT_BALANCE
			        );
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





