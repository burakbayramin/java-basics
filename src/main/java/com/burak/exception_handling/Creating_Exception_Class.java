package com.burak.exception_handling;

import java.util.Scanner;

public class Creating_Exception_Class {

    public static class InvalidAgeException extends ArithmeticException {

        public InvalidAgeException(String message) {
            super(message);
        }

        @Override
        public void printStackTrace() {
            System.out.println("This is invalid age error");
        }
    }

    public static void ageControl(int age){

        if (age < 18) {
            throw new InvalidAgeException("Invalid age");
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
        } catch (InvalidAgeException e) {
            e.printStackTrace();
            System.out.println("-----------");
            System.out.println(e);
        }
    }
}
