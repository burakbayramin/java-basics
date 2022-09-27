package com.burak.interfaces;

public class MachineE implements Engineer, Work{

    private boolean good;
    private boolean health;

    public MachineE(boolean good, boolean health) {
        this.good = good;
        this.health = health;
    }

    @Override
    public void work() {
        System.out.println("machine engineer working");
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
        if(arr.length == 0){
            System.out.println("no experience");
        }
        else{
            System.out.println("im work in these compinies");
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public void reference (String[] arr){
        if(arr.length==0){
            System.out.println("no references found");
        }
        else{
            System.out.print("references: ");
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
