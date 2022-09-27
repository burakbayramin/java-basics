package com.burak.interfaces.miniproject;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("welcome to airport ");
        String rules = "your political ban should not exist\n" +
                "You have to pay 15 unit fees\n" +
                "you need to have your visa";
        String message = "If you want to go abroad, you have to meet all the conditions";

        while(true){
            System.out.println("----------------------------");
            System.out.println(rules);
            System.out.println("----------------------------");


            Traveller t1 = new Traveller();
            System.out.println("your fee is controlling");
            Thread.sleep(1700);
            if(t1.feeControl() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("your political ban is controlling");
            Thread.sleep(1700);
            if(t1.politicalBanControl() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("your visa is controlling");
            Thread.sleep(1700);
            if(t1.visaStatusControl() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("controlls is done you can go abroad");
            break;
        }
    }
}
