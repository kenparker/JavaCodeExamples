package com.maggioni.NIOExamples.Advanced;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintPathDemo1 {

    public static void main(String[] args) {
    
        Path p1 = Paths.get("a","b","c");
        
        System.out.println("1. "+  p1); // a\b\c
        
        System.out.println("2. "+  Paths.get("\\a","b",".","\\c")); // \a\b\.\c
        System.out.println("3. "+  Paths.get("\\a","b",".","\\c\\")); // \a\b\.\c
        System.out.println("3. "+  Paths.get("\\a","b",".","\\c\\").toString()); // \a\b\.\c
        
        
    }
    
}
