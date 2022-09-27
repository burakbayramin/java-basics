package com.burak.oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("burak",1200,"IT",21);
        m1.showInfo();
        m1.hi("mom");

        Dog pitbull = new Dog("alex",40,70,4);
        pitbull.run(10);

    }
}
