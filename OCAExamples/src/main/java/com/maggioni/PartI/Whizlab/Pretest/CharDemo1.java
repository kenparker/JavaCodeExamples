package com.maggioni.PartI.Whizlab.Pretest;

public class CharDemo1 {

    public static void main(String[] args) {
        // char c = -65; do not compile
        char c = (char) -65;
        System.out.println(" char c = " + c);
        c = 65;
        System.out.println(" char c = " + c);
        
        c = 7000;
        System.out.println(" char c = " + c);
        
        for (int i = 6050; i < 7010; i++) {
            c = (char) i;
            System.out.println(" i = " +  i + "  c = " +  c);
        }
        
        
    }

}
