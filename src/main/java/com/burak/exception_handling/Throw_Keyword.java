package com.burak.exception_handling;

import java.util.Scanner;

public class Throw_Keyword {

    public static void ageControl(int age){

        if (age < 18) {
            throw new ArithmeticException();
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
        } catch (ArithmeticException e) {
            System.out.println("You're too young to get in here");
        }
    }
}
