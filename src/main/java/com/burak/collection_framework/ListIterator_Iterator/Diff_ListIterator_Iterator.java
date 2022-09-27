package com.burak.collection_framework.ListIterator_Iterator;

import java.util.*;

public class Diff_ListIterator_Iterator {
    // iterator -> use in set queue list interface implementations only has next method
    // list iterator -> only in list interface implementations and have next previous and add methods

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        List<String> list1 = new ArrayList<String>();

        set.add("1");
        set.add("2");
        set.add("3");

        list1.add("1");
        list1.add("2");
        list1.add("3");

        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list1.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("-------");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("-------");

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("---------------------");

        List<String> list2 = new ArrayList<String>();

        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");

        ListIterator<String> listIterator = list2.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("-------");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("-------");

        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if (value.equals("3")){
                listIterator.remove();
            }
        }

        for (String s : list2) {
            System.out.println(s);
        }
    }
}
