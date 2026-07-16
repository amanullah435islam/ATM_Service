package com.decodelabs.atminterface.controller;

	import com.decodelabs.atminterface.service.ATMService;
import com.decodelabs.atminterface.service.ValidationService;
import com.decodelabs.atminterface.ui.ConsoleUI;

	public class ATMController {

	    private final ConsoleUI consoleUI;
	    private final ATMService atmService;
	    private final ValidationService validationService;
	    

	    public ATMController() {
	        this.consoleUI = new ConsoleUI();
	        this.atmService = new ATMService();
	        this.validationService = new ValidationService();
	    }

	    public void start() {

	        consoleUI.showWelcomeMessage();

	        boolean running = true;

	        while (running) {

	            consoleUI.showMenu();

	            int choice = consoleUI.readMenuChoice();

	            switch (choice) {

	                case 1:
	                    handleDeposit();
	                    break;

	                case 2:
	                    handleWithdraw();
	                    break;

	                case 3:
	                    handleCheckBalance();
	                    break;

	                case 0:
	                    running = false;
	                    consoleUI.showExitMessage();
	                    break;

	                default:
	                    consoleUI.showInvalidChoiceMessage();
	            }
	        }
	    }

	    
	    
	    
	    private void handleDeposit() {

	        double amount = consoleUI.readAmount();
	        
	        if (!validationService.isValidAmmount(amount)) {
	        	
	        	consoleUI.showErrorMessage("Invalid amount.");
	        	
	        	return;
			}
	        
	        atmService.deposit(amount);
	        
	        consoleUI.showSuccessMessage("Deposit Successful.");
	    }

	    
	    
	    
	    private void handleWithdraw() {

	        double amount = consoleUI.readAmount();
	        
	        if (!validationService.isValidAmmount(amount)) {
				
	        	consoleUI.showErrorMessage("Invalid amount.");
	        	
	        	return;
			}
	        
	        if (!validationService.hasSufficientBalance(atmService.getBankAccount(), amount)) {
				
	        	consoleUI.showErrorMessage("Insufficient Balance.");
			}
	        
	        atmService.withdraw(amount);
	        
	        consoleUI.showSuccessMessage("Withdrawal Successful.");
	    }

	    private void handleCheckBalance() {

	    	 consoleUI.showBalance(

	    	            atmService.checkBalance()

	    	    );
	    }
	    

	}
	
	

