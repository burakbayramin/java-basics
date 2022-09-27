package com.burak.collection_framework.Set_Interface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Diff_HashMap_LinkedHashMap_TreeMap {
    public static void main(String[] args) {


        Map<Integer, String> hmap = new HashMap<>();
        Map<Integer, String> lhmap = new LinkedHashMap<>();
        Map<Integer, String> tmap = new TreeMap<>();

        System.out.println("HashMap");
        printMap(hmap);
        System.out.println("---------------");
        System.out.println("LinkedHashMap");
        printMap(lhmap);
        System.out.println("---------------");
        System.out.println("TreeMap");
        printMap(tmap);
        System.out.println("---------------");

    }

    public static void printMap(Map<Integer, String> map) {
        map.put(345,"c");
        map.put(612,"a");
        map.put(367,"e");
        map.put(123,"p");
        map.put(100,"l");
        map.put(56,"k");

        /*for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + "   Value: " + entry.getValue());
        }*/

        System.out.println(map.keySet());

        for (Integer key : map.keySet()){
            System.out.println("Key: " + key + "   Value: " + map.get(key));
        }
    }

}
