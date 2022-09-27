package com.burak.collection_framework.List_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> llist = new LinkedList<Integer>();
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        time1("Linked List", llist);
        time1("ArrayList", arrlist);
        System.out.println("---------------");
        time2("Linked List", llist);
        time2("ArrayList", arrlist);
    }

    public static void time1 (String type, List<Integer> list) {
        long start;
        long finish;

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        finish = System.currentTimeMillis();
        System.out.println(type + " -> just add runtime: " + (finish - start) + "ms");

    }

    public static void time2 (String type, List<Integer> list) {
        long start;
        long finish;

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(0,i);
        }
        finish = System.currentTimeMillis();
        System.out.println(type + " -> add first index always runtime: " + (finish - start) + "ms");

    }
}
