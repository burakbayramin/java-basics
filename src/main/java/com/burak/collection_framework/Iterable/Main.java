package com.burak.collection_framework.Iterable;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        String[] channels = {"BBC Radio", "Reggae 141", "Hard Radio", "Deep House", "KISS FM"};

        Radio radio = new Radio(channels);

        /*for (String s : radio) {
            System.out.println(s);
        }*/

        Iterator<String> iterator = radio.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
