package com.burak.multithreding_concurrency.Creating_Thread.Thread_2;

public class Print implements Runnable{

    private String name;

    public Print(String name) {
        this.name = name;
    }

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
}
