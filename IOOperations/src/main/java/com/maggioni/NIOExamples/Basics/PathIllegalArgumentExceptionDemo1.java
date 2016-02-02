package com.maggioni.NIOExamples.Basics;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PathIllegalArgumentExceptionDemo1 {

    public static void main(String[] args) {
        FileSystem aDefault = FileSystems.getDefault();
        System.out.println("default filesystem :" + aDefault.toString());
        Path path = aDefault.getPath("c:\\users\\obj8\\8-1.txt");
        System.out.println("path.toString() " + path.toString());      
        System.out.println("path.getNameCount() " + path.getNameCount());      
        System.out.println("path.subpath(1, 2) " + path.subpath(1, 2));      
        System.out.println("path.subpath(1, 3) " + path.subpath(1, 3));      
        System.out.println("path.subpath(0, 3) " + path.subpath(0, 3));      
        System.out.println("path.subpath(0, 4) " + path.subpath(0, 4)); // throw at runtime IllegaltArgumentException     
    }

}
