package com.maggioni.NIOExamples.Whitzlab;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreeSimpleFileVisitorDemo3 {

    public static void main(String[] args) {
        
        Path path = Paths.get("..\\IOOperations\\dir3");
        try {
            Files.walkFileTree(path, new SimpleFileVisitorDemo2());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    /*
    SimpleFileVisitor is a real Class, not an Interface
    */
    public static class SimpleFileVisitorDemo2 extends SimpleFileVisitor<Path>{

        /*
        NOTE: ..
        */
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            System.out.println("File :" + file); // the output will be nothing because this Method is not used
            return FileVisitResult.CONTINUE;
        }
        
        
    }
}
