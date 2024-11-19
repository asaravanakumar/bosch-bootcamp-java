package com.labs.java.generics;

public class GenericPrinterWithTwoTypes<T, U> { // Type Parameter
    private T someValue;
    private U anotherValue;

    public void setSomeValue(T someValue) {
        this.someValue = someValue;
    }

    public T getSomeValue() {
        return someValue;
    }

    public void setAnotherValue(U anotherValue) {
        this.anotherValue = anotherValue;
    }

    public U getAnotherValue() {
        return anotherValue;
    }

    public void printSomeValue() {
        System.out.println(someValue);
    }

    public void printAnotherValue() {
        System.out.println(anotherValue);
    }

    public static void main(String[] args) {
        // Generic Type - Recommended Approach
        GenericPrinterWithTwoTypes<Integer, String> printer = new GenericPrinterWithTwoTypes<>();
        printer.setSomeValue(10);
        printer.setAnotherValue("Hello");
        printer.printSomeValue();
        printer.printAnotherValue();

        // Raw Type - Not Recommended
        GenericPrinterWithTwoTypes printer1 = new GenericPrinterWithTwoTypes();
        printer1.setSomeValue(10);
        printer1.setAnotherValue("Hello");
        printer1.printSomeValue();
        printer1.printAnotherValue();
    }
}
