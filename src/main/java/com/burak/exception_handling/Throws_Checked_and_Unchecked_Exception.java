package com.burak.exception_handling;

import java.io.IOException;
import java.util.Scanner;

public class Throws_Checked_and_Unchecked_Exception {

    public static void ageControl(int age) throws IOException {

        if (age < 18) {
            throw new IOException();
        } else {
            System.out.println("You can enter to the place");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age ->  ");
        int age = scan.nextInt();

        try {
            ageControl(age);
        } catch (IOException e) {
            System.out.println("IOException created...");
        }
    }
}
