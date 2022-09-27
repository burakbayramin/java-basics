package com.burak.oop.contructors.miniprojects.Workout;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome workout program");
        String exercises = "deadlift\n" +
                "bench\n" +
                "squat";
        System.out.println("dl num: ");
        int dl = sc.nextInt();
        System.out.println("bench num: ");
        int bench = sc.nextInt();
        System.out.println("squat num: ");
        int squat = sc.nextInt();
        sc.nextLine();

        Workout w1 = new Workout(dl,bench,squat);
        System.out.println("workout started");

        while(w1.isFinished() == false) {
            System.out.println("choose exercise\n" + exercises);
            String exercise = sc.nextLine();
            System.out.println("how many reps you did");
            int num = sc.nextInt();
            sc.nextLine();

            w1.doWorkout(exercise,num);
        }
        System.out.println("workout is done");



    }

}
