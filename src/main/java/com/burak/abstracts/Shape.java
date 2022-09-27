package com.burak.abstracts;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say_name() {
        System.out.println("this objects name: " + this.name);
    }

    abstract void calculate_area();
}
