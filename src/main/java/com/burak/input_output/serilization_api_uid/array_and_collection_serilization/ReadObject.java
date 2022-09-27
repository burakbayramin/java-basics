package com.burak.input_output.serilization_api_uid.array_and_collection_serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("cars.bin"))) {

            Car[] car_array = (Car[]) in.readObject();
            ArrayList<Car> car_list = (ArrayList<Car>) in.readObject();

            for (Car c : car_array) {
                System.out.println(c);
                System.out.println("=====");
            }
            System.out.println("-----------");
            for (Car c : car_list) {
                System.out.println(c);
                System.out.println("=====");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO error");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        }
    }
}
