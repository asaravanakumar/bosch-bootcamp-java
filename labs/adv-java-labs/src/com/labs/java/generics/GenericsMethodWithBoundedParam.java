package com.labs.java.generics;

public class GenericsMethodWithBoundedParam {
    // Generic Method with Bounded Type Parameter
    public static <E extends Number> void printArray(E[] inputArray) {  // Type Inference
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Generics Demo");
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);
//        String[] stringArray = {"Hello", "World"};
//        printArray(stringArray);
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        printArray(doubleArray);
    }
}
