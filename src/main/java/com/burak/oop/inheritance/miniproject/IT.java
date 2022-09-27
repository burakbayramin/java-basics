package com.burak.oop.inheritance.miniproject;

public class IT extends Employee{
    private String codes;

    public IT(String fname, String lname, int id, String codes){
        super(fname,lname,id);
        this.codes=codes;
    }

    public void format(String OS) {
        System.out.println(getFname()+" is loading "+OS);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("codes: "+codes);
    }
}
