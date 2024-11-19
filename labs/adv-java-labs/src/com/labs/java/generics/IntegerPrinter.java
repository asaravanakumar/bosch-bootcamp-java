package com.labs.java.generics;

public class IntegerPrinter {

    private Integer someValue;

    public void setSomeValue(Integer someValue) {
        this.someValue = someValue;
    }

    public Integer getSomeValue() {
        return someValue;
    }

    public void printSomeValue() {
        System.out.println(someValue);
    }
}
