package com.labs.java.generics;

public class CompareGivenValuesWithGenerics {

//    public static void compareValues(Integer a, Integer b) {
//        if (a > b) {
//            System.out.println(a + " is greater than " + b);
//        } else if (a < b) {
//            System.out.println(a + " is less than " + b);
//        } else {
//            System.out.println(a + " is equal to " + b);
//        }
//    }
//
//    public static void compareValues(String a, String b) {
//        if (a.compareTo(b) > 0){
//            System.out.println(a + " is greater than " + b);
//        } else if (a.compareTo(b) < 0) {
//            System.out.println(a + " is less than " + b);
//        } else {
//            System.out.println(a + " is equal to " + b);
//        }
//    }

    public static <E extends Comparable<E>> void compareValues(E a, E b) {
        if (a.compareTo(b) > 0){
            System.out.println(a + " is greater than " + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    public static void main(String[] args) {
        compareValues(20, 10);
        compareValues("Generics", "Demo");
//        compareValues(new Object(), new Object());
    }
}
