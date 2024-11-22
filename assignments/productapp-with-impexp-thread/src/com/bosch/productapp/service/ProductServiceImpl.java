package com.bosch.productapp.service;

import com.bosch.productapp.exception.NoProductFoundException;
import com.bosch.productapp.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private Map<Integer, Product> products = new HashMap<>();

    @Override
    public int addProduct(Product product) {
        // TODO: VALIDATION
        product.setId(products.size() + 1);
        products.put(product.getId(), product);
        System.out.println("Product added successfully!!");
        return product.getId();
    }

    @Override
    public boolean updateProduct(int id, Product product) throws NoProductFoundException {
        if(products.containsKey(id)) {
            throw new NoProductFoundException("Invalid Product ID");
        }
        // TODO: VALIDATION
        products.replace(id, product);
        return false;
    }

    @Override
    public boolean deleteProduct(int id) throws NoProductFoundException{
        if(products.containsKey(id)) {
            throw new NoProductFoundException("Invalid Product ID");
        }
        return products.remove(id) != null;
    }

    @Override
    public Product viewProduct(int id) throws NoProductFoundException{
        if(!products.containsKey(id)) {
            throw new NoProductFoundException("Invalid Product ID");
        }
        return products.get(id);
    }

    @Override
    public List<Product> viewAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void printStatistics() {

    }

    @Override
    public boolean importProducts() {
        // TODO: Import Product details from a file
        System.out.println(Thread.currentThread().getName() + " - Importing products...");

        return true;
    }

    @Override
    public boolean exportProducts() {
        // TODO: Export Product details to a file
        System.out.println(Thread.currentThread().getName() + " - Exporting products...");


        return true;
    }
}
