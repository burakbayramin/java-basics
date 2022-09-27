package com.burak.multithreding_concurrency.Creating_Thread.Thread_3;

public class Main {
    public static void main(String[] args) {

        Thread p1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 working...");
                for (int i = 0; i<= 10; i++) {
                    try {
                        System.out.println("Printing: " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread p2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 working...");
                for (int i = 0; i<= 10; i++) {
                    try {
                        System.out.println("Printing: " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 working...");
                for (int i = 0; i<= 10; i++) {
                    try {
                        System.out.println("Printing: " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        p1.start();
        p2.start();
        System.out.println("main thread working...");
    }
}
