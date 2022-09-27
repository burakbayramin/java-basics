package com.burak.methods;

public class method_2 {
    public static void main(String[] args) {
        hi("burak");
        sum(12,22,44);
    }

    public static void hi(String name){
        System.out.println("hi " + name);
    }

    public static void sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }
}
