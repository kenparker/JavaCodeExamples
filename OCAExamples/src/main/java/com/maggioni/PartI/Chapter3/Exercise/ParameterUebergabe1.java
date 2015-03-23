package com.maggioni.PartI.Chapter3.Exercise;

import com.maggioni.PartI.Chapter2.Examples.Animal;
import com.maggioni.PartI.Chapter2.Examples.Horse2;

public class ParameterUebergabe1 {

    public static void main(String[] args) {
        ParameterUebergabe1 p = new ParameterUebergabe1();
        Animal a = new Animal();
        a.name = "Cat";
        System.out.println("I'm am a " + a.name);
        p.animalParam(a);
        Horse2 h = new Horse2();
        h.name = "Horse";
        System.out.println("I'm a " + h.name);  // output "Horse"
        p.animalParam(h);                       // changed to "Dog"
        System.out.println("I'm a " + h.name);  // output "Dog"
        Animal a2 = new Horse2();
        a2.name = "Horse too";
         System.out.println("I'm a " + a2.name);
        
    }

    void animalParam(Animal animal) {
        animal.name = "Dog";
        System.out.println("I'm a " + animal.name);
    }
}
