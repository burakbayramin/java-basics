package com.burak.abstracts;

public class Circle extends Shape{

    private int radius;



    public Circle(String name, int radius) {
        super(name);
        this.radius=radius;

    }



    @Override
    void calculate_area() {
            System.out.println(getName()+" area of circle is "+ (Math.PI * (Math.pow(radius, 2))));


    }
}
