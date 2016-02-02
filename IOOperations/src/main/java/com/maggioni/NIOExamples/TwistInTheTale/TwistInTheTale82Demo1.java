package com.maggioni.NIOExamples.TwistInTheTale;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TwistInTheTale82Demo1 {

    public static void main(String[] args) {
        Path dir = Paths.get("code");
        System.out.println(dir.toAbsolutePath()); // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\code
        Path file = Paths.get("code/java/IO.java");
        System.out.println(file.relativize(dir));   // ..\..
        Path resolve = file.resolve(file.relativize(dir));
        System.out.println(resolve);    // code\java\IO.java\..\..
        System.out.println(resolve.toAbsolutePath());   // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\code\java\IO.java\..\..
    }

}
