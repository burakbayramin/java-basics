package com.burak.arrays;

import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {

        int[][] arr1 = new int[2][2];
        arr1[0][0]=10;
        arr1[0][1]=20;
        arr1[1][0]=30;
        arr1[1][1]=40;

        int[][] arr2 = {{10,20},{30,40}};
        System.out.println(arr2[0][1]);
        System.out.println(arr2[1][0]);

        System.out.println("------------\n");
        
        int arr[][] = new int[2][2];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }


    }
}
