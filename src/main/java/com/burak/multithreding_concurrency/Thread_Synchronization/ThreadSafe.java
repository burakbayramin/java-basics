package com.burak.multithreding_concurrency.Thread_Synchronization;

public class ThreadSafe {

    private  int count = 0;

    public synchronized void sync() {
        count++;
    }

    public void runThreads() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++){
                    sync();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++){
                    sync();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {

        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.runThreads();
    }
}
