package com.burak.oop.polimorphism.miniproject;

public class Factory {
    public Beyblade createBeyblade(String name) {

        if(name.equals("Dragon")){
            return new Dragon("Takao",800,300,"Blue Dragon","talking dragons");
        }
        else if(name.equals("Dranza")){
            return new Dranza("Kai",600,400,"Red Phoenix");
        }
        else if(name.equals("Drayga")){
            return new Drayga("Rei", 800, 250, "White Tiger");
        }
        else if(name.equals("Draciel")){
            return new Draciel("Max", 400, 1000, "Black Turtle");
        }
        else{
            return null;
        }

    }

}
