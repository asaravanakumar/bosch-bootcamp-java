package com.labs.java.core.oops;

import static com.labs.java.core.oops.AccountConstants.DEPOSIT_INTEREST_RATE;
import static com.labs.java.core.oops.AccountConstants.SAVINGS_INTEREST_RATE;

public class DepositAccount extends Account implements PreClosable{
    private double depositAmount;
    private int tenure;

    public DepositAccount(int accountNumber, String accountHolderName, double balance, double depositAmount, int tenure) {
        super(accountNumber, accountHolderName, balance);
        this.depositAmount = depositAmount;
        this.tenure = tenure;
    }


    @Override
    public void display() {
        System.out.println("Deposit Account Details");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Tenure: " + tenure);
        System.out.println("Deposit Interest: " + calculateInterest());
    }

    @Override
    public double calculateInterest() {
        return getBalance() * DEPOSIT_INTEREST_RATE;
    }

    @Override
    public void preClosable() {
        System.out.println("Pre-closing Deposit Account");
    }
}
