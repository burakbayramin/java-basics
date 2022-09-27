package com.burak.collection_framework.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        List<String> arrList = new ArrayList<String>();
        arrList.add("Java");
        arrList.add("C");
        arrList.add("Python");
        arrList.add("Go");

        System.out.println(arrList.get(0));
        System.out.println(arrList.get(3));

        System.out.println("---------------");

        for (String s : arrList){
            System.out.println(s);
        }

        arrList.remove(0);
        arrList.remove("C");

        System.out.println("---------------");

        for(String s : arrList) {
            System.out.println(s);
        }
    }
}
