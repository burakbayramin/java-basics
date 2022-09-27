package com.burak.inner_and_static.MiniProject;

public class Problem {

    public static class Mathematics {

        public static void circleArea(int r) {
            System.out.println("Area of circle: " + (r * r * Math.PI));
        }

        public static void trianglePerimeter(int edge1, int edge2, int edge3){
            System.out.println("The length of the perimeter of the triangle: " + (edge1 + edge2 + edge3));
        }
    }

    public static class Physics {

        public static void dotProduct(Vec v1, Vec v2){
            int dot = (int)(v1.getI() * v2.getI()) + (v1.getJ() * v2.getJ()) + (v1.getK() * v2.getK());
            System.out.println("Dot product of "+ v1.getName() + " and " + v2.getName() + " is " + dot);
        }
    }
}
