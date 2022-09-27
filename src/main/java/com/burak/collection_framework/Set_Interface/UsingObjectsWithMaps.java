package com.burak.collection_framework.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class UsingObjectsWithMaps {

    static class Player {
        private String name;
        private int id;

        public Player(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Player" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {

        Set<Player> hset = new HashSet<Player>();

        Player p1 = new Player("A",1001);
        Player p2 = new Player("B",1010);
        Player p3 = new Player("C",1100);
        Player p4 = new Player("D",1011);

        hset.add(p1);
        hset.add(p2);
        hset.add(p3);
        hset.add(p4);

        for (Player p : hset){
            System.out.println(p);
        }

    }
}
