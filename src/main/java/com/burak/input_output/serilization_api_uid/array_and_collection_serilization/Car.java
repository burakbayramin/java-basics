package com.burak.input_output.serilization_api_uid.array_and_collection_serilization;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private int price;
    private String model;

    public Car(String name, int price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car name: " + name + "\nPrice: " + price + "\nModel: " + model;
    }
}
