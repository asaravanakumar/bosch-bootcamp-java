package com.labs.java.generics;

// Bounds the type parameter to Number and its subclasses
public class GenericPrinterWithBoundedParam<T extends Comparable> {

    private T someValue;

    public void setSomeValue(T someValue) {
        this.someValue = someValue;
    }

    public T getSomeValue() {
        return someValue;
    }

    public void printSomeValue() {
        System.out.println(someValue);
    }
}
