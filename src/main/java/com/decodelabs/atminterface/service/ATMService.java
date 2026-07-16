package com.decodelabs.atminterface.service;

import com.decodelabs.atminterface.constant.AppConstants;
import com.decodelabs.atminterface.exception.InsufficientBalanceException;
import com.decodelabs.atminterface.exception.InvalidAmountException;
import com.decodelabs.atminterface.model.BankAccount;

public class ATMService {

    private final BankAccount bankAccount;

    public ATMService(BankAccount bankAccount) {

        this.bankAccount = bankAccount;

    }

    public void deposit(double amount) {

        validateAmount(amount);

        bankAccount.setBalance(

                bankAccount.getBalance() + amount

        );

    }

    public void withdraw(double amount) {

        validateAmount(amount);

        if (amount > bankAccount.getBalance()) {

            throw new InsufficientBalanceException(

                    AppConstants.INSUFFICIENT_BALANCE

            );

        }

        bankAccount.setBalance(

                bankAccount.getBalance() - amount

        );

    }

    public double checkBalance() {

        return bankAccount.getBalance();

    }

    public BankAccount getBankAccount() {

        return bankAccount;

    }

    private void validateAmount(double amount) {

        if (amount < AppConstants.MIN_TRANSACTION_AMOUNT) {

            throw new InvalidAmountException(

                    AppConstants.INVALID_AMOUNT

            );

        }

    }

}




