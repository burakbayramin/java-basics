package com.burak.multithreding_concurrency.miniprojects.ArrayBlockingQueue_ProdCons;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random rand = new Random();

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public void produce(){
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Integer value = rand.nextInt(100);
                queue.put(value);
                System.out.println("Producer makes: " + value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void consume() {
        while (true) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Integer value = queue.take();
                System.out.println("Consumer takes: " + value);
                System.out.println("Queue size: " + queue.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
