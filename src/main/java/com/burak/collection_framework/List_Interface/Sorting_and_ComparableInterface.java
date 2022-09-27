package com.burak.collection_framework.List_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sorting_and_ComparableInterface {

    static class Player implements Comparable<Player>{
        private String name;
        private int id;

        public Player(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        @Override
        public int compareTo(Player player) {
            if (this.id < player.id) {
                return -1;
            } else if (this.id > player.id) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        List<String> listString = new ArrayList<String>();
        listString.add("3");
        listString.add("2");
        listString.add("4");
        listString.add("5");
        listString.add("1");

        Collections.sort(listString);

        for (String s : listString) {
            System.out.println(s);
        }

        System.out.println("--------------");

        List<Player> listPlayer = new ArrayList<Player>();
        listPlayer.add(new Player("Max", 5));
        listPlayer.add(new Player("James", 7));
        listPlayer.add(new Player("Lisa", 4));
        listPlayer.add(new Player("Jason", 1));

        Collections.sort(listPlayer);

        for (Player p : listPlayer) {
            System.out.println(p);
        }



    }
}
