package com.labs.java.core.main;

import com.labs.java.core.oops.Account;

import static com.labs.java.core.oops.AccountConstants.*;
public class SavingsAccount extends Account {


    // default constructor be available
    // if we don't provide any constructor
    public SavingsAccount() {
        System.out.println("Savings Account Default Constructor");
    }

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        System.out.println("Savings Account Parameterized Constructor");
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // method overloading
    // 1. method name should be same
    // 2. method signature should be different
    // 3. return type doesn't matter
    public double deposit(double amount, boolean isSalary) {
        balance += amount;
        return balance;
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void display() {
        System.out.println("Savings Account Details");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Savings Interest: " + calculateInterest());
    }

    // method overriding
    // 1. method name should be same
    // 2. method signature should be same
    // 3. method return should return same type or sub-type
    @Override
    public double calculateInterest() {
//        return super.calculateInterest();
        return getBalance() * SAVINGS_INTEREST_RATE;
    }

    // Can't override static method
//    public static void print() {
//        System.out.println("Savings Account class print method");
//    }

    // 1. Private
    // 2. default
    // 3. protected
    // 4. Public
}
