package com.burak.input_output.serilization_api_uid.transient_keyword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteO {
    public static void main(String[] args) {

        Person p1 = new Person("James", "Bond", 31);
        Person p2 = new Person("Max", "Verstappen", 23);
        Person p3 = new Person("Chester", "Bennington", 41);

        Person[] p_arr = {p1, p2, p3};

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persons.bin"))) {

            out.writeObject(p_arr);

            Person.setPersonNum(10);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
