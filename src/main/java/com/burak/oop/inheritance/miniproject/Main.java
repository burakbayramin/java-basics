package com.burak.oop.inheritance.miniproject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome...");
        String ops = "1. IT\n" +
                "2. CEO\n" +
                "q for exit";

        while(true) {
            System.out.println("chose operation\n"+ ops);
            String operation = sc.nextLine();
            if(operation.equals("q")){
                System.out.println("program finish");
                break;
            }
            else if(operation.equals("1")) {
                IT it1 = new IT("alex","morgan",233,"Java,c,Python");
                String it_ops="1. format\n" +
                        "2. showInfo\n" +
                        "q for exit...";
                while(true){
                    System.out.println("select operation\n"+ it_ops);
                    String it_op = sc.nextLine();
                    if(it_op.equals("q")){
                        System.out.println("it ops finishing");
                        break;
                    }
                    else if(it_op.equals("1")){
                        System.out.println("OS ?");
                        String os = sc.nextLine();
                        it1.format(os);
                    }
                    else if(it_op.equals("2")){
                        it1.showInfo();
                    }
                    else{
                        System.out.println("invalid operation");
                    }
                }
            }
            else if(operation.equals("2")) {
                CEO ceo1 = new CEO("burak","bay",1,999);
                String ceo_ops = "1. raise\n" +
                        "2. showInfo\n" +
                        "q for exit";
                while(true){
                    System.out.println("select operation \n"+ ceo_ops);
                    String ceo_op =sc.nextLine();
                    if(ceo_op.equals("q")){
                        System.out.println("ceo ops finishing");
                        break;
                    }
                    else if(ceo_op.equals("1")){
                        System.out.println("raise amount? ");
                        int r1 = sc.nextInt();
                        ceo1.raise(r1);
                    }
                    else if (ceo_op.equals("2")){
                        ceo1.showInfo();
                    }
                    else{
                        System.out.println("invalid operaiton");
                    }
                }

            }
            else {
                System.out.println("invalid operation");
            }
        }

    }
}
