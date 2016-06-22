package com.maggioni.InnerClasses.Package1;

public class InnerClassTwist1 {

    public static void main(String[] args) {
        new Flower();
        Flower flower = new Flower();
    }

}

class Flower {
    String color = "red";
    Petal[] petals;
    
    public Flower() {
        /*
        when you initialize an array with some size, the array elements are initialized to null.
        The default constructor for the array alements isn't invoked
        */
        petals = new Petal[2];
    }
 
    
    private class Petal {
        public Petal() {
            System.out.println(color);}
        String color = "purple";
        /*
        an inner class can define a static variable it it's marked final.
        */
        static final int count = 3;
    }
}
