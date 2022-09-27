package com.burak.interfaces;

public class SoftwareE implements Engineer{

    private boolean good;
    private boolean health;

    public SoftwareE(boolean good, boolean health) {
        this.good = good;
        this.health = health;
    }

    @Override
    public void good_at_work() {
        if(good){
            System.out.println("good at work");
        }
        else{
            System.out.println("bad at work");
        }
    }

    @Override
    public String gpa(double degree) {
        return "gpa is: " + degree;
    }

    @Override
    public void healthy() {
        if(health){
            System.out.println("engineer is healthy");
        }
        else{
            System.out.println("not healthy");
        }
    }

    @Override
    public void experience(String[] arr) {
        System.out.println("im in work in this companies");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
