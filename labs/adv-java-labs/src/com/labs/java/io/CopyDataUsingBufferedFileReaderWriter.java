package com.labs.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataUsingBufferedFileReaderWriter {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("./input/input.txt"));
             FileWriter out = new FileWriter("./output/output.txt");) {


            // OPTION 1: Transferring Data
//            in.transferTo(out);

            // OPTION 2: Read and Write Data
            // TODO: READ DATA LINE BY LINE
            String line = in.readLine();
            while(line != null) {
                System.out.println(line);
                // TODO: WRITE DATA LINE BY LINE
                out.write(line);
                out.write("\n");
                line = in.readLine();
            }


            System.out.println("File copied successfully!!!");

        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
