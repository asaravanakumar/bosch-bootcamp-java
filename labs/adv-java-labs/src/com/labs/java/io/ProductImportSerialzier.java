package com.labs.java.io;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ProductImportSerialzier {
    public static void main(String[] args) {
        //TODO: Read the product details from input/product.txt
        String productDetail = readProductDetailFromFile();
        //TODO: Create product object
        Product product = createProduct(productDetail);
        //TODO: Serialize the product object
        serializeProduct(product);

    }

    public static String readProductDetailFromFile() {
        String productDetail = "";
        try (Scanner in = new Scanner(new FileReader("./input/product.txt"))) {

            while (in.hasNextLine()) {
                productDetail = in.nextLine();
            }
            System.out.println("Product Details read from the file");
        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return productDetail;
    }

    public static Product createProduct(String productDetail) {

        String[] productDetails = productDetail.split(",");
        int id = Integer.parseInt(productDetails[0]);
        ProductCategory category = ProductCategory.valueOf(productDetails[1]);
        String description = productDetails[2];
        double price = Double.parseDouble(productDetails[3]);
        boolean active = Boolean.parseBoolean(productDetails[4]);

        return new Product(id, category, description, price, active);

    }

    public static void serializeProduct(Product product) {

        try (FileOutputStream out = new FileOutputStream("./output/product.ser");
             ObjectOutputStream objOut = new ObjectOutputStream(out)) {

            objOut.writeObject(product);
            System.out.println("Product object serialized");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
