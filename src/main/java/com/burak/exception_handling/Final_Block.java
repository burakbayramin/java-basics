package com.burak.exception_handling;

public class Final_Block {
    public static void main(String[] args) {

        try {
            String s = "James";
            System.out.println(s.hashCode());
        } catch (NullPointerException e) {
            System.out.println("Null reference error...");
        } finally {
            System.out.println("Finally block is working...");
        }

        System.out.println("--------------");

        try {
            int a = 42/0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide a integer by zero");
        } finally {
            System.out.println("Finally block is working...");
        }
        System.out.println("Program still running");

        System.out.println("--------------");

        try {
            int a = 42/0;
        } catch (NullPointerException e) {
            System.out.println("Null reference error");
        } finally {
            System.out.println("Finally block is working...");
        }
        System.out.println("Program still running");
    }
}
