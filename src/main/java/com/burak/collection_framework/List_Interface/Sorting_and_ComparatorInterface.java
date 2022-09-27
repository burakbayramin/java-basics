package com.burak.collection_framework.List_Interface;

import java.util.*;

public class Sorting_and_ComparatorInterface {

    static class SmallToBigCar implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            if (o1.getId() < o2.getId()) {
                return -1;
            } else if (o2.getId() < o1.getId()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    static class Car{
        private String name;
        private int id;

        public Car(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car("BMW",3));
        carList.add(new Car("Mercedes",2));
        carList.add(new Car("Audi",4));
        carList.add(new Car("Ferrari",1));
        carList.add(new Car("Aston Martin",5));

        Collections.sort(carList, new SmallToBigCar());

        for (Car a : carList) {
            System.out.println(a);
        }
    }
}
