package com.burak.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        places.add("Home");
        places.add("Library");
        places.add("School");

        print_list(places);

        System.out.println("-----------");

        places.add(2,"Garden");
        print_list(places);

        System.out.println("-----------");

        places.remove(2);
        places.remove("Home");
        print_list(places);

        LinkedList<String> emotions = new LinkedList<String>();
        add_sorted(emotions, "angry");
        add_sorted(emotions, "sad");
        add_sorted(emotions, "happy");
        add_sorted(emotions, "surprised");
        print_emotions(emotions);


    }

    public static void print_list(LinkedList<String> places){
        ListIterator<String> iterator = places.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void add_sorted(LinkedList<String> emotions, String temp){
        ListIterator<String> iterator = emotions.listIterator();

        while(iterator.hasNext()){
            int comp = iterator.next().compareTo(temp);
            if(comp == 0){
                System.out.println("you have this element already");
                return;
            }
            else if(comp < 0){
                iterator.previous();
                iterator.add(temp);
            }

        }
        iterator.add(temp);

    }

    public static void print_emotions(LinkedList<String> emotions){
        ListIterator<String> iterator = emotions.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
