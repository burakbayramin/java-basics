package com.burak.inner_and_static.NonStaticInner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Mathematic.Factorial fac = new Mathematic().new Factorial();
        Mathematic.Prime prm = new Mathematic().new Prime();
        Mathematic.Area a = new Mathematic().new Area();
        Mathematic.Area.AreaOfCircle circlearea = new Mathematic().new Area().new AreaOfCircle();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number ->  ");
        int num = scan.nextInt();

        if(prm.isPrime(num)){
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is not prime");
        }

        fac.factorial();

        System.out.print("Enter the radius ->  ");
        int rad = scan.nextInt();
        // a.areaOfCircle(rad);
        circlearea.areaOfCircle(rad);

    }
}
