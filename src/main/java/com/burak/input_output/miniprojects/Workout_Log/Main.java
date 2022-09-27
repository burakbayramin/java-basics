package com.burak.input_output.miniprojects.Workout_Log;

import java.io.FileWriter;
import java.io.IOException;
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

        Workout workout = new Workout(dl, bench, squat);
        System.out.println("workout started");

        int i = 1;
        try (FileWriter fw = new FileWriter("workoutlog.txt")) {

            fw.write("Workout Program\n");
            fw.write("Deadlift number: " + workout.getDl_num() + "\n");
            fw.write("Bench Press number: " + workout.getBench_num() + "\n");
            fw.write("Squat number: " + workout.getSquat_num() + "\n");

            while (workout.isFinished() == false) {
                System.out.println("choose exercise\n" + exercises);
                String exercise = sc.nextLine();
                System.out.println("how many reps you did");
                int num = sc.nextInt();
                sc.nextLine();
                workout.doWorkout(exercise, num);

                fw.write(i + "Process ---->  Exercise: " + exercise + " Reps: " + num + "\n");
                i++;
            }
        } catch (IOException e) {
            System.out.println("Error...");
        }

        System.out.println("workout is done");



    }
}
