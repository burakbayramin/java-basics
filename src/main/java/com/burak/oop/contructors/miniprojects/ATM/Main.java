package com.burak.oop.contructors.miniprojects.ATM;



public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Account acc = new Account("burak", "1234", 12000);
        atm.run(acc);


    }

}
