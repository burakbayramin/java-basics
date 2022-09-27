package com.burak.foreach;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"a", "b", "c"};

        for(String a : arr){
            System.out.print(a);
        }
        System.out.println("");
        System.out.println("-------------------");

        int[] arr2 = {1,2,3,4,5,6,};

        for(int a : arr2){
            System.out.print(a);
        }
        System.out.println("");
        System.out.println("-------------------");

        Test[] arr3 = {new Test("Alex"), new Test("John"), new Test("Michael")};
        for(Test a : arr3){
            a.write();
        }
    }
}
