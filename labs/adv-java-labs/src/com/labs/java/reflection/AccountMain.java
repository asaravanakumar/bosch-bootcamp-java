package com.labs.java.reflection;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1, 1000.0, "John Doe");
        System.out.println(account.checkBalance());
        System.out.println(account.calculateBalance());
    }
}
