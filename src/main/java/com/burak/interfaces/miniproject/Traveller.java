package com.burak.interfaces.miniproject;

import java.util.Scanner;

public class Traveller implements AbroadRules{
    private int fee;
    private boolean politicalBan;
    private boolean visaStatus;

    public Traveller() {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter your fee ");
        this.fee = sc.nextInt();
        sc.nextLine();
        System.out.println("do you have a political ban ? (yes or no)");
        String answer = sc.nextLine();
        if(answer.equals("yes")){
            this.politicalBan=true;
        }
        else{
            this.politicalBan=false;
        }
        System.out.println("do you have visa ? (yes or no)");
        String answer2 = sc.nextLine();
        if(answer2.equals("yes")){
            this.visaStatus=true;
        }
        else{
            this.visaStatus=false;
        }

    }

    @Override
    public boolean feeControl() {
       if(this.fee < 15) {
           System.out.println("please pay your fee fully");
           return false;
       }
       else{
           System.out.println("fee process is done");
           return true;
       }
    }

    @Override
    public boolean politicalBanControl() {
        if(this.politicalBan == true){
            System.out.println("you have political ban you cant go abroad");
            return false;
        }
        else {
            System.out.println("you can go abroad");
            return true;
        }
    }

    @Override
    public boolean visaStatusControl() {
        if(this.visaStatus ==true){
            System.out.println("visa process is done you can go abroad");
            return true;
        }
        else {
            System.out.println("you cant go abroad");
            return false;
        }
    }
}
