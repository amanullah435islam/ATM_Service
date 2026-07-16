package com.decodelabs.atminterface.exception;


public class InsufficientBalanceException
        extends ATMException {

    public InsufficientBalanceException(
            String message) {

        super(message);

    }

}