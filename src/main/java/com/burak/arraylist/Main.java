package com.burak.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("Metallica");
        arrList.add("Black Sabbath");
        arrList.add("Iron Maiden");
        arrList.add("Daft Punk");
        arrList.add("Mozart");

        System.out.println(arrList.get(0));
        System.out.println(arrList.get(2));

        System.out.println("----------------------");


        System.out.println(arrList.size());

        System.out.println("----------------------");


        for (int i=0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
        }

        System.out.println("----------------------");

        arrList.remove(1);
        arrList.remove("Daft Punk");

        for (int i=0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
        }

        System.out.println("----------------------");

        System.out.println(arrList.indexOf("Metallica"));
        arrList.add("Metallica");
        System.out.println(arrList.lastIndexOf("Metallica"));

        System.out.println("----------------------");

        arrList.set(3,"Megadeath");
        for (int i=0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
        }

        System.out.println("----------------------");

        print(arrList);

    }
    public static void print(ArrayList<String> a){
        for (int i=0; i<a.size(); i++){
            System.out.println("Element "+ (i+1) + ": " + a.get(i));
        }
    }
}
