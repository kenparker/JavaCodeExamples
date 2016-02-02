package com.maggioni.NIOExamples.Basics;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeDemo1 {

    public static void main(String[] args) {
        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.txt");
        Path p3 = Paths.get("index.txt");
        /*
        public Path relativize(Path other)
        Constructs a relative path between this path and a given path. Relativization is the inverse of resolution.
        
        To construct a path between two Path objects, use method relativize(). 
        It can be used to construct a path between two relative or absolute Path objects.
        You can’t create a path from a relative path to an absolute path and vice versa using method relativize(). 
        If you do so, you’ll get a runtime exception (IllegalArgumentException).
        Method relativize() doesn’t check the actual file system to verify if the file (or directory) the resulting path is referring to actually exists.
        */
        System.out.println("12: "+p1.relativize(p2)); // ..\..\index.txt
        System.out.println("13: "+p2.relativize(p1)); // ..\personal\readme.txt
        System.out.println("14: "+p1.relativize(p2)); // ..\..\index.txt
        System.out.println("15: "+p2.relativize(p1)); // ..\personal\readme.txt
        
        p1 = Paths.get("c:\\personal\\readme.txt");
        p2 = Paths.get("c:\\index.txt");
        System.out.println("16: "+p1.relativize(p2)); // ..\..\index.txt
        System.out.println("17: "+p2.relativize(p1)); // ..\personal\readme.txt
        p2 = Paths.get("index.txt");
        //System.out.println("18: "+p2.relativize(p1)); // RunTimeError -> IllegalArgumentException
    }

}
