package com.burak.inner_and_static.StaticInner;

public class Mathematic {

    public static class Area {

        public void circleArea(int r) {
            System.out.println("Area of circle is: " + (r * r * Math.PI));
        }

        public static void circleAreaStatic(int  r) {
            System.out.println("Area of circle is: " + (r * r * Math.PI));
        }

    }
}
