package com.labs.java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataUsingFileReaderWriter {
    public static void main(String[] args) {
        try (FileReader in = new FileReader("./input/input.txt");
             FileWriter out = new FileWriter("./output/output.txt");) {


            // OPTION 1: Transferring Data
//            in.transferTo(out);

            // OPTION 2: Read and Write Data
            // TODO: READ DATA
            int ch = in.read();
            while(ch != -1) {

                // TODO: WRITE DATA

                out.write(String.valueOf((char)ch).toUpperCase());
                ch = in.read();
            }


            System.out.println("File copied successfully!!!");

        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
