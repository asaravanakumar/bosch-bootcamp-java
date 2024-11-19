package com.labs.java.core.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
            readData();
    }

    public static void readData()  {
       // try with resources
        try(Scanner in = new Scanner(new FileReader("input.txt"));
            FileWriter out = new FileWriter("output.txt");) {

            // read the data
            String data = in.nextLine();
            System.out.println(data);

            // write the data
            out.write(data);
        } catch (IOException e) {
            System.out.println("File Not Found: " + e.getMessage());
        }

//        finally {
//            System.out.println("Closing the file");
//            if (in != null) {
//                in.close();
//            }
//        }

        // some logic


    }
}
