package com.burak.input_output.serilization_api_uid.transient_keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadO {
    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("persons.bin"))) {

            Person[] p_arr = (Person[]) in.readObject();

            for (Person p : p_arr){
                System.out.println(p);
                System.out.println("---------");
            }

            System.out.println("Person number: " + Person.getPersonNum());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
