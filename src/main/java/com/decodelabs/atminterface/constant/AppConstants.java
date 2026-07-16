package com.decodelabs.atminterface.constant;

public class AppConstants {

	 private AppConstants() {
	        // Prevent object creation
	    }
	 
	 
 
	   /* ===========================
     Default Account Information
     =========================== */
	
	  public static final String DEFAULT_ACCOUNT_NAME =
	          "Demo User";
	
	  public static final double INITIAL_BALANCE =
	          1000.00;

  
	  /* ===========================
	  Menu Options
	  =========================== */
	
	public static final int EXIT_OPTION = 0;
	
	public static final int DEPOSIT_OPTION = 1;
	
	public static final int WITHDRAW_OPTION = 2;
	
	public static final int BALANCE_OPTION = 3;
	
	
    /* ===========================
    Validation
    =========================== */

	 public static final double MIN_TRANSACTION_AMOUNT =
	         1.00;
	
	  /* ===========================
     Success Messages
     =========================== */

	  public static final String DEPOSIT_SUCCESS =
	          "Deposit completed successfully.";
	
	  public static final String WITHDRAW_SUCCESS =
	          "Withdrawal completed successfully.";
		 
	  
	  /* ===========================
      Error Messages
      =========================== */
	
	   public static final String INVALID_AMOUNT =
	           "Invalid amount.";
	
	   public static final String INSUFFICIENT_BALANCE =
	           "Insufficient balance.";
	
	   public static final String INVALID_MENU =
	           "Invalid menu option.";
	   
	   

	    /* ===========================
	       UI Messages
	       =========================== */

	    public static final String APP_TITLE =
	            "ATM Interface";

	    public static final String EXIT_MESSAGE =
	            "Thank you for using ATM Interface.";
	   
}





















