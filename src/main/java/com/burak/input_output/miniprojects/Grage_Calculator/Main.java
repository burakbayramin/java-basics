package com.burak.input_output.miniprojects.Grage_Calculator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String letterGrade (String name, int mt1, int mt2, int f) {
        String output = "";
        double total = (mt1 * 0.3) + (mt2 * 0.3) + (f*0.4);
        if (total >= 90) {
            output = name + " takes A";
        } else if (total >= 80) {
            output = name + " takes B";
        } else if (total >= 70) {
            output = name + " takes C";
        } else if (total >= 60) {
            output = name + " takes D";
        }  else {
            output = name + " takes F";
        }

        return output;
    }

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(new FileReader("student_grades.txt"));
             FileWriter fw = new FileWriter("letter_grades.txt")) {

            while (scan.hasNextLine()){
                String studentInfo = scan.nextLine();
                String[] arr = studentInfo.split(",");
                int  mt1 = Integer.valueOf(arr[1]);
                int mt2 = Integer.valueOf(arr[2]);
                int f = Integer.valueOf(arr[3]);
                String out = letterGrade(arr[0], mt1, mt2, f);
                fw.write(out + "\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
