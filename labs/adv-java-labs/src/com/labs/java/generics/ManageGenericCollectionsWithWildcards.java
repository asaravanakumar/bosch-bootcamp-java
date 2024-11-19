package com.labs.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ManageGenericCollectionsWithWildcards<E> {

    private Collection<E> items = new ArrayList<>();

    // PECS - Producer Extends Consumer Super
    // lower bounded wildcard
    public Collection<?> addItemsToCollection(Collection<E> items1) {
        // TODO: Logic to add items
//        Collection<E> items1 = new ArrayList<>();
//        items1.add((E) "Node JS");
//        items1.add((E) "PHP");
//        items.addAll(items1);
        items.addAll(items1);
        return items;
    }

    public Collection<?> getItemsInCollection() {
        return items;
    }

    // upper bounded wildcard
    public void printItemsInCollection(Collection<? extends E> items) {
        // TODO: Logic to print items
        for (Object obj : items) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        System.out.println("Manage Generic Collections With Wildcards");

        ManageGenericCollectionsWithWildcards<Integer> obj = new ManageGenericCollectionsWithWildcards();
//        List<String> items = new ArrayList<>();
//        items.add("Java");
//        items.add("Python");
//        items.add("C++");

        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5);

        Collection items1 = obj.addItemsToCollection(items);
        obj.printItemsInCollection(items1);
//        obj.printItemsInCollection(obj.getItemsInCollection());

    }
}
