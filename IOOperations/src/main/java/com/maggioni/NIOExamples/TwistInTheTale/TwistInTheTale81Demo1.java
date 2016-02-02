package com.maggioni.NIOExamples.TwistInTheTale;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TwistInTheTale81Demo1 {

    public static void main(String[] args) {
        Path path = Paths.get("c:\\ocpjavase7\\..\\obj\\.\\8-1.txt");
        System.out.println(path.toString()); // prints c:\ocpjavase7\..\obj\.\8-1.txt
        System.out.println(path.getName(1)); // prints ..
        System.out.println(path.getParent());// prints c:\ocpjavase7\..\obj\.
        System.out.println(path.subpath(2, 4));// prints obj\
        System.out.println(path.getNameCount());
    }

}
