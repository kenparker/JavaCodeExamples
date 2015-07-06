package com.maggioni.PartI.Whizlab.Pretest;

public class Maybe {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        
        System.out.println(!false ^ false);
        System.out.println(true ^ true);
        System.out.println(" " + (!b1 & (b2 = true))); // tricky statement b2 = true is an assignement and not short-circuit
        System.out.println(" " +  (b2 ^ b1)); // because of the assignement above
    }

}
