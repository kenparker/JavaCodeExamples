package com.maggioni.NIOExamples.Whitzlab;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Watchable;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WalkFileTreeFileVisitorDemo3 {

    public static void main(String[] args) {
        Path p = Paths.get("..\\IOOperations\\dir3");
        FileVisitDemo1 fileVisitor = new FileVisitDemo1();
        try {
            Files.walkFileTree(p,fileVisitor);
        } catch (IOException ex) {
            Logger.getLogger(WalkFileTreeFileVisitorDemo3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    /*
    FileVisitor is an Interface, not a Class, not a Abstract Class
    */
    public static class FileVisitDemo1 implements FileVisitor<Watchable>{


        /*
        NOTE: all overridding Methods have Object as Parameter because there is no Generic above
        */
        
        
        @Override
        public FileVisitResult visitFile(Watchable file, BasicFileAttributes attrs) throws IOException {
            System.out.println("File " +  file);
            return FileVisitResult.CONTINUE;            
        }

        /*
        NOTE: the visitFileFailed get an IOException as Parameter
        */
        @Override
        public FileVisitResult visitFileFailed(Watchable file, IOException exc) throws IOException {
            /* do a lot of stuff */
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Watchable dir, BasicFileAttributes attrs) throws IOException {
            System.out.println("Directory : " + dir);
            return FileVisitResult.CONTINUE;
        }
        /*
        NOTE: The postVisitDirectory get a IOException as Parameter
        */
        @Override
        public FileVisitResult postVisitDirectory(Watchable dir, IOException exc) throws IOException {
            /* do a lot of stuff */
            return FileVisitResult.CONTINUE;
        }
        
    }
}
