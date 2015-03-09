package com.maggioni.PartI.Chapter2.SelfTest;

class Bird {
    {System.out.println("b1");}
    public Bird() {
        System.out.println("b2");
    }
}

class Raptor extends Bird {
    static {System.out.println("r1");}
    public Raptor() {System.out.println("r2");} // constructor is callled after r3
    {System.out.println("r3");}                 // instance initializer is called before Raptor()
    static {System.out.println("r4");}
}
class Hawk extends Raptor{
    // all static initializers are called at class loading
    // so thw output will bei r1, r4
    public static void main(String[] args) {
        System.out.print("pre ");
        new Hawk();
        System.out.println("hawk");
    }
    
}
