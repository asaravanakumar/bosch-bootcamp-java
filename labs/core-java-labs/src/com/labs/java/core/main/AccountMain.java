package com.labs.java.core.main;

import com.labs.java.core.oops.Account;

// java AccountMain
public class AccountMain {

    public static void main(String[] args) throws InterruptedException {
//            Account account = new Account(101, "John", 5000);

        // It won't work as Account is abstract class
//        Account account = new Account(); // 8 bytes
//            account.deposit(1000);
//            account.withdraw(2000);
//        account.display();

//        SavingsAccount savings = new SavingsAccount();
//        savings.setAccountNumber(101);
//        savings.setAccountHolderName("Arjun");
//        savings.setBalance(5000);

        SavingsAccount savings = new SavingsAccount(101, "Arjun", 5000);

//        savings.deposit(1000); // 6000
//        savings.withdraw(500); // 5500
//        savings.deposit(2000, true); // 7500
//        savings.display(); // 7500
//        System.out.println("Interest: " + savings.calculateInterest()); // 375.0
        savings.print();

        Account savings1 = (Account) savings;
        savings1.print();

//        savings1.display();

        // Dynamic Method Dispatch
//        System.out.println("*****");
//        Account savings2 = new SavingsAccount(101, "Arjun", 5000);
//        savings2.display();
//
//        System.out.println("##############");
//        DepositAccount deposit = new DepositAccount(102, "Ravi", 10000, 50000, 5);
//        deposit.display();
//
//        Account deposit1 = new DepositAccount(102, "Ravi", 10000, 50000, 5);
//        deposit1.display();
//
//        PreClosable deposit2 = new DepositAccount(102, "Ravi", 10000, 50000, 5);
//        deposit2.preClosable();
//
//        Thread.sleep(1000 * 30 * 5);
//        System.out.println("Deposit Interest: " + deposit.calculateInterest());


    }
}
