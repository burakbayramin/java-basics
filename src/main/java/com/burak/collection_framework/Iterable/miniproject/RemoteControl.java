package com.burak.collection_framework.Iterable.miniproject;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoteControl implements Iterable<String>{

    ArrayList<String> channels = new ArrayList<String>();

    public class RemoteContralIterator implements Iterator<String> {

        private int index = 0;
        @Override
        public boolean hasNext() {
            if (index >= channels.size()){
                return false;
            } else {
                return true;
            }
        }

        @Override
        public String next() {
            String channel = channels.get(index);
            index++;
            return channel;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new RemoteContralIterator();
    }

    public void addChannel(String channel) {
        channels.add(channel);
    }

    public void removeChannel(String channel) {
        if (channels.contains(channel)){
            channels.remove(channel);
        } else {
            System.out.println("Can't find the channel");
        }

    }

    public int numOfChannels() {
        return channels.size();
    }
}
