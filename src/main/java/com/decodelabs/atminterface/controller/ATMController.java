package com.decodelabs.atminterface.controller;

	import com.decodelabs.atminterface.constant.AppConstants;
import com.decodelabs.atminterface.service.ATMService;
import com.decodelabs.atminterface.service.ValidationService;
import com.decodelabs.atminterface.ui.ConsoleUI;

	public class ATMController {

	    private final ConsoleUI consoleUI;
	    private final ATMService atmService;
	    private final ValidationService validationService;
	  
	    

	    public ATMController(
	            ConsoleUI consoleUI,
	            ATMService atmService,
	            ValidationService validationService) {

	        this.consoleUI = consoleUI;
	        this.atmService = atmService;
	        this.validationService = validationService;

	    }

	    
	    
	    
	    public void start() {

	        consoleUI.showWelcomeMessage();

	        boolean running = true;

	        while (running) {

	            consoleUI.showMenu();

	            int choice = consoleUI.readMenuChoice();

	            switch (choice) {

	                case AppConstants.DEPOSIT_OPTION:
	                    handleDeposit();
	                    break;

	                case AppConstants.WITHDRAW_OPTION:
	                    handleWithdraw();
	                    break;

	                case AppConstants.BALANCE_OPTION:
	                    handleCheckBalance();
	                    break;

	                case AppConstants.EXIT_OPTION:
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
	        	
	        	consoleUI.showErrorMessage(AppConstants.INVALID_AMOUNT);
	        	
	        	return;
			}
	        
	        atmService.deposit(amount);
	        
	        consoleUI.showSuccessMessage(AppConstants.DEPOSIT_SUCCESS);
	    }

	    
	    
	    
	    
	    
	    private void handleWithdraw() {

	        double amount = consoleUI.readAmount();
	        
	        if (!validationService.isValidAmmount(amount)) {
				
	        	consoleUI.showErrorMessage(AppConstants.INVALID_AMOUNT);
	        	
	        	return;
			}
	        
	        if (!validationService.hasSufficientBalance(atmService.getBankAccount(), amount)) {
				
	        	consoleUI.showErrorMessage(AppConstants.INSUFFICIENT_BALANCE);
			}
	        
	        atmService.withdraw(amount);
	        
	        consoleUI.showSuccessMessage(AppConstants.WITHDRAW_SUCCESS);
	    }

	    
	    
	    
	    private void handleCheckBalance() {

	    	 consoleUI.showBalance(

	    	            atmService.checkBalance()

	    	    );
	    }
	    

	}
	
	

