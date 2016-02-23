package com.maggioni.NIOExamples.Basics;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckIfFileExistDemo1 {

    public static void main(String[] args) {
        Path file1 = Paths.get("fileinres.txt");
        checkPath(file1);       
        toAbsolute(file1);
        Path file2 = Paths.get("src/main/java/resources/fileinres.txt");
        checkPath(file2);       
        toAbsolute(file2);
        Path file3 = Paths.get("/src/main/java/resources/fileinres.txt");
        checkPath(file3);       
        toAbsolute(file3);
        
    }

    private static void toAbsolute(Path file1) {
        Path toAbsolutePath = file1.toAbsolutePath();
        System.out.println(toAbsolutePath);
        System.out.println(toAbsolutePath + " = " + Files.exists(toAbsolutePath));
        System.out.println(" Root :" + file1.getRoot());
        System.out.println(" Root :" + toAbsolutePath.getRoot());
        
        try {
            Path toRealPath = file1.toRealPath();
            System.out.println(toRealPath);
        } catch (IOException ex) {
            System.out.println("---> Error:"+ ex);
        }
    }

    private static void checkPath(Path file1) {
        boolean exists = Files.exists(file1);
        System.out.println(exists);
    }

}
