package com.burak.oop.inheritance.miniproject;

public class Employee {
    private String fname;
    private String lname;
    private int id;

    public Employee(String fname, String lname, int id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showInfo() {
        System.out.println("employee info");
        System.out.println("first name: "+ fname);
        System.out.println("last name: "+ lname);
        System.out.println("id: "+ id);
    }

}
