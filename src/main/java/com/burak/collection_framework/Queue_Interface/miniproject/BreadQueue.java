package com.burak.collection_framework.Queue_Interface.miniproject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BreadQueue {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Bread queue ......");
        Queue<String> breadQueue = new LinkedList<String>();
        Random random = new Random();

        breadQueue.offer("Ianthe");
        breadQueue.offer("Hermione");
        breadQueue.offer("Maia");
        breadQueue.offer("Erebus");
        breadQueue.offer("Atropos");
        breadQueue.offer("Jocasta");
        breadQueue.offer("Hephaestus");
        breadQueue.offer("Hermes");
        breadQueue.offer("Kepheus");
        breadQueue.offer("Daidalos");

        int breadNum = 1 + random.nextInt(10);
        System.out.println(breadNum);

        for (int i = 0; i <= breadNum; i++) {
            System.out.println(breadQueue.poll() + " takes bread");
            Thread.sleep(1000);
        }





    }
}
