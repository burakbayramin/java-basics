package com.burak.oop.inheritance;

public class Dog extends Animal{
    private int age;

    public Dog(String name, int weight, int height, int age) {
        super(name, weight, height);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run (int speed) {
        System.out.println("dog is running");
        super.speed(speed);
    }
}
