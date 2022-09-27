package com.burak.multithreding_concurrency.Creating_Thread.Thread_2;

public class Main {
    public static void main(String[] args) {

        Thread p1 = new Thread(new Print("Print 1"));
        Thread p2 = new Thread(new Print("Print 2"));

        p1.start();
        p2.start();

        System.out.println("Main thread working...");


    }
}
