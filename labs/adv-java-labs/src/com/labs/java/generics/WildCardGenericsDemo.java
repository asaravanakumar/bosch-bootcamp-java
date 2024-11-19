package com.labs.java.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardGenericsDemo {

    private List<Integer> nos = new ArrayList<>();

    private List<String> skills = List.of("Java", "Python", "JavaScript");

    public WildCardGenericsDemo() {
        nos.add(1);
        nos.add(2);
//        nos.add(3.0);
//        nos.add(10L);
        printList(nos);
        printList(skills);

        printList1(nos);
//        printList1(skills); // Not Supported

        printList2(nos);
        printList2(skills);
//        nos.add("123");
    }

    // PECS - Producer Extends Consumer Super

    // Upper Bounded Wildcard
    public void printList(List<? extends Comparable> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


    // Lower Bounded Wildcard
    public void printList1(List<? super Integer> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // Unbounded Wildcard
    public void printList2(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        WildCardGenericsDemo demo = new WildCardGenericsDemo();
//        demo.printList(demo.nos);

//        System.out.println(demo.nos);
    }
}
