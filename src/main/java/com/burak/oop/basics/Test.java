package com.burak.oop.basics;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name="BMW";
        car1.color="black";
        car1.engine="I6";
        car1.price=120000;
        car1.age=6;

        Bike bike1 = new Bike();
        bike1.setName("Ducati");
        System.out.println("model: "+ bike1.getName());
        bike1.setColor("red");
        System.out.println("color: "+ bike1.getColor());
        bike1.setEngine("V2");
        System.out.println("engine: "+ bike1.getEngine());
        bike1.setPrice(-12);
        System.out.println("price: " + bike1.getPrice());
    }
}
