package com.burak.arraylist.miniproject;

import java.util.Scanner;

public class Test {
    private static Singers singers = new Singers();
    private static Scanner sc = new Scanner(System.in);

    public static void print_operations() {
        System.out.println("0- show operation");
        System.out.println("1- show singers");
        System.out.println("2- add singer");
        System.out.println("3- update singer");
        System.out.println("4- delete singer");
        System.out.println("5- search singer");
        System.out.println("6- quit");


    }

    public static void main(String[] args) {
        System.out.println("welcome");
        print_operations();

        boolean quit = false;
        int operation;

        while(!quit) {
            System.out.println("select operation");
            operation = sc.nextInt();
            sc.nextLine();
            switch(operation) {
                case 0:
                    print_operations();
                    break;
                case 1:
                    show();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    System.out.println("qutting.....");
            }

        }


    }

    public static void show() {
        singers.print_singers();
    }

    public static void add() {
        System.out.println("write your singer that you want to add");
        String name = sc.nextLine();
        singers.add_singer(name);
    }

    public static void update() {
        System.out.println("write your singers position that you want to update");
        int position = sc.nextInt();
        sc.nextLine();
        System.out.println("write your singer that you want to add");
        String newname = sc.nextLine();
        singers.update_singer(newname, position);
    }

    public static void delete() {
        System.out.println("write your singers position that you want to delete");
        int position = sc.nextInt();
        sc.nextLine();
        singers.delete_singer(position-1);
    }



    public static void search() {
        System.out.println("write your singers name that you want to search");
        String name = sc.nextLine();
        singers.search_singer(name);
    }
}
