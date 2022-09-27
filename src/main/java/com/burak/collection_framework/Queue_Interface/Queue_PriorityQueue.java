package com.burak.collection_framework.Queue_Interface;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {
    // clear -> clears queue
    // contains -> if contains true else false
    // size -> returns number of elements

    static class Driver implements Comparable<Driver>{
        private String name;
        private int wchamp;

        public Driver(String name, int wchamp) {
            this.name = name;
            this.wchamp = wchamp;
        }

        @Override
        public String toString() {
            return "Driver{" +
                    "name='" + name + '\'' +
                    ", wchamp=" + wchamp +
                    '}';
        }

        @Override
        public int compareTo(Driver o) {
            if (this.wchamp < o.wchamp) {
                return 1;
            } else if (this.wchamp > o.wchamp) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {


        Queue<Integer> numQueue = new PriorityQueue<Integer>();

        numQueue.add(5);
        numQueue.add(3);
        numQueue.add(1);
        numQueue.add(4);
        numQueue.add(6);
        numQueue.add(2);

        for (Integer i  : numQueue) {
            System.out.println(i);
        }

        System.out.println("--------------");

        while (!numQueue.isEmpty()) {
            System.out.println(numQueue.poll());
        }

        System.out.println("--------------");

        Queue<Driver> driverQueue = new PriorityQueue<Driver>();

        driverQueue.offer(new Driver("Vettel",4));
        driverQueue.offer(new Driver("Schumacher",7));
        driverQueue.offer(new Driver("Senna",3));
        driverQueue.offer(new Driver("Hunt",1));
        driverQueue.offer(new Driver("Lauda",3));

        while (!driverQueue.isEmpty()) {
            System.out.println(driverQueue.poll());
        }
    }
}
