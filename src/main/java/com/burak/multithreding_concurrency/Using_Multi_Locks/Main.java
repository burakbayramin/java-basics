package com.burak.multithreding_concurrency.Using_Multi_Locks;

public class Main {
    public static void main(String[] args) {

        ListWorker w1 = new ListWorker();
        w1.runThread();
    }
}
