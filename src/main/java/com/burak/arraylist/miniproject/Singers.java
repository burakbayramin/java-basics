package com.burak.arraylist.miniproject;

import java.util.ArrayList;

public class Singers {
    private ArrayList<String> singer_list = new ArrayList<String>();

    public void print_singers() {
        System.out.println(singer_list.size() + " in list...");

        for(int i=0; i<singer_list.size(); i++) {
            System.out.println((i+1 )+  " Singer: " + singer_list.get(i));
        }
    }

    public void add_singer(String name) {
        singer_list.add(name);

        System.out.println(" singer added in list");
    }

    public void update_singer(String name, int position) {
        singer_list.set(position-1, name);
        System.out.println(" singer updated");
    }

    public void delete_singer(int position) {
        String name = singer_list.get(position);
        singer_list.remove(position);
        System.out.println(name + " is deleted from list");
    }

    public void search_singer(String name) {
        int position = singer_list.indexOf(name);

        if(position >=0 ) {
            System.out.println(name + " singer in " + (position+1) + " position");
        }
        else {
            System.out.println("singer is not fonund");
        }
    }
}
