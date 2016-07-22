package com.maggioni.NIOExamples.Advanced;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SubPathDemo2 {

    public static void main(String[] args) {
        
        Path p1 = Paths.get("c:\\a\\b\\c\\datai.txt");
        Path p2 = Paths.get("\\a\\b\\c\\datai.txt");
        Path p3 = Paths.get("a\\b\\c\\datai.txt");
        
        /*
        throws IllegalArgumentException
        System.out.println("p1.subpath(0, 0) " +  p1.subpath(0, 0));
        */
        System.out.println("p1.subpath(0, 1) " +  p1.subpath(0, 1)); // a
        System.out.println("p1.subpath(0, 2) " +  p1.subpath(0, 2)); // a\b
        System.out.println("p2.subpath(0, 2) " +  p2.subpath(0, 2)); // a\b
        System.out.println("p3.subpath(0, 2) " +  p3.subpath(0, 2)); // a\b
        System.out.println("p3.subpath(0, 3) " +  p3.subpath(0, 3)); // a\b\c
        
        System.out.println("p1.startsWith(\"a\") " +  p1.startsWith("a"));
        System.out.println("p2.startsWith(\"a\") " +  p2.startsWith("a"));
        System.out.println("p3.startsWith(\"a\") " +  p3.startsWith("a"));
        
        System.out.println("Paths.get(\"c:\\\\a\\\\.\\\\b\\\\c\\\\..\\\\data.dat\").subpath(0, 2) " + Paths.get("c:\\a\\.\\b\\c\\..\\data.dat").subpath(0, 2)); // a\.
        System.out.println("Paths.get(\"c:\\\\a\\\\.\\\\b\\\\c\\\\..\\\\data.dat\").subpath(0, 3) " + Paths.get("c:\\a\\.\\b\\c\\..\\data.dat").subpath(0, 3)); // a\.
        System.out.println("Paths.get(\"c:\\\\a\\\\.\\\\b\\\\c\\\\..\\\\data.dat\").subpath(1, 5) " + Paths.get("c:\\a\\.\\b\\c\\..\\data.dat").subpath(1, 5)); // .\b\c\..
    }
    
}
