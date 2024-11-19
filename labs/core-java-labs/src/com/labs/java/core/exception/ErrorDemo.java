package com.labs.java.core.exception;

public class ErrorDemo {
    public static void main(String[] args) {
        compute(10, 20);
    }

    public static int compute(int a, int b)  {
        return compute(a,b);
    }
}
