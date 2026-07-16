package org.testProjectImranSir;

import com.decodelabs.atminterface.constant.AppConstants;
import com.decodelabs.atminterface.controller.ATMController;
import com.decodelabs.atminterface.model.BankAccount;
import com.decodelabs.atminterface.service.ATMService;
import com.decodelabs.atminterface.ui.ConsoleUI;

public class Main {
   
	  public static void main(String[] args) {
		  
		  
	        ConsoleUI consoleUI = new ConsoleUI();

	        BankAccount bankAccount =
	        		
	                new BankAccount(
	                		AppConstants.DEFAULT_ACCOUNT_NAME,
	    	        		AppConstants.INITIAL_BALANCE
	    	        		);

	        ATMService atmService = new ATMService(bankAccount);


	        ATMController controller =
	                new ATMController(
	                        consoleUI,
	                        atmService
	                      
	                );
	        
	        
	        controller.start();
	    }
}