package com.burak.collection_framework.Queue_Interface.miniproject.EmergencyQueue;

public class Patient implements Comparable<Patient>{
    private String name;
    private String complaint;
    private int priority;

    public Patient(String name, String complaint) {
        this.name = name;
        this.complaint = complaint;

        if (complaint.equals("injury")) {
            this.priority = 3;
        } else if (complaint.equals("burn")) {
            this.priority = 2;
        } else {
            this.priority = 1;
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", complaint='" + complaint + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Patient patient) {
        if (this.priority > patient.priority) {
            return -1;
        } else if (this.priority < patient.priority) {
            return 1;
        } else {
            return 0;
        }
    }
}
