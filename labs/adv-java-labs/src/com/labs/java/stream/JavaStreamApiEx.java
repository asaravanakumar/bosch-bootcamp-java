package com.labs.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamApiEx {
    public static void main(String[] args) {
//        Stream<String> cities = Stream.of("Bengaluru", "Mumbai", "Pune", "Hyderabad", "Chennai", "Kolkata");

//        Stream<String> filteredCities = cities.filter(city -> city.length() > 6);
//        Stream<String> transformedStream = filteredCities.map(city -> city.toUpperCase());
//        Stream<String> sortedStream = transformedStream.sorted();

        Collection<String> cities = Arrays.asList("Bengaluru", "Mumbai", "Pune", "Hyderabad", "Chennai", "Kolkata");

        List<Integer> output = cities
//                .stream() // sequential stream
                .parallelStream() // parallel stream
                .filter(JavaStreamApiEx::checkLength)
                .map(String::length)
                .sorted()
                .collect(Collectors.toList()); // Terminal Operatoin

        System.out.println(output);
//                .count();
                //.forEach(System.out::println);

//        System.out.println(transformedStream.count()); // 6?
//        sortedStream.forEach(System.out::println);

    }

    private static boolean checkLength(String city) {
        return city.length() > 6;
    }
}
