package com.burak.abstracts;

public class Main {
    public static void main(String[] args) {

        Square squ = new Square("Kare1",10);
        Circle cir = new Circle("Circle1",5);

        squ.calculate_area();
        cir.calculate_area();
    }

}
