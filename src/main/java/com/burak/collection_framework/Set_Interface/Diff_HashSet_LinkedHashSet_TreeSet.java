package com.burak.collection_framework.Set_Interface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Diff_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> hset = new HashSet<>();
        Set<String> lhset = new LinkedHashSet<>();
        Set<String> tset = new TreeSet<>();

        hset.add("2");
        hset.add("2");
        hset.add("1");
        hset.add("1");
        hset.add("2");
        hset.add("1");
        hset.add("3");
        hset.add("4");

        lhset.add("2");
        lhset.add("2");
        lhset.add("1");
        lhset.add("1");
        lhset.add("2");
        lhset.add("1");
        lhset.add("3");
        lhset.add("4");

        tset.add("2");
        tset.add("2");
        tset.add("1");
        tset.add("1");
        tset.add("2");
        tset.add("1");
        tset.add("3");
        tset.add("4");

        System.out.println("Hash Set");
        for (String s : hset) {
            System.out.println(s);
        }
        System.out.println("-----------");

        System.out.println("Linked Hash Set");
        for (String s : lhset) {
            System.out.println(s);
        }
        System.out.println("-----------");

        System.out.println("Tree Set");
        for (String s : tset) {
            System.out.println(s);
        }

        System.out.println(hset.contains("1"));
        System.out.println(hset.contains("5"));
        System.out.println(lhset.isEmpty());

        System.out.println("------------");

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");

        set2.add("3");
        set2.add("4");
        set2.add("5");
        set2.add("6");

        Set<String> dif = new HashSet<>(set2);
        dif.removeAll(set1);
        System.out.println(dif);

        System.out.println("------------");

        Set<String> comm = new HashSet<>(set2);
        comm.retainAll(set1);
        System.out.println(comm);

    }
}
