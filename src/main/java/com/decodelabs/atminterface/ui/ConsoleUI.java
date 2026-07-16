package com.decodelabs.atminterface.ui;

import com.decodelabs.atminterface.util.InputHelper;

public class ConsoleUI {	    
    
    public void showWelcomeMessage() {

        System.out.println();
        System.out.println("=====================================");
        System.out.println("      WELCOME TO ATM INTERFACE");
        System.out.println("=====================================");
    }
    
    
    public void showMenu() {

        System.out.println();
        System.out.println("========== ATM MENU ==========");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("0. Exit");
        System.out.println("==============================");
    }
    
    
    public int readMenuChoice() {

        return InputHelper.readInt("Enter your choice : ");
    }
    
    
    public double readAmount() {

        return InputHelper.readDouble("Enter amount : ");
    }
    
    
    public void showBalance(double balance) {

        System.out.println();
        System.out.println("Current Balance : " + balance);
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
        System.out.println("Invalid Menu Choice.");
    }

    
    public void showExitMessage() {

        System.out.println();
        System.out.println("=====================================");
        System.out.println(" Thank You For Using ATM Interface");
        System.out.println("=====================================");
    }
    
}
