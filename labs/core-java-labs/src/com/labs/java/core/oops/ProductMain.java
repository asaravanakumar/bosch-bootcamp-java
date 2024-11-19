package com.labs.java.core.oops;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", 45000.00);
        product.display();
        product.sell();

        try {
            Product product1 = product.createCopy();
            product1.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error while cloning: " + e.getMessage());
            e.printStackTrace();
//            System.exit(1);
        }

        System.out.println(product);

    }
}
