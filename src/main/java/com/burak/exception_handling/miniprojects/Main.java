package com.burak.exception_handling.miniprojects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static class multException extends Exception {
        @Override
        public void printStackTrace() {
            System.out.println("Numbers are so big");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String ops = "1. Sum\n"
                +"2. Sub\n"
                +"3. Mult\n"
                +"4. Div";
        System.out.println(ops);
        System.out.println("************************************");
        System.out.println("Select Op: ");
        String op = scanner.nextLine();
        int a;
        int b;
        try {
            switch(op){
                case "1":
                    System.out.print("First Number: ");
                    a = scanner.nextInt();
                    System.out.print("Second Number: ");
                    b = scanner.nextInt();
                    System.out.println("Sum : " + (a+b));
                    break;
                case "2":
                    System.out.print("First Number: ");
                    a = scanner.nextInt();
                    System.out.print("Second Number: ");
                    b = scanner.nextInt();
                    System.out.println("Subtraction: " + (a-b));
                    break;
                case "3":
                    System.out.print("First Number: ");
                    a = scanner.nextInt();
                    System.out.print("Second Number: ");
                    b = scanner.nextInt();
                    if (a > 10000 && b > 10000) {
                        throw new multException();

                    }
                    System.out.println("Multi : " + (a * b));
                    break;
                case "4":
                    System.out.print("First Number: ");
                    a = scanner.nextInt();
                    System.out.print("Second Number: ");
                    b = scanner.nextInt();
                    System.out.println("Division : " + (a / b));
                    break;
                default:
                    System.out.println("Invalid Operation");
                    
            }
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide a number by zero");
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter right format");
        } catch (multException ex) {
            ex.printStackTrace();

        }

    }
}
