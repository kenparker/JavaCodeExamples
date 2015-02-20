package com.maggioni.PartI.Chapter1.example;

public class Moo1 {

    public static void main(String[] args) {
    Moo1 moo = new Moo1();
    moo.useZoo(args);
    }
    
    public void useZoo(String... args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.coolMethod());
    }
}
