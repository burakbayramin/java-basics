package com.burak.oop.inheritance;

public class Animal {
    private String name;
    private int weight;
    private int height;

    public Animal(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void eat() {
        System.out.println("eating... ");
    }

    public void speed (int speed) {
        System.out.println("the speed of animal is " + speed + "km/s");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
