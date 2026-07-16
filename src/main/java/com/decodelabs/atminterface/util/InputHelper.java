package com.decodelabs.atminterface.util;

import java.util.Scanner;

public class InputHelper {
 
	private static final Scanner SCANNER = new Scanner(System.in);
		
	
	 private InputHelper() {
	        // Prevent object creation
	    }
	 
	 
	 
	 public static int readInt(String message) {
		 
		 System.out.print(message);
		  
		 while (!SCANNER.hasNextInt()) {
			 
			System.out.println("Invalid input. Please enter a valid integer.");
            System.out.print(message);

			SCANNER.next();
		}
		 
		 return SCANNER.nextInt();
	 }
	 
	 
	 public static double readDouble(String message) {
		 
		 System.out.print(message);
		  
		 while (!SCANNER.hasNextDouble()) {
			 
			System.out.println("Invalid input. Please enter a valid integer.");
            System.out.print(message);

			SCANNER.next();
		}
		 
		 return SCANNER.nextDouble();
 
	 }
	 
	 
	 public static String readString(String message) {
		 
		 System.out.print(message);
		 
		 SCANNER.nextLine();
		 
		 return SCANNER.nextLine();
	 }
	 
}
