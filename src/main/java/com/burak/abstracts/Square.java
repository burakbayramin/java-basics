package com.burak.abstracts;

public class Square extends Shape{

    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    void calculate_area() {
        System.out.println(getName() + " area is " + (edge*edge));
    }
}
