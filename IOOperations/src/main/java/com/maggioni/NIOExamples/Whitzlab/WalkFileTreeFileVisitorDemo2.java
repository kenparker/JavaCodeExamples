package com.maggioni.NIOExamples.Whitzlab;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Set;

public class WalkFileTreeFileVisitorDemo2 {

    public static void main(String[] args) {
        Path p = Paths.get("..\\IOOperations\\dir3");
        FileVisitDemo1 fileVisitor = new FileVisitDemo1();
        walkFileTreeConstructor1(p, fileVisitor);
        System.out.println("-----------");
        walkFileTreeConstructor2(p, fileVisitor);
    }

    private static void walkFileTreeConstructor1(Path p, FileVisitDemo1 fileVisitor) {
        try {
            /*
            NOTE: the Constructor is here: public static Path walkFileTree(Path start, FileVisitor<? super Path> visitor)
            */
            Files.walkFileTree(p,fileVisitor);
        } catch (IOException ex) {
            System.out.println(""+ex);
        }
    }
    private static void walkFileTreeConstructor2(Path p, FileVisitDemo1 fileVisitor) {
        try {
            /*
            NOTE: the Constructor is here: public static Path walkFileTree(Path start,
                                    Set<FileVisitOption> options,
                                    int maxDepth,
                                    FileVisitor<? super Path> visitor)
                                     throws IOException
            */
            Set<FileVisitOption> option = new HashSet<>();
            option.add(FileVisitOption.FOLLOW_LINKS);
            Files.walkFileTree(p, option, 1, fileVisitor);
        } catch (IOException ex) {
            System.out.println(""+ex);
        }
    }
 
    /*
    FileVisitor is an Interface, not a Class, not a Abstract Class
    */
    public static class FileVisitDemo1 implements FileVisitor<Path>{


        /*
        NOTE: all overridding Methods have Path as Parameter because the Generic above is <Path>
        */
        
        
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            System.out.println("File " +  file);
            return FileVisitResult.CONTINUE;            
        }

        /*
        NOTE: the visitFileFailed get an IOException as Parameter
        */
        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            /* do a lot of stuff */
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println("Directory : " + dir);
            return FileVisitResult.CONTINUE;
        }
        /*
        NOTE: The postVisitDirectory get a IOException as Parameter
        */
        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            /* do a lot of stuff */
            return FileVisitResult.CONTINUE;
        }
        
    }
}
