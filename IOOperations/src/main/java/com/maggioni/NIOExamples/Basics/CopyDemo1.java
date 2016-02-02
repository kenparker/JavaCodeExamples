package com.maggioni.NIOExamples.Basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyDemo1 {

    public static void main(String[] args) {
        Path input = Paths.get("myFirstDemo1.txt");
        Path target = Paths.get("myTargetCopy.txt");
        try {
            Files.copy(input, target);
        } catch (IOException ex) {
            System.out.println("IO Error");
        }
        
    }

}
