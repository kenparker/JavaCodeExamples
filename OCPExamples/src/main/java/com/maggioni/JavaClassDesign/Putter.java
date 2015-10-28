package com.maggioni.JavaClassDesign;

public class Putter {

    public static void main(String[] args) {
        Bango b1 = new Bango();
        Bango b2 = new Bongo();
        Bango b3 = new Bingo();
        
        System.out.println("b2 instanceof Bongo :"+(b2 instanceof Bongo)); // true
        System.out.println("b2 instanceof Bango :"+(b2 instanceof Bango)); // true
        System.out.println("b2 instanceof Bingo :"+(b2 instanceof Bingo)); // true
        // Bongo b4 = b2; // Do not compile
        Bongo b5 = (Bongo) b2;
        Bango b6 = b3;
        Bango b7 = (Bango) b3;
        //Bingo b8 = b3; // Do not compile
        Bingo b9 = (Bingo) b3;
        Bango b10 = (Bongo) b3;
                
    }

}
class Bango {}
class Bongo extends Bango {}
class Bingo extends Bongo {}
