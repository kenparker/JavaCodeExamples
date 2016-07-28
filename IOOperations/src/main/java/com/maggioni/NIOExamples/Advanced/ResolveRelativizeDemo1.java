package com.maggioni.NIOExamples.Advanced;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveRelativizeDemo1 {

    public static void main(String[] args) {
        
        Path p1 = Paths.get("/photos/vacation");
        Path p2 = Paths.get("yellowstone");
        
        System.out.println(p1.resolve(p2));
        
        Path p3 = Paths.get(":/yellowstone");
        //System.out.println(p1.resolve(p3)); // java.nio.file.InvalidPathException: Illegal char <:> at index 0: :/yellowstone
    }
    
}
