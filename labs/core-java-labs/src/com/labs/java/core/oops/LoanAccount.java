package com.labs.java.core.oops;

public class LoanAccount extends Account implements PreClosable{
    private double loanAmount;
    private int tenure;

    @Override
    public void display() {
        System.out.println("Loan Account Details");
    }

    @Override
    public void preClosable() {
        System.out.println("Pre-closing Loan Account");
    }
}
