package com.maggioni.PartI.Whizlab.Pretest;

import static java.lang.System.out;
// import static java.lang.System.*;   // the statement will also work

//import static java.lang.Integer.*;
// import java.util;    // statement will not compile
//import  java.lang.Math;
import static java.lang.Math.*;

public class BasicsDemo1 {

    public static void main(String[] args) {
        //String[][] args = {};  // do not compile because args is already defined

        out.print("A");
        
        double d = PI;
        
        BasicsDemo1 bd = new BasicsDemo1();
        bd.myMethod();
        
        
    }

    void myMethod() {
        double d2 = PI;
    }
}
