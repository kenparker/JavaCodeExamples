package com.maggioni.NIOExamples.Basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileDemo1 {

    public static void main(String[] args) {

        // Java 7 example
        System.out.println(" ----> Java 7 I/O Example");
        File file1 = new File("myFirstDemo1.txt");
        System.out.println(" file exist : " + file1.exists());
        try {
            boolean createNewFile = file1.createNewFile();
            System.out.println(" file created : " +  createNewFile);
        } catch (IOException ex) {
            // my Logger
        }
        
        // Java 7
        System.out.println(" ----> Java 7 NIO Example");
        Path path = Paths.get("myFirstDemo2.txt");
        boolean exists = Files.exists(path);
        System.out.println(" file exists :" + exists);
        try {
            Path createFile = Files.createFile(path);
            System.out.println(" file created : " +  createFile);
        } catch (IOException ex) {
            System.out.println(" file exists");
        }
        
        
    }

}
