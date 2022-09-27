package com.burak.collection_framework.List_Interface;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Vectors_Stacks {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();

        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("D");

        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println("---------");

        ListIterator<String> iterator = vector.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------");

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("---------");

        Stack<String> stack = new Stack<String>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        for (String s : stack) {
            System.out.println(s);
        }

        System.out.println("---------");

        Enumeration<String> enumeration1 = stack.elements();

        while (enumeration1.hasMoreElements()) {
            System.out.println(enumeration1.nextElement());
        }

        System.out.println("---------");

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.push("5");

        while (!stack.isEmpty()) {
            System.out.println("Removing -> " + stack.pop());
        }
        System.out.println("Is stack empty -> " + stack.isEmpty());

    }
}
