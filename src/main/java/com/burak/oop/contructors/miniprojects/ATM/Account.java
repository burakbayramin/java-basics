package com.burak.oop.contructors.miniprojects.ATM;

public class Account {
    private String name;
    private String password;
    private int balance;

    public Account(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("new balance: " + balance);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("new balance "+ balance);
    }
}
