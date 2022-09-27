package com.burak.inner_and_static.StaticInner;

public class Main {
    public static void main(String[] args) {

        Mathematic.Area area = new Mathematic.Area();
        area.circleArea(5);

        Mathematic.Area.circleAreaStatic(5);
    }
}
