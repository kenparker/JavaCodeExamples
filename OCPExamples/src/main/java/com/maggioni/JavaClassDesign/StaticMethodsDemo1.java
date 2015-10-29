package com.maggioni.JavaClassDesign;

public class StaticMethodsDemo1 {

    public static void main(String[] args) {
        Animal[] a = {new Animal(), new Dog(), new Animal()};
        for (Animal a1 : a) {
            a1.doStuff();
        }
        Dog.doStuff();
        Animal.doStuff();
        
        System.out.println("example 2");
        Dog[] dogs = {new Dog(), new Chinchilla(), new Chinchilla()};
        for (Dog dog : dogs) {
            dog.doStuff();
        }
    }

}
class Animal {
     static void doStuff() {
        System.out.println("a");
    }
}
class Dog extends Animal {
     static void doStuff() {
        System.out.println("d");
    }
}

class Chinchilla extends Dog {
    static void doStuff() {
        System.out.println("f");
    }
}
