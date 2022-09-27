package com.burak.multithreding_concurrency.Creating_Thread.Thread_1;

public class Printer extends Thread{

    @Override
    public void run() {
        System.out.println(name + " Working...");

        for (int i = 0; i<= 10; i++) {
            System.out.println(name + " prints: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " finish");
    }
    private String name;

    public Printer(String name) {
        this.name = name;
    }
}
