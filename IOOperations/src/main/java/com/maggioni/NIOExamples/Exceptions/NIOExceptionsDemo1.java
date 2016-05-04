package com.maggioni.NIOExamples.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOExceptionsDemo1 {

    public static void main(String[] args) throws IOException{
       
        Path path = Paths.get("C:\\Users\\magang\\Documents/whitzlab");
        
        try {
            Files.delete(path); // thows at runtime java.nio.file.DirectoryNotEmptyException: C:\Users\magang\Documents\whitzlab
        } catch (NoSuchFileException ex) {
            System.out.println(ex);
        }
    }

}
