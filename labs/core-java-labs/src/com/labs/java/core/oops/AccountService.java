package com.labs.java.core.oops;

public class AccountService {

    private Account[] accounts = new Account[10];

//    public boolean addAccount(Account account) {
//        // TODO: Add account to accounts array;
//    }
//
//    public boolean updateAccount(int id, Account account) {
//        // TODO: Add account to accounts array;
//    }
//
//    public Account getAccount(int id) {
//        return  null;
//    }
//
//    public boolean deleteAccount(int id) {
//        return false;
//    }

    public void computeInterest(Account account) {
        account.calculateInterest();
    }
}
