package com.burak.input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("file4.txt")){
            writer.write("Test");
        } catch (IOException e) {
            System.out.println("IO Exception while creating file");
        }

        try (FileWriter w1 = new FileWriter("file5.txt");
                FileWriter w2 = new FileWriter("file6.txt")){

            w1.write("Nested fw");
            w2.write("Nested fw");

        } catch (IOException ex) {
            System.out.println("IO Exception while creating file");
        }

        try (FileWriter w3 = new FileWriter("languages.txt",true)){
            Scanner scan = new Scanner(System.in);
            String lang;

            while (true) {

                System.out.println("Enter a language");
                lang = scan.nextLine();
                if (lang.equals("-1")){
                    System.out.println("quitting ....");
                    break;
                }
                w3.write(lang + "\n");
            }


        } catch (IOException e) {
            System.out.println("IO Exception while creating file");
        }

    }
}
