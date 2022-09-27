package com.burak.abstracts.miniproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String operations = "Operations....\n" +
                "1. Find area of Square\n" +
                "2. Find are of Triangle\n" +
                "3. Find are of Circle\n" +
                "Press q for exit...";

        while (true) {
            System.out.println(operations);
            System.out.println("Please select shape...");
            String shapeType = scan.nextLine();
            Shape shape = null;

            if (shapeType.equals("q")) {
                System.out.println("Exiting the program...");
                break;
            } else if (shapeType.equals("1")) {
                System.out.println("Enter the edge: ");
                int edge = scan.nextInt();
                scan.nextLine();
                shape = new Square("Square1", edge);
                shape.calculateArea();
            } else if (shapeType.equals("2")) {
                System.out.println("Enter the edges");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                scan.nextLine();
                shape = new Triangle("Triangle1", a, b, c);
                shape.calculateArea();
            } else if (shapeType.equals("3")) {
                System.out.println("Enter the radius");
                double r = scan.nextDouble();
                scan.nextLine();
                shape = new Circle("Circle1", r);
                shape.calculateArea();
            } else {
                System.out.println("Invalid operator !!!!");
            }

        }
    }
}
