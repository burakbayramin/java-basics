package com.burak.input_output.serilization_api_uid.array_and_collection_serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 62000, "M4");
        Car car2 = new Car("Mercedes", 75000, "AMG-GTR");
        Car car3 = new Car("Audi", 43000, "S4");

        Car[] car_array = {car1, car2, car3};
        ArrayList<Car> car_list = new ArrayList<Car>(Arrays.asList(car_array));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cars.bin"))) {

            out.writeObject(car_array);
            out.writeObject(car_list);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
