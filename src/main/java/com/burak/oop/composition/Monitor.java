package com.burak.oop.composition;

public class Monitor {
    private String model;
    private String producer;
    private String size;
    private Resolution resolution; // we create object from resolution class

    public Monitor(String model, String producer, String size, Resolution resolution) {
        this.model = model;
        this.producer = producer;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public void closeMonitor() {
        System.out.println("monitor closing...");
    }
}
