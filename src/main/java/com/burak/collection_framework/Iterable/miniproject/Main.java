package com.burak.collection_framework.Iterable.miniproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to remote control program...");
        Scanner scan = new Scanner(System.in);
        String ops = "-------------------\n" +
                "Operations\n" +
                "1- Show channels\n" +
                "2- Add channel\n" +
                "3- Remove channel\n" +
                "4- Number  of channels\n" +
                "q for exit";

        RemoteControl rc = new RemoteControl();

        while (true) {
            System.out.println(ops);
            System.out.println("Enter operation");
            String op = scan.nextLine();
            if (op.equals("q")){
                break;
            } else if (op.equals("1")) {
                showChannels(rc);
            } else if (op.equals("2")) {
                System.out.println("Enter the channel name");
                String cName = scan.nextLine();
                rc.addChannel(cName);
            } else if (op.equals("3")) {
                System.out.println("Enter the channel name");
                String chName = scan.nextLine();
                rc.removeChannel(chName);
            } else if (op.equals("4")) {
                System.out.println("Number of channels: " + rc.numOfChannels());
            } else {
                System.out.println("Invalid Operation");
            }

        }
    }

    public static void showChannels(RemoteControl rc) {

        if (rc.numOfChannels() == 0) {
            System.out.println("No channels");
        } else {
            for (String channel : rc) {
                System.out.println("Channel: " + channel);
            }
        }
    }
}
