package com.burak.abstracts.miniproject;

public class Circle extends Shape{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * (Math.pow(radius, 2));
        System.out.println(getName() + " area is: " + area);
    }
}
