package com.burak.methods;
import java.util.Scanner;

public class method_3 {
    public static void main(String[] args) {
        System.out.println("sum is " + sum(44,33,22));
        System.out.println(fname("burak", "bay"));
        System.out.println(age(21));
        System.out.println("hello " + fname("bur","bay") + " your age: " +age(21));
        System.out.println(add_a(multiply(6)));
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }

    public static String fname(String name, String surname){
        return name + surname;
    }

    public static int age(int a){
        return a;
    }

    public static int multiply(int a){
        return a*4;
    }

    public static int add_a(int b){
        return b+8;
    }
}
