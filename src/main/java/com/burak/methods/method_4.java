package com.burak.methods;

public class method_4 {
    public static void main(String[] args) {
        sum(12,45);
        sum(12,45,66);
        sum(12);
    }

    public static void sum(int a,int b, int c){
        int sum=a+b+c;
        System.out.println("sum is "+sum);
    }

    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println("sum is "+sum);
    }

    public static void sum(int a){
        System.out.println("sum is "+a);
    }
}
