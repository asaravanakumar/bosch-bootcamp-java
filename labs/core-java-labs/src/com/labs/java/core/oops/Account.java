package com.labs.java.core.oops;

/**
 * The Account class represents a bank account having account number, account holder name and balance.
 * 1. Can't create instance for abstract class
 * 2. Can have abstract methods
 */
public abstract class Account {

    // 4 bytes + 8 bytes + 16 bytes = 28 bytes
    // properties / states
    private int accountNumber; // 0
    private String accountHolderName; // null
    protected double balance; // 0.0

    public Account() {
        System.out.println("Default Account constructor");
    }

    public Account(int accountNumber, String accountHolderName, double balance) {
        System.out.println("Overloaded Account constructor");
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

// constructor
//        public Account(int accountNumber, String accountHolderName, double balance) {
//            this.accountNumber = accountNumber;
//            this.accountHolderName = accountHolderName;
//            this.balance = balance;
//        }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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

    // methods / behaviours
    public void openAccount() {
        System.out.println("Account opened successfully");
    }

    public void closeAccount() {
        System.out.println("Account closed successfully");
    }

    public abstract void display();

//        {
//            System.out.println("Account Number: " + accountNumber);
//            System.out.println("Account Holder Name: " + accountHolderName);
//            System.out.println("Balance: " + balance);
//        }

    protected double calculateInterest() {
        return this.balance * 0.03;
    }

    public static void print() {
        System.out.println("Account class print method");
    }

//    public abstract void preClose();

}
