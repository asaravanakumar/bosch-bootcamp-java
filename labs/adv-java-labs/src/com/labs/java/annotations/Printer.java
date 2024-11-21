package com.labs.java.annotations;

public class Printer {

    @Deprecated
    public void print() {
        System.out.println("Printing...");
        Integer no = new Integer(100);
    }
}
