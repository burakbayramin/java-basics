package com.burak.oop.polimorphism.miniproject;

public class Dragon extends Beyblade{
    private String specialPower;
    private String hiddenPower;

    public Dragon(String owner_name, int speed, int power, String specialPower, String hiddenPower) {
        super(owner_name, speed, power);
        this.specialPower = specialPower;
        this.hiddenPower = hiddenPower;
    }

    @Override
    public void specialPowerRelease() {
        System.out.println(getOwner_name()+ " " + specialPower + "is releasing");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("special power: "+ specialPower);
        System.out.println("hiddenPower: "+ hiddenPower);
    }
}
