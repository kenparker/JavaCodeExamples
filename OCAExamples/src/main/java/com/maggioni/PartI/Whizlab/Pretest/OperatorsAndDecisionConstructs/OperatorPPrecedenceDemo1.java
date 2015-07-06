package com.maggioni.PartI.Whizlab.Pretest.OperatorsAndDecisionConstructs;

public class OperatorPPrecedenceDemo1 {

    public static void main(String[] args) {
        int x = 15, y = 3, z=48, d;
        
        int c1 = x/y*z;
        int c2 = (x/y)*z;
        int c3 = x/(d = y*z);
        System.out.println(c1 + " "+ c2+ " "+ c3 + " " + d);
        
        c1 = x + y * z;
        c2 = x + (y * z);
        c3 = (x + y) * z;
        System.out.println(c1 + " "+ c2+ " "+ c3 + " ");
        
        c1 = x&y+z;
        c2= (x&y)+z;
        c3 =x&(y+z);
        System.out.println(c1 + " "+ c2+ " "+ c3 + " ");
        
        c1 = ++x | y-- +z;
        c2 = ++x | (y-- +z);
        c3 = (++x | y--) +z;
        System.out.println(c1 + " "+ c2+ " "+ c3 + " ");
        
        y = 10;
        y /= 3+2;
        System.out.println(y);
        y = 10;
        y=(y /= 3)+2;
        System.out.println(y);
        y = 10;
        y /= (3+2);
        System.out.println(y);
    }

}
