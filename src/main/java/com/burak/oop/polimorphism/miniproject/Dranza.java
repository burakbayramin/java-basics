package com.burak.oop.polimorphism.miniproject;

public class Dranza extends Beyblade{
    private String specialPower;

    public Dranza(String owner_name, int speed, int power, String specialPower) {
        super(owner_name, speed, power);
        this.specialPower = specialPower;
    }

    @Override
    public void specialPowerRelease() {
        System.out.println(getOwner_name()+ " " + specialPower + "is releasing");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("special power: "+ specialPower);
    }
}
