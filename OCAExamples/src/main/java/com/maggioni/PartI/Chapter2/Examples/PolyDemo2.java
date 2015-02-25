package com.maggioni.PartI.Chapter2.Examples;

public class PolyDemo2 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();           // from Animal
        
        Horse2 horse = new Horse2();
        horse.eat();            // from Horse2
        horse.eat("Carrot");    // from Horse2
        
        Animal horse3 = new Horse2();
        horse3.eat();           // from Horse2
        // horse3.eat("Carrot"); does not compile
               
    }
    
}
