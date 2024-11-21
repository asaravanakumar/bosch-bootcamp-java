package com.labs.java.reflection;

import java.lang.reflect.Method;

public class Account {
    private int id;
    private double balance;
    private String name;

    public Account() {

    }

    public Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public double checkBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @ApplyInterest(roi=7.5)
    public double calculateBalance() {
        // return balance applying interest rate
        double calculatedBalance = 0.0;
        try {
            Method method = this.getClass().getMethod("calculateBalance");
            if(method.isAnnotationPresent(ApplyInterest.class)) {
                double roi = method.getAnnotation(ApplyInterest.class).roi();
                calculatedBalance = this.balance + (this.balance * roi / 100);
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return calculatedBalance;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", balance=" + balance + ", name=" + name + "]";
    }
}
