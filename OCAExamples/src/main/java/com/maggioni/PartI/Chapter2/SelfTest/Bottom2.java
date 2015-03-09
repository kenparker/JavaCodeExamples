package com.maggioni.PartI.Chapter2.SelfTest;

class Top {
                 
    public Top(String s) {      // no-arg constructor is not added from compiler
                                // because constructor with paramters exists
        System.out.println("B");
    }
}

public class Bottom2 extends Top {

    public Bottom2(String s) {
        super(s);               // compile only with the super(s) statement
                                // otherwise it won't compile
                                // because super() will call a no-arg constructor
                                // which do not exist
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }

}
