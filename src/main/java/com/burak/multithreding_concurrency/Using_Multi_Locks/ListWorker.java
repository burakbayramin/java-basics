package com.burak.multithreding_concurrency.Using_Multi_Locks;

import java.util.ArrayList;
import java.util.Random;

public class ListWorker {

    Random rand = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    private Object lock1 = new Object();
    private Object lock2 = new Object();


    public void list1add() {

        synchronized(lock1) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list1.add(rand.nextInt(100));
        }
    }

    public void list2add() {

        synchronized(lock2) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list2.add(rand.nextInt(100));
        }
    }

    public void addValue() {

        for (int i = 0; i < 1000; i++) {
            list1add();
            list2add();
        }
    }

    public void runThread() {
        Thread tr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                addValue();
            }
        });

        Thread tr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                addValue();
            }
        });

        long start = System.currentTimeMillis();
        tr1.start();
        tr2.start();

        try {
            tr1.join();
            tr2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("List1: " + list1.size() + " List2: " + list2.size());
        long finish = System.currentTimeMillis();
        System.out.println("TIme: " + (finish - start));
    }
}
