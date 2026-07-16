package com.decodelabs.atminterface.ui;

import com.decodelabs.atminterface.constant.AppConstants;
import com.decodelabs.atminterface.util.InputHelper;

public class ConsoleUI {	    
    
    public void showWelcomeMessage() {

        System.out.println();
        System.out.println("=====================================");
        System.out.println("       " + AppConstants.APP_TITLE);
        System.out.println("=====================================");
    }
    
    
    public void showMenu() {

        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("0. Exit");     
    }
    
    
    public int readMenuChoice() {

    	 return InputHelper.readInt(
                 "Enter your choice : "
         );

    }
    
    
    public double readAmount() {

    	 return InputHelper.readDouble(
                 "Enter amount : "
         );

    }
    
    
    public void showBalance(double balance) {

    	 System.out.printf(
                 "%nCurrent Balance : %.2f%n",
                 balance
         );
    }
    
    
    public void showSuccessMessage(String message) {

        System.out.println();
        System.out.println(message);
    }
    
    
    public void showErrorMessage(String message) {

        System.out.println();
        System.out.println(message);
    }   

    
    public void showInvalidChoiceMessage() {

        System.out.println();
        System.out.println(AppConstants.INVALID_MENU);
    }

    
    public void showExitMessage() {

    	  System.out.println();
          System.out.println(
                  AppConstants.EXIT_MESSAGE
          );
    }
    
}
