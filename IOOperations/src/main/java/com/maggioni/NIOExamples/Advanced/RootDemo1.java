package com.maggioni.NIOExamples.Advanced;

import java.nio.file.Paths;

public class RootDemo1 {

    public static void main(String[] args) {
    
        System.out.println("1. " +  Paths.get("c:/a/b/c").getRoot() ); // c:\
        System.out.println("2. " +  Paths.get("/a/b/c").getRoot() ); // \
        System.out.println("3. " +  Paths.get("a/b/c").getRoot() ); // null
        
        System.out.println("4. " +  Paths.get("a/b/c").getName(0) ); // a
        System.out.println("5. " +  Paths.get("a/b/c").getName(1) ); // b
        System.out.println("6. " +  Paths.get("a/./b/c").getName(1) ); // .
    }
    
}
