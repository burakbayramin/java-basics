package com.burak.oop.composition;

public class Test {
    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor1 = new Monitor("AXVCC", "Asus", "27", resolution);
        Case case1 = new Case("Cool", "MSI", "steel");
        Motherboard motherboard1 = new Motherboard("XNNNCV", "Asus", 10, "MAC");

        PC pc = new PC(monitor1, case1, motherboard1);
        pc.getCase1().openPC();
        pc.getMonitor1().closeMonitor();
        pc.getMotherboard1().uploadOS("Win10");

    }

}
