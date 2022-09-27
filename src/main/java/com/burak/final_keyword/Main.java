package com.burak.final_keyword;

public class Main {
    public static void main(String[] args) {
        Database d1 = new Database();
        System.out.println(Database.databaseName);
        System.out.println(Database.userName);
        System.out.println(Database.password);

        FinalTest f1 = new FinalTest("Test_1");
        FinalTest f2 = new FinalTest("Test_2");
        System.out.println("Object number " + f1.objectNum);
        System.out.println("Object number " + f2.objectNum);

    }
}
