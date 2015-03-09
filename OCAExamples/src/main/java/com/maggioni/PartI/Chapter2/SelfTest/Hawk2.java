package com.maggioni.PartI.Chapter2.SelfTest;

class Bird5 {
    static {System.out.println("Bird5 static constructor");}
}
class Raptor5 extends Bird5{
    static {System.out.println("Raptor5 static constructor");}
}
public class Hawk2 extends Raptor5{
    static {System.out.println("Hawk5 static constructor");}
    public static void main(String[] args) {
        // test the sequence static constructors are called
    }
}
