package com.labs.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("./input/input.txt")) {

            System.out.println(in);

            int val = in.read();
            while(val != -1) {
                System.out.print((char)val);
                val = in.read();
            }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
