package com.burak.methods;

import java.util.Scanner;

public class ebob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num: ");
        int num1=sc.nextInt();
        System.out.println("enter sec num: ");
        int num2=sc.nextInt();
        System.out.println("ebob is: "+ findEbob(num1,num2));

    }

    public static int findEbob(int a, int b){
        int ebob = 1;
        for(int i=1; (i<=a && i<=b); i++){
            if((a % i == 0) && (b % i == 0)){
                ebob=i;
            }
        }
        return ebob;
    }

}
