package com.labs.java.fp;

import java.util.Arrays;
import java.util.function.*;

public class LambExpEx {
    public static void main(String[] args) {
        //  Write lambda expression for the following:
        // 1. Check if a sum of two given number is even (true) or odd (false).
        // Input: 10, 20
        // Output: true

        // Input: 10, 15
        // Output: false

        BiPredicate<Integer, Integer> isEven = (a, b) -> (a + b) % 2 == 0;
        System.out.println(isEven.test(10, 20));
        System.out.println(isEven.test(10, 15));

        // 2. Check if a given number is prime.
        // Input: 17
        // Output: true

        // Input: 15
        // Output: false

        Predicate<Integer> isPrime = (n) -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Is 17 prime? " + isPrime.test(17));
        System.out.println("Is 15 prime? " + isPrime.test(15));

        // 3. Get an array of integers and return the sum of the squares of all the even numbers in the array.
        // Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // Output: [2, 4, 6, 8, 10] => 2^2 + 4^2 + 6^2 + 8^2 + 10^2 = 4 + 16 + 36 + 64 + 100 = 220

        Supplier<Integer[]> nos = () -> new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Function<Integer[], Integer> sqrOfEvenNos = (arr) -> {
            int sum = 0;
            for (int i : arr) {
                if (i % 2 == 0) {
                    sum += i * i;
                }
            }
            return sum;
        };

        System.out.println("Sum of squares of even numbers: " + sqrOfEvenNos.apply(nos.get()));

        // 4. Compare two Strings and return 0 if they are equal, a positive value if the first String is lexicographically greater, and a negative value otherwise.//
        // Input: "Hello", "Hello"
        // Output: 0

        // Input: "Hello", "Bosch"
        // Output: 1

        // Input: "All", "Bosch"
        // Output: -1

        BiFunction<String, String, Integer> compareStrings = (s1, s2) -> s1.compareTo(s2);
        System.out.println("Hello vs Hello: " + compareStrings.apply("Hello", "Hello"));
        System.out.println("Hello vs Bosch: " + compareStrings.apply("Hello", "Bosch"));
        System.out.println("All vs Bosch: " + compareStrings.apply("All", "Bosch"));

        // 5. Sort an array of Strings in ascending order of their length and print the sorted array.
        // Input: ["Hello", "Bosch", "Welcome", "To", "Java"]
        // Output: ["To", "Java", "Hello", "Bosch", "Welcome"]

        Supplier<String[]> strArr = () -> new String[]{"Hello", "Bosch", "Welcome", "To", "Java"};
        Consumer<String[]> sortNPrint = (arr) -> {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].length() > arr[j].length()) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    } }
            }
//            Arrays.sort(arr);
            for (String s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        };

        sortNPrint.accept(strArr.get());
    }
}
