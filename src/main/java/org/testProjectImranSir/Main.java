package org.testProjectImranSir;

import com.decodelabs.atminterface.controller.ATMController;
import com.decodelabs.atminterface.service.ATMService;
import com.decodelabs.atminterface.service.ValidationService;
import com.decodelabs.atminterface.ui.ConsoleUI;

public class Main {
   
	  public static void main(String[] args) {
		  
		  
	        ConsoleUI consoleUI = new ConsoleUI();

	        ATMService atmService = new ATMService();

	        ValidationService validationService =
	                new ValidationService();

	        ATMController controller =
	                new ATMController(
	                        consoleUI,
	                        atmService,
	                        validationService
	                );
	        
	        
	        controller.start();
	    }
}