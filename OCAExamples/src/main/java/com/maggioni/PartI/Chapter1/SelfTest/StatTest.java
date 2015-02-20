package com.maggioni.PartI.Chapter1.SelfTest;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.System.out;

public class StatTest extends Object{

    static Integer i = Integer.MAX_VALUE;   // it does not need import static
    static Integer y = MAX_VALUE;           // It NEEDS import static as there is nothing bevor the MAX_VALUE
    
    public static void main(String[] args) {
        
        System.out.println(Integer.MAX_VALUE);  // It does not need any static import as System.out is enought
        out.println(Integer.MAX_VALUE);         // It NEEDS the import static statement above
    }
}
