package com.maggioni.NIOExamples.Basics;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
http://www.javaworld.com/article/2899694/core-java/nio-2-cookbook-part-2.html
*/
public class ObtainPath {

    public static void main(String[] args) {
        
        Path path = Paths.get("a", "b");
        System.out.println(path);
        path = Paths.get(FileSystems.getDefault().getSeparator() + "a","b");
        System.out.println(path);
        //path = Paths.get("a", null, "c"); // Thows a NullPointerException
        path = Paths.get("a", ":", "c"); // Thows a InvalidPathException
        System.out.println(path);
    }

}
