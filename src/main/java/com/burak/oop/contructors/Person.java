package com.burak.oop.contructors;

public class Person {
    String name;
    String id;
    int weight;
    double height;

    public Person(String name, String id, int weight, double height) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    public Person() {
        this("no info","no info",0,0.0);
    }

    public Person(String id, double height) {
        this("no info", id,0, height);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWight() {
        return weight;
    }

    public void setWight(int wight) {
        this.weight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showInfo() {
        System.out.println("name: "+ this.name);
        System.out.println("id: "+ this.id);
        System.out.println("weight: "+ this.weight);
        System.out.println("height: "+ this.height);
    }
}
