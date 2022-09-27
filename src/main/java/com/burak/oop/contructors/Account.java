package com.burak.oop.contructors;

public class Account {
    private String accountNo;
    private double balance;
    private String name;
    private String telNo;

    public Account(String accountNo, double balance, String name, String telNo) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.name = name;
        this.telNo = telNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("new balance: "+ balance);
    }

    public void withdraw(double amount){
        if(amount>1500)
            System.out.println("you can withdraw more than 1500");
        if(amount>balance)
            System.out.println("you cant, your balance: "+balance);
        else{
            balance-=amount;
            System.out.println("new balance: "+balance);
        }

    }
}
