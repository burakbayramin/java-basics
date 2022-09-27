package com.burak.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.balance = 300;
        u1.balanceInfo();
        u1.use(300);

        System.out.println("--------------------");

        EncapsulatedUser u2 = new EncapsulatedUser(300);
        u2.balanceInfo();

    }
}
