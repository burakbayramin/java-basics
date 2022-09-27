package com.burak.inner_and_static.LocalInner;

public class Main {
    public static void main(String[] args) {

        class Area {

            public void circleArea(int r){
                System.out.println("Area of circle is: " + (r * r * Math.PI));
            }
        }

        Area area1 = new Area();
        Area area2 = new Area();

        area1.circleArea(5);
        area2.circleArea(12);


    }

    public static void test() {
        // Area area3 = new Area();
    }
}
