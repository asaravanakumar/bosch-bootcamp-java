package com.labs.java.core.oops;

public class Product implements Cloneable {
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void display() {
        System.out.println("Product Details");
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }

    public void sell() {
        System.out.println("Selling Product");
    }

    public Product createCopy() throws CloneNotSupportedException {
        return (Product) this.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Product object is cleanup");
    }

    @Override
    public String toString() {
        return "Product ID : " + productId + ", Product Name : " + productName + ", Product Price : " + productPrice;
    }
}
