package com.burak.input_output;

import java.io.*;
import java.util.Scanner;

public class FileReader_BufferedReader_BufferedWriter {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner (new FileReader("students.txt"))) {

            int i = 1;
            while (scan.hasNextLine()) {
                System.out.println("Line " + i + " " + scan.nextLine());
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error while opening file");
        }

        System.out.println("-------------------------------------------------");

        try (Scanner scan1 = new Scanner (new FileReader("students.txt"))) {

            while (scan1.hasNextLine()) {
                String studentInfo = scan1.nextLine();
                String[] arr = studentInfo.split(",");
                if (arr[1].equals("Computer Science")) {
                    System.out.println("Student information " + studentInfo);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error while opening file");
        }

        System.out.println("-------------------------------------------------");

        try (Scanner scan2 = new Scanner (new BufferedReader(new FileReader("students.txt")))) {

            while (scan2.hasNextLine()) {
                String studentInfo = scan2.nextLine();
                String[] arr = studentInfo.split(",");
                if (arr[1].equals("Computer Science")) {
                    System.out.println("Student information " + studentInfo);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error while opening file");
        }

        System.out.println("-------------------------------------------------");

        try (BufferedWriter bf = new BufferedWriter(new FileWriter("students.txt",true))) {

            bf.write("Max,Driver\n");

        } catch (IOException e) {
            System.out.println("Error while opening file");
        }


    }
}
