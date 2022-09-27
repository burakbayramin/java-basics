package com.burak.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class array_2 {
    public static void main(String[] args) {
        int[] a= fillArray(6);
        printArray(a);
        arraySort(a);

        System.out.println("----------\n");

        int[] a1 ={1,2,3,4,5};
        int[] a2 ={1,2,3,4,5};

        if(a1 ==a2){
            System.out.println("equals");
        }
        else {
            System.out.println("not equals");
        }

        if(Arrays.equals(a1,a2)){
            System.out.println("equals");
        }
        else {
            System.out.println("not equals");
        }
    }

    public static int[] fillArray(int num) {
        Scanner sc=new Scanner(System.in);
        int[] output = new int[num];

        for (int i=0; i<num; i++){
            output[i]=sc.nextInt();
        }
        return output;
    }

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void arraySort(int[] arr){
        Arrays.sort(arr);
        printArray(arr);
    }

}
