package com.burak.inner_and_static.MiniProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String operations = "Select operation\n" +
                "1. Find area of circle\n" +
                "2. Find perimeter of triangle\n" +
                "3. Find dot product of vectors\n" +
                "Exit -> q";

        while(true) {
            System.out.println(operations);
            String op = scan.nextLine();
            if (op.equals("q")){
                System.out.println("Program finished");
                break;
            } else if (op.equals("1")) {
                System.out.print("Enter radius -> ");
                int r = scan.nextInt();
                Problem.Mathematics.circleArea(r);
            } else if (op.equals("2")) {
                System.out.print("Enter edge 1 -> ");
                int e1 = scan.nextInt();
                System.out.println();
                System.out.print("Enter edge 2 -> ");
                int e2 = scan.nextInt();
                System.out.println();
                System.out.print("Enter edge 3 -> ");
                int e3 = scan.nextInt();
                Problem.Mathematics.trianglePerimeter(e1, e2, e3);
            } else if (op.equals("3")) {
                Vec v1 = new Vec("Vector 1");
                Vec v2 = new Vec("Vector 2");
                Problem.Physics.dotProduct(v1, v2);
            } else {
                System.out.println("Invalid operation");
            }

        }

    }
}
