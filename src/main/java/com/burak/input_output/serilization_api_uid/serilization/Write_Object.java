package com.burak.input_output.serilization_api_uid.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write_Object {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student1.bin"))) {

            Student student1 = new Student("James Bond",007,"Engineer");
            Student student2 = new Student("Ryan Gosling",13,"Law");

            oos.writeObject(student1);
            oos.writeObject(student2);

        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        } catch (IOException e) {
            System.out.println("IO Exception while opening the file");
        }
    }
}
