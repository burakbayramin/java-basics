package com.burak.abstracts.miniproject;

public class Square extends Shape{

    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    public void calculateArea() {
        System.out.println(getName() + " area is: "+ (edge * edge));
    }
}
