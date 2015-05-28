package com.maggioni.Whizlab.Pretest.WorkingWithMethodsAndEncapsulation.first;

public class Shape {

    protected int sides;
    public Shape() {
        sides = 3;
    }

    public int getSides() {
        return sides;
    }

    public void printSides() {
        System.out.println("This object has " +  sides + " sides.");
    }
    
}
