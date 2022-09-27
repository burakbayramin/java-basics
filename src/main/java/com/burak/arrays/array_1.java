package com.burak.arrays;

import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x;
        double[] y;

        int[] a = new int[10];
        a[0]=32;
        a[4]=55;

        int[] b = {3,4,5,6,7,8,9};
        System.out.println(b[6]);
        System.out.println(b[4]);

        System.out.println("--------------\n");

        int[] c = new int[5];
        for (int i=0; i<5; i++){
            c[i]=i*4;
            System.out.println(c[i]);
        }

        System.out.println("--------------\n");

        for(int i=0; i<5; i++){
            c[i]=sc.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.println(c[i]);
        }

        System.out.println("--------------\n");

        int[] d = {123,213,213,4,55,23,421};
        System.out.println("array lenght is: "+ b.length);

        System.out.println("--------------\n");

        int[] e = {123,345,645,57,234,123,435,65789,66};
        printArray(e);
        System.out.println(average(e));

    }

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static double average(int[] arr){
        int sum =0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return ((double)sum/arr.length);
    }

}
