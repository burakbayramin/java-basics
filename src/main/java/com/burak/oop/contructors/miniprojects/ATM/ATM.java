package com.burak.oop.contructors.miniprojects.ATM;

import java.util.Scanner;

public class ATM {

    public void run(Account acc) {
        Login login = new Login();

        Scanner sc = new Scanner(System.in);

        System.out.println("hello");
        System.out.println("user login");
        int entry = 3;
        while(true){
            if(login.login(acc)){
                System.out.println("success");
                break;
            }
            else {
                System.out.println("fail");
                entry--;
            }
            if(entry == 0){
                System.out.println("your login has expired");
                return;
            }
        }

        String operations = "1.balance\n" +
                "2.deposit\n" +
                "3.withdraw\n" +
                "q for exit";

        System.out.println(operations);

        while(true){
            System.out.println("selcet operation");
            String op=sc.nextLine();
            if(op.equals("q")){
                break;
            }
            else if(op.equals("1")){
                System.out.println(acc.getBalance());
            }
            else if(op.equals("2")){
                System.out.println("amount ? ");
                int amount =sc.nextInt();
                sc.nextLine();
                acc.deposit(amount);
            }
            else if(op.equals("3")){
                System.out.println("amount ? ");
                int amount =sc.nextInt();
                sc.nextLine();
                acc.withdraw(amount);
            }
            else {
                System.out.println("invalid option");
            }
        }
    }
}
