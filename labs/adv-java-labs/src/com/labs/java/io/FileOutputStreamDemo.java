package com.labs.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String message = "Welcome to Java IO";
        // TODO: write logic to write the message into ./output/output.txt file
        try (FileOutputStream out = new FileOutputStream("./output/output.txt", true)) {
            System.out.println(out);

            // OPTION 1: Writes the message as byte array
//            byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
//            out.write(bytes);

            // OPTION 2: Writes the message byte by byte
//            byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
//            for(byte val: bytes) {
//                out.write(val);
//            }

            // OPTION 3: Writes the message char by char
            char[] chars = message.toCharArray();
            for(char val: chars) {
                out.write(val);
            }
            out.write('\n');
            System.out.println("Message written into the file successully.");

        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
