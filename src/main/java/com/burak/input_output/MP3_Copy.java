package com.burak.input_output;

import java.io.*;
import java.util.ArrayList;

public class MP3_Copy {

    private static ArrayList<Integer> content = new ArrayList<Integer>();

    public static void readFile() {

        try {
            FileInputStream fis = new FileInputStream("song.mp3");

            int read;
            while ((read = fis.read()) != -1) {
                content.add(read);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copy(String name) {

        try {
            FileOutputStream fos = new FileOutputStream(name);

            for (int val : content) {
                fos.write(val);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
         readFile();

         long start = System.currentTimeMillis();
         copy("song2.mp3");
         long fin = System.currentTimeMillis();
        System.out.println("Copy time: " + (fin - start)/1000 + " sn");
    }
}
