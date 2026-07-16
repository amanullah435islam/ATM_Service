package com.decodelabs.atminterface.controller;

import com.decodelabs.atminterface.constant.AppConstants;
import com.decodelabs.atminterface.exception.ATMException;
import com.decodelabs.atminterface.service.ATMService;
import com.decodelabs.atminterface.ui.ConsoleUI;

public class ATMController {

    private final ConsoleUI consoleUI;
    private final ATMService atmService;

    public ATMController(ConsoleUI consoleUI,
                         ATMService atmService) {

        this.consoleUI = consoleUI;
        this.atmService = atmService;
    }

    public void start() {

        consoleUI.showWelcomeMessage();

        boolean running = true;

        while (running) {

            consoleUI.showMenu();

            int choice = consoleUI.readMenuChoice();

            switch (choice) {

                case AppConstants.DEPOSIT_OPTION ->
                        handleDeposit();

                case AppConstants.WITHDRAW_OPTION ->
                        handleWithdraw();

                case AppConstants.BALANCE_OPTION ->
                        handleBalance();

                case AppConstants.EXIT_OPTION -> {

                    consoleUI.showExitMessage();

                    running = false;
                }

                default ->
                        consoleUI.showErrorMessage(
                                AppConstants.INVALID_MENU);
            }
        }
    }

    private void handleDeposit() {

        executeTransaction(() -> {

            double amount = consoleUI.readAmount();

            atmService.deposit(amount);

            consoleUI.showSuccessMessage(
                    AppConstants.DEPOSIT_SUCCESS);

        });

    }

    private void handleWithdraw() {

        executeTransaction(() -> {

            double amount = consoleUI.readAmount();

            atmService.withdraw(amount);

            consoleUI.showSuccessMessage(
                    AppConstants.WITHDRAW_SUCCESS);

        });

    }

    private void handleBalance() {

        consoleUI.showBalance(

                atmService.checkBalance()

        );

    }

    private void executeTransaction(Runnable action) {

        try {

            action.run();

        } catch (ATMException ex) {

            consoleUI.showErrorMessage(

                    ex.getMessage()

            );

        }

    }

}