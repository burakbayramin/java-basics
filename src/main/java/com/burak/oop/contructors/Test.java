package com.burak.oop.contructors;

public class Test {
    public static void main(String[] args) {

     /* Account acc1 = new Account();
        acc1.setAccountNo("1234");
        acc1.setBalance(120000);
        acc1.setTelNo("123123123"); */

        Account acc2 = new Account ("333333",3453453.0,"burcak","553434534");
        acc2.deposit(1);
        acc2.withdraw(999999999);

        System.out.println("---------------");

        Person p1 = new Person();
        System.out.println(p1.getName());

        System.out.println("---------------");

        Person p2 = new Person("3434343",189.9);
        p2.showInfo();

        Person p3 = p2;
        if(p2 == p3)
            System.out.println("equal");

        System.out.println("---------------");

        new Person("beyza","asdasd",56,170.0).showInfo();
    }
}
