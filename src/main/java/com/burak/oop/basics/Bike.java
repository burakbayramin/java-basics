package com.burak.oop.basics;

public class Bike {
    private String color;
    private String name;
    private String engine;
    private int price;
    private int age;

    public void setName(String bikename){
        name=bikename;
    }
    public String getName() {
        return name;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }

    public void setEngine(String engine){
        this.engine=engine;
    }
    public String getEngine(){
        return engine;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if(price<0){
            System.out.println("price cannot be negative");
        }
        else {
            this.price = price;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
