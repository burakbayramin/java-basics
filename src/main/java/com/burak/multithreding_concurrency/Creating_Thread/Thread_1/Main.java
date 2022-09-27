package com.burak.multithreding_concurrency.Creating_Thread.Thread_1;

public class Main {
    public static void main(String[] args) {

        Printer p1 = new Printer("Printer 1");
        Printer p2 = new Printer("Printer 2");

        p1.start();
        p2.start();

        System.out.println("Main thread working...");
    }
}
