package com.burak.interfaces;

public class Main {
    public static void main(String[] args) {

        SoftwareE eng1 = new SoftwareE(false,true);
        eng1.good_at_work();
        eng1.healthy();
        System.out.println(eng1.gpa(3.07));
        String[] experiences ={"Google", "Facebook"};
        eng1.experience(experiences);

        MachineE eng2 = new MachineE(true,true);
        String[] exp = { };
        String[] references = {"Burak"};
        eng2.good_at_work();
        eng2.healthy();
        System.out.println(eng2.gpa(2.31));
        eng2.experience(exp);
        eng2.reference(references);
        eng2.work();

    }
}
