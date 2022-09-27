package com.burak.collection_framework.Set_Interface;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(123,"a");
        hmap.put(345,"b");
        hmap.put(678,"c");
        hmap.put(902,"d");
        hmap.put(123,"e");

        System.out.println(hmap);
        System.out.println(hmap.get(678));
        System.out.println(hmap.get(1000));

        System.out.println("---------------");

        for (Map.Entry<Integer, String> entry : hmap.entrySet()){
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }
    }
}
