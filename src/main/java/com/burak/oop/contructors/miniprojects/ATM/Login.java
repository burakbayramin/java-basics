package com.burak.oop.contructors.miniprojects.ATM;

import java.util.Scanner;

public class Login {

    public boolean login(Account acc) {

        Scanner sc = new Scanner(System.in);
        String username;
        String pass;

        System.out.print("name: ");
        username=sc.nextLine();
        System.out.print("pass: ");
        pass=sc.nextLine();

        if(acc.getName().equals(username) && acc.getPassword().equals(pass)) {
            return true;
        }
        else
            return false;


    }
}
