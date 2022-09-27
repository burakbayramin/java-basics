package com.burak.inner_and_static.StaticKeyword;

public class Main {
    public static void main(String[] args) {

        Audience a1 = new Audience("Obi Wan");
        Audience a2 = new Audience("James Bond");
        Audience a3 = new Audience("Master Yoda");

        a1.watchShow();
        a3.watchShow();

        System.out.println("Audience number is: " + Audience.audienceNum);
        System.out.println("Audience number is: " + a1.audienceNum);
        System.out.println("Audience number is: " + a2.audienceNum);

        System.out.println("---------------");

        System.out.println("Audience number is: " + Audience.getPrivAudienceNum());
        System.out.println("Audience number is: " + a3.getPrivAudienceNum());


    }
}
