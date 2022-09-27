package com.burak.collection_framework.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue {
    // offer -> add
    // poll -> removes first element
    // peek -> shows first element in q

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");

        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("--------------");

        queue.poll();

        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("--------------");

        while (!queue.isEmpty()) {
            System.out.println("Removing -> " + queue.poll());
        }

        System.out.println("Queue is empty -> " + queue.isEmpty());



    }
}
