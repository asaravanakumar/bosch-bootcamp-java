package com.labs.java.stream;

import java.util.HashMap;
import java.util.Map;

public class ProductAppStreamApiEx {
    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();
        products.put(100, new Product(ProductCategory.LAPTOPS, "HP Pavilion", 45000, true));
        products.put(101, new Product(ProductCategory.MOBILES, "iPhone 16", 15000, true));
        products.put(102, new Product(ProductCategory.FURNITURES, "Table", 5000, true));
        products.put(103, new Product(ProductCategory.STATIONARY, "Pen", 50, true));
        products.put(104, new Product(ProductCategory.MOBILES, "Samsung Galaxy S24", 25000, true));
        products.put(105, new Product(ProductCategory.LAPTOPS, "Dell Inspiron", 35000, true));
        products.put(106, new Product(ProductCategory.FURNITURES, "Chair", 2500, true));
        products.put(107, new Product(ProductCategory.STATIONARY, "Pencil", 5, true));
        products.put(108, new Product(ProductCategory.MOBILES, "OnePlus 9", 45000, true));
        products.put(109, new Product(ProductCategory.LAPTOPS, "Lenovo ThinkPad", 55000, true));

//        a] No of products whose price more than 10k
        // OUTPUT: 7

//        b] Show no of products by product category with sorting
        // OUTPUT:
        // FURNITURES: 2
        // LAPTOPS: 3
        // MOBILES: 3
        // STATIONARY: 2

//        c] Show avg price by product category
        // OUTPUT:
        // FURNITURES: 3750.0
        // LAPTOPS: 45000.0
        // MOBILES: 28333.33
        // STATIONARY: 27.5

//        d] List product ids whose product name contains given name
        // OUTPUT:
        // HP Pavilion: 100
        // iPhone 16: 101
        // Dell Inspiron: 105
    }
}
