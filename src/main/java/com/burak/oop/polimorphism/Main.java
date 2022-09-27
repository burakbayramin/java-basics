package com.burak.oop.polimorphism;


class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String talk() {
        return " Animal is talking";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.getName() + " meowwww";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return getName() + " wooooof";
    }
}

public class Main {

    public static void speak(Animal animal){
        System.out.println(animal.talk());
    }

    public static void speeak(Object object){
        if(object instanceof Dog){
            Dog dog1 =(Dog)object;
            System.out.println(dog1.talk());
        }
        else if(object instanceof Cat){
            Cat cat1 =(Cat)object;
            System.out.println(cat1.talk());
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("sss");
        System.out.println(a1.talk());

        Animal a2 = new Cat("lissa");
        System.out.println(a2.talk());

        Animal a3 = new Dog("doggo");
        System.out.println(a3.talk());

        speak(new Cat("monika"));
        speak(new Dog("lexxxi"));

        System.out.println("-------------");

        Dog dog = new Dog("jack");
        if(dog instanceof Dog){
            System.out.println("this object is from dog class");
        }
        if(dog instanceof Animal){
            System.out.println("this object is from animal class");
        }


        System.out.println("-------------");

        Dog dog1 = new Dog("zyzz");
        Cat cat1 = new Cat("leagcy");
        speeak(dog1);
        speeak(cat1);

    }


}