package com.labs.java.io;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;
    private ProductCategory category;
    private String description;
    private double price;
    private boolean active;

    public Product() {

    }

    public Product(int id, ProductCategory category, String description, double price, boolean active) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.price = price;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}


