package com.burak.methods;

import java.util.Scanner;

public class overloadingCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String options = "press 1 for sum\n" +
                            "press q for exit";
        System.out.println(options);
        System.out.println("---------------------");

        while(true){
            String op=sc.nextLine();
            if(op.equals("q")){
                System.out.println("exit");
                break;
            }
            else if(op.equals("1")){
                System.out.println("how many nums 2 or 3: ");
                int sumop=sc.nextInt();
                if(sumop==2){
                    System.out.println("enter nums ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    sc.nextLine();
                    System.out.println("sum is "+sum(a,b));
                }
                else if(sumop==3){
                    System.out.println("enter nums ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int c=sc.nextInt();
                    sc.nextLine();
                    System.out.println("sum is: "+sum(a,b,c));
                }
                else {
                    System.out.println("error");
                }
            }
            else{
                System.out.println("wrong operation");
            }
        }
    }

    public static int sum(int x, int y, int z){
        return x+y+z;
    }

    public static int sum(int x, int y){
        return x+y;
    }
}
