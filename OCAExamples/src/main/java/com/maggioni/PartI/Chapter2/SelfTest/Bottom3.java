package com.maggioni.PartI.Chapter2.SelfTest;

class Top3 {
    public Top3() {
        System.out.println("First");
    }
    public Top3(String s) {      // Constructor is never used
        System.out.println("B");
    }
}

public class Bottom3 extends Top3 {

    public Bottom3(String s) {  // compiler will insert super()
                                // super() calls the no-arg constructor Top3()
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Bottom3("C");
        System.out.println(" ");
    }

}
