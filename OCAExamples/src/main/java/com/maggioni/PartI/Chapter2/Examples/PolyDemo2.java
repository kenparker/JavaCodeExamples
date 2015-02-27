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
        ((Animal) horse).walk();
        ((Animal) horse).eat();
        
        animal = (Animal) horse;// eat() from Horse2
        animal.eat();           // eat() from Horse2
        System.out.println("horse  is instance of Animal :" + (horse instanceof Animal)); 
        System.out.println("animal is instance of Animal :" + (animal instanceof Animal));
        System.out.println("animal is instance of Horse2 :" + (animal instanceof Horse2));
    }
    
}
