package com.burak.input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing_Data_W_FileOutputStream {
    public static void main(String[] args) {

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("file1.txt",true);

            // fos.write(66);
            // fos.write(77);

            // byte[] array = {95, 95, 98, 117, 114, 97, 107};
            // fos.write(array);

            String s = "__James Bond";
            byte[] s_array = s.getBytes();
            fos.write(s_array);

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Something went wrong while closing the file");
            }
        }

    }
}
