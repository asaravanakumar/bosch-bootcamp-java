package com.labs.junit;

public class Calculator {

    public int add(int a, int b) {

        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
