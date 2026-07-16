package com.decodelabs.atminterface.model;

public class BankAccount {
	
  private String accountHolderName;
  
  private double balance;
  
  
  public BankAccount() {

  }

  public BankAccount(String accountHolderName, double balance) {
      this.accountHolderName = accountHolderName;
      this.balance = balance;
  }

  
  
  public String getAccountHolderName() {
      return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
      this.accountHolderName = accountHolderName;
  }

  public double getBalance() {
      return balance;
  }

  public void setBalance(double balance) {
      this.balance = balance;
  }
  
}
