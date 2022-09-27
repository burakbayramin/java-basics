package com.burak.inner_and_static.NonStaticInner;

import java.util.Scanner;

public class Mathematic {
    private double pi = Math.PI;

    public class Factorial {

        public void factorial() {
            System.out.print("Enter a number ->  ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int fact = 1;
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial: " + fact);
        }
    }

    public class Prime {

        public boolean isPrime(int num) {
            int i = 2;
            while(i < num) {
                if (num % 2 == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public class Area {

        public class AreaOfCircle {

            public void areaOfCircle(int r) {
                System.out.println("Area of circle is: " + (r * r * pi));
            }
        }
    }
}
