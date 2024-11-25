package com.labs.java.fp;

import java.util.function.BiFunction;

public class CalcMain {
    public static void main(String[] args) {
//        CalcOOP calc = new CalcOOP(10, 5);
//        System.out.println("Addition: " + calc.add());
//        System.out.println("Subtraction: " + calc.subtract());
//        System.out.println("Multiplication: " + calc.multiply());
//        System.out.println("Division: " + calc.divide());
//
//        CalcOOP calc1 = new CalcOOP(10, 20);
//        System.out.println("Addition: " + calc1.add());
//        System.out.println("Subtraction: " + calc1.subtract());
//        System.out.println("Multiplication: " + calc1.multiply());
//        System.out.println("Division: " + calc1.divide());

//        CalcFP calcFP = new CalcFP();
//        System.out.println("Addition: " + calcFP.add(10, 5));
//        System.out.println("Subtraction: " + calcFP.subtract(20, 10));
//        System.out.println("Multiplication: " + calcFP.multiply(15, 3));
//        System.out.println("Division: " + calcFP.divide(50, 5));

        // Named Class
        Operation addition = new Addition();

        // Annonymous inner Class
        // OPTION #2
        Operation subtraction = new Operation(){
            @Override
            public int compute(int a, int b) {
                return a - b;
            }
        };

        // OPTION #3
        Operation multiplication = (int a, int b) -> {
            return a * b;
        }; //Lambda Expression

        // Option #4
        BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;



        CalcFP calcFP = new CalcFP();
        System.out.println("Addition: " + calcFP.compute(10, 5, addition));
        System.out.println("Subtraction: " + calcFP.compute(10, 5, subtraction));
        System.out.println("Multiplication: " + calcFP.compute(10, 5, multiplication));
        System.out.println("Division: " + calcFP.compute(10, 5, division::apply));

    }

    // OPTION #1
    static class Addition implements Operation {
        @Override
        public int compute(int a, int b) {
            return a + b;
        }
    }

}
