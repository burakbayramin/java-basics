package com.burak.oop.inheritance.miniproject;

public class CEO extends Employee{
    private int employees;

    public CEO(String fname, String lname, int id, int employees){
        super(fname, lname, id);
        this.employees=employees;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("employees: "+employees);
    }

    public void raise(int raise){
        System.out.println(getFname()+" is raising "+raise);
    }
}
