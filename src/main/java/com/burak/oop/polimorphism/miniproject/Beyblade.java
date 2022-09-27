package com.burak.oop.polimorphism.miniproject;

public class Beyblade {
    private String owner_name;
    private int speed;
    private int power;

    public Beyblade(String owner_name, int speed, int power) {
        this.owner_name = owner_name;
        this.speed = speed;
        this.power = power;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void attack() {
        System.out.println(getOwner_name()+ " " + power + " and " + speed + " is attacking...");
    }

    public void specialPowerRelease() {
        System.out.println("no special power...");
    }

    public void showInfo() {
        System.out.println("owner name: " + owner_name);
        System.out.println("speed: "+ speed);
        System.out.println("power: "+ power);
    }
}
