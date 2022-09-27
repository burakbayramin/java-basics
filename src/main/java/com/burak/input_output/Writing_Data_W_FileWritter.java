package com.burak.input_output;

import java.io.FileWriter;
import java.io.IOException;

public class Writing_Data_W_FileWritter {

    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("file3.txt");

            fw.write("The Name's Bond...\n");
            fw.write("James Bond\n");


        } catch (IOException e) {
            System.out.println("IO Exception while opening file");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error while closing file");
                }
            }
        }
    }
}
