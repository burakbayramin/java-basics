package com.burak.oop.inheritance;

public class Manager extends Worker{ //subclass

    private int age;

    public Manager(String name, int salary, String department, int age) {
        super(name, salary, department); //we bring constructor from superclass so we use super
        this.age = age;
    }

    public void hi(String name) {
        System.out.println("hi " + name);
    }

    public void showInfo() {
        /* System.out.println("name " + getName());
        System.out.println("salary " + getSalary());
        System.out.println("department " + getDepartment());*/
        super.showInfo();

        System.out.println("age " + this.age);
    }

}
