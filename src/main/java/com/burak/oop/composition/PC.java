package com.burak.oop.composition;

public class PC {
    private Monitor monitor1;
    private Case case1;
    private Motherboard motherboard1;

    public PC(Monitor monitor1, Case case1, Motherboard motherboard1) {
        this.monitor1 = monitor1;
        this.case1 = case1;
        this.motherboard1 = motherboard1;
    }

    public Monitor getMonitor1() {
        return monitor1;
    }

    public void setMonitor1(Monitor monitor1) {
        this.monitor1 = monitor1;
    }

    public Case getCase1() {
        return case1;
    }

    public void setCase1(Case case1) {
        this.case1 = case1;
    }

    public Motherboard getMotherboard1() {
        return motherboard1;
    }

    public void setMotherboard1(Motherboard motherboard1) {
        this.motherboard1 = motherboard1;
    }


}
