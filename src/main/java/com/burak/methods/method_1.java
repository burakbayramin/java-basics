package com.burak.methods;

import java.util.Scanner;

public class method_1 {
    public static void main(String[] args) {
        hi();
        faktoriyel();
    }

    public static void hi() {
        System.out.println("hi");
    }

    public static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        int toplam = 1;
        int x = scan.nextInt();
        for(int i=1; i<=x; i++){
            toplam*=i;
        }
        System.out.println(toplam);
    }


}
