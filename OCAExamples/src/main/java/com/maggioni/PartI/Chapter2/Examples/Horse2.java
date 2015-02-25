package com.maggioni.PartI.Chapter2.Examples;

public class Horse2 extends Animal{
    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }
    
    public void eat(String s) {
        System.out.println("Horse is eating :" +  s);
    }
}
