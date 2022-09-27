package com.burak.oop.composition;

public class Motherboard {
    private String model;
    private String producer;
    private int slots;
    private String OS;

    public Motherboard(String model, String producer, int slots, String OS) {
        this.model = model;
        this.producer = producer;
        this.slots = slots;
        this.OS = OS;
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

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void uploadOS(String OS) {
        this.OS = OS;
        System.out.println("new OS: "+ OS);
    }
}
