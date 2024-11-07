package com.labs.java.core;

import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        // Read the temperature in Celsius
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        // 100.0 degree Celsius is equal to 212 in Fahrenheit

        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
        // std::cout << "Temperature in Fahrenheit is: " << fahrenheit << std::endl;

        scanner.close();
    }
}
