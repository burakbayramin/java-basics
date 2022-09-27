package com.burak.collection_framework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Radio implements Iterable<String>{

    private ArrayList<String> channelList = new ArrayList<String>();

    public class RadioIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < channelList.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            String value = channelList.get(index);
            index++;
            return value;
        }
    }

    public Radio(String[] channels) {

        for (String channel : channels) {
            channelList.add(channel);
        }
    }

    @Override
    public Iterator<String> iterator() {
       // return channelList.iterator();
        return new RadioIterator();
    }
}
