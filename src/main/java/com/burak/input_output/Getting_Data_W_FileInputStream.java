package com.burak.input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Getting_Data_W_FileInputStream {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file2.txt");

            /*System.out.println("First char in text: " + (char)fis.read());
            System.out.println("Second char in text: " + (char)fis.read());
            System.out.println("Third char in text: " + (char)fis.read());
            System.out.println("Fourth char in text: " + (char)fis.read());*/

            /*fis.skip(11);
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());*/

            int value;
            String s = "";
            while ((value = fis.read()) != -1) {
                    s += (char) value;
            }
            System.out.println("Text: " + s);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error while reading text");
        } finally {
            try {
                if (fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Something went wrong while closing the file");
            }
        }
    }
}
