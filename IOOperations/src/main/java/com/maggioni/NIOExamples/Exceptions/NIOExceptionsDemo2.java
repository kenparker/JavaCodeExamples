package com.maggioni.NIOExamples.Exceptions;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOExceptionsDemo2 {

    public static void main(String[] args) throws IOException {
       
        Path path = Paths.get("C:\\Users\\magang\\Documents/whitzlab");
        
        try {
            Files.delete(path);
        } catch (FileSystemException ex) {
            System.out.println(ex);
        }
    }

}
