package com.burak.oop.polimorphism.miniproject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("welcome to program");
        System.out.println("q for exit");
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("which beyblade do you want to create ");
            String op = sc.nextLine();
            if(op.equals("q")){
                System.out.println("program ends");
                break;
            }
            else {
                Factory factory = new Factory();
                Beyblade beyblade = factory.createBeyblade(op);

                if(beyblade == null){
                    System.out.println("invalid operation");
                }
                else{
                    beyblade.showInfo();
                    beyblade.attack();
                    beyblade.specialPowerRelease();
                }
            }
        }
    }
}
