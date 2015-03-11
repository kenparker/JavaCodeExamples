package com.maggioni.PartI.Chapter2.Examples;


public class Frog {

    static int frogSize = 0;
    
    public Frog() {
        frogSize++;
    }
    public static void main(String[] args) {
        new Frog();
        new Frog();
        Frog f = new Frog();
        System.out.println("FrogSize :" +  frogSize);
        System.out.println("FrogSize :" +  Frog.frogSize);
        System.out.println("FrogSize :" +  f.frogSize);
    }
    
}
