package com.burak.oop.encapsulation;

public class EncapsulatedUser {
    private int balance = 120;

    public EncapsulatedUser(int balance) {
        if(balance >= 0 && balance <= 120){
            this.balance = balance;
        }
    }

    public void use(int amount) {
        if(this.balance < 0){
            System.out.println("no balance");
        }
        else {
            this.balance -= amount;

            if(this.balance<=0){
                System.out.println("balance is 0, upload limit is 120$");
            }
            else {
                System.out.println("new balance: "+ this.balance);
            }
        }
    }
    public void balanceInfo() {
        System.out.println("balance: "+ this.balance);
    }

}
