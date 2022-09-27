package com.burak.input_output.serilization_api_uid.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read_Object {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student1.bin"))) {

            Student student1 = (Student)ois.readObject();
            Student student2 = (Student)ois.readObject();

            System.out.println(student1);
            System.out.println("------------");
            System.out.println(student2);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception while opening the file");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
