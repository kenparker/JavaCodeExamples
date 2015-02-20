package com.maggioni.PartI.Chapter2.Examples;

public class TestAnimals {
    public static void main(String[] args) {
        Horse h = new Horse();
        // h.eat(); It do not compile because eat() is not inherited as private
        h.eat(); // eat() Method from Horse and not from Animals
    }
    
}

class Animals {
    private void eat() {    // private thus nicht inherited to Horse
        System.out.println("Generic Eating");
    }
}

class Horse extends Animals {
    
    void eat() {
        System.out.println("Eat() from Horse");     // it is not overriding Animals.eat()
                                                    // Animals.eat() is private
    }
}
