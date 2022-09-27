package com.burak.exception_handling;

public class Exception_Propagation {

    public static void func3(){
        int a = 42/0;
    }

    public static void func2(){
        func3();
    }

    public static void func1(){
        try {
            func2();
        } catch (ArithmeticException e) {
            System.out.println("You can't divide an integer with zero");
        }
    }

    public static void main(String[] args) {
        func1();
    }
}
