package com.labs.java.nio;

import com.labs.java.io.Product;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

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
        //TODO: USE NIO TO WRITE DETAILS INTO FILE
        Path fileCopy = FileSystems.getDefault().getPath("./output/product-output.txt");

        Set options = new HashSet();
        options.add(StandardOpenOption.CREATE);
        options.add(StandardOpenOption.WRITE);

        SeekableByteChannel targetbyteChannel = null;
        try {
            targetbyteChannel = Files.newByteChannel(fileCopy, options);
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            String productDetails = getProductDetails(product);
            buffer.put(productDetails.getBytes());
            buffer.flip();
            targetbyteChannel.write(buffer);

            System.out.println("Product details exported to file successfully.");

        } catch (IOException e) {
            throw new RuntimeException(e);
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
