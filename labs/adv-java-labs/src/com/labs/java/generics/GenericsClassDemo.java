package com.labs.java.generics;

public class GenericsClassDemo {
    public static void main(String[] args) {
        System.out.println("Generics Class Demo");
//        IntegerPrinter obj = new IntegerPrinter();
//        obj.setSomeValue(10);
//        obj.printSomeValue();
//
//        DoublePrinter obj1 = new DoublePrinter();
//        obj1.setSomeValue(10.5);
//        obj1.printSomeValue();

        // Type Erasure

//        GenericPrinter<Integer> obj = new GenericPrinter<>();
//        obj.setSomeValue(10);
//        obj.printSomeValue();
//
//        GenericPrinter<Double> obj1 = new GenericPrinter<>();
//        obj1.setSomeValue(10.5);
//        obj1.printSomeValue();
//
//        GenericPrinter<String> obj2 = new GenericPrinter<>();
//        obj2.setSomeValue("Generics Demo");
//        obj2.printSomeValue();

        // Bounded Type Parameters

        GenericPrinterWithBoundedParam<Integer> obj3 = new GenericPrinterWithBoundedParam<>();
        obj3.setSomeValue(10);
        obj3.printSomeValue();

        GenericPrinterWithBoundedParam<Double> obj4 = new GenericPrinterWithBoundedParam<>();
        obj4.setSomeValue(10.5);
        obj4.printSomeValue();

        // compile-time error
//        GenericPrinterWithBoundedParam<String> obj5 = new GenericPrinterWithBoundedParam<>();
//        obj5.setSomeValue("Generics Demo");
//        obj5.printSomeValue();

    }
}
