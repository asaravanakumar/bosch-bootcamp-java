package com.labs.java.generics;

public class GenericsDemo {

//    public static void printArray(Integer[] inputArray) {
//        for (Integer element : inputArray) {
//            System.out.printf("%s ", element);
//        }
//        System.out.println();
//    }
//
//    public static void printArray(String[] inputArray) {
//        for (String element : inputArray) {
//            System.out.printf("%s ", element);
//        }
//        System.out.println();
//    }

    // Generic Method
    public static <E> void printArray(E[] inputArray) {  // Type Inference
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Generics Demo");
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);
        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        printArray(doubleArray);
    }
}
