package com.burak.oop.inheritance;

public class Worker { //superclass && baseclass
    private String name;
    private int salary;
    private String department;

    public Worker(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void work() {
        System.out.println("employee is working");
    }

    public void showInfo() {
        System.out.println("name " + this.name);
        System.out.println("salary " + this.salary);
        System.out.println("department " + department); //this.department = department
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
