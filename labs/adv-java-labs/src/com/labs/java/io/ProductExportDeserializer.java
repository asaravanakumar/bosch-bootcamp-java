package com.labs.java.io;

import java.io.*;

public class ProductExportDeserializer {
    public static void main(String[] args) {
        // TODO: Read product details from output/product.ser
        // TODO: Deserialize into product object
        Product product = deserializeProduct();
        // TODO: Write the product details to output/product-output.txt
        writeProductDetailsToFile(product);

    }

    public static Product deserializeProduct() {
        Product product = null;
        try (FileInputStream in = new FileInputStream("./output/product.ser");
             ObjectInputStream objIn = new ObjectInputStream(in);) {
            product = (Product) objIn.readObject();
            System.out.println("Deserialized product object");
        }catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return product;
    }

    public static void writeProductDetailsToFile(Product product) {
        File file = new File("./output/product-output.txt");

        try(FileWriter out = new FileWriter(file);) {
            out.write(getProductDetails(product));
            System.out.println("Product details written to the file");
        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static String getProductDetails(Product product) {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getId()).append(",");
        sb.append(product.getCategory()).append(",");
        sb.append(product.getDescription()).append(",");
        sb.append(product.getPrice()).append(",");
        sb.append(product.isActive());

        return sb.toString();
    }
}
