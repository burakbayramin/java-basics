package com.burak.linkedlist.miniproject;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> towns = new LinkedList<String>();
        towns.add("Ankara");
        towns.add("Istanbul");
        towns.add("Izmir");
        towns.add("Kocaeli");
        towns.add("Trabzon");

        visit_town(towns);
    }

    public static void visit_town(LinkedList<String> towns){
        ListIterator<String> iterator = towns.listIterator();
        int operation;
        operations();
        Scanner sc = new Scanner(System.in);
        if(!iterator.hasNext()){
            System.out.println("there is no town");
        }
        boolean exit = false;
        boolean foward = true;
        while(!exit){
            System.out.println("select an operation");
            operation=sc.nextInt();
            switch(operation){
                case 0:
                    operations();
                    break;
                case 1:
                    if(!foward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        foward=true;
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    else{
                        System.out.println("there is no town to go");
                        foward=true;
                    }
                    break;
                case 2:
                    if(foward){
                        if(iterator.hasNext()){
                            iterator.previous();
                        }
                        foward=false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    else{
                        System.out.println("there is no town to go");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("you are just exit");
                    break;
            }

        }
    }

    public static void operations() {
        System.out.println("0- show operations\n" +
                "1- go next town\n" +
                "2- go previous town\n" +
                "3- exit");
    }
}
