package com.labs.java.nio;

import com.labs.java.io.Product;
import com.labs.java.io.ProductCategory;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
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
        StringBuilder productDetail = new StringBuilder();
        // TODO: USE NIO TO READ DATA
        Path filePath = FileSystems.getDefault().getPath("./input/product.txt");
        try {
            SeekableByteChannel channel = Files.newByteChannel(filePath);
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while(channel.read(buffer) > 0) {
                buffer.flip();
                while(buffer.hasRemaining()) {
                    productDetail.append((char)buffer.get());
                }
                buffer.clear();
            }
            System.out.println("Read data from the file: " + productDetail.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return productDetail.toString();
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
