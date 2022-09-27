package com.burak.collection_framework.Queue_Interface.miniproject.EmergencyQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyQueue {
    public static void main(String[] args) {

        Queue<Patient> emergencyQ = new PriorityQueue<Patient>();

        emergencyQ.offer(new Patient("Alex","burn"));
        emergencyQ.offer(new Patient("Max","headache"));
        emergencyQ.offer(new Patient("Tom","burn"));
        emergencyQ.offer(new Patient("James","injury"));
        emergencyQ.offer(new Patient("Lisa","stomach ache"));

        int i = 1;
        while (emergencyQ.isEmpty() != true) {
            System.out.println("------------------");
            System.out.println("Line " + i);
            System.out.println(emergencyQ.poll());
            i++;
        }
    }
}
