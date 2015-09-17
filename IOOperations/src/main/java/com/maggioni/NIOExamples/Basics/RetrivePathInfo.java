package com.maggioni.NIOExamples.Basics;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
http://www.javaworld.com/article/2899694/core-java/nio-2-cookbook-part-2.html
*/
public class RetrivePathInfo {

    public static void main(String[] args) {
        dumpPathInfo(Paths.get("a", "b", "c"));
        
        FileSystem fs = FileSystems.getDefault();
        Iterable<Path> rootDirectories = fs.getRootDirectories();
        for (Path rootDirectory : rootDirectories) {
            dumpPathInfo(Paths.get(rootDirectory.toString(), "a", "b", "c"));
            break;
        }
    }

    static void dumpPathInfo(Path path) {
        System.out.printf("Path : %s%n", path);
        System.out.printf("Filename : %s%n", path.getFileName());
        System.out.println("Components ");
        for (int i = 0; i < path.getNameCount(); i++) {
        System.out.printf(" : %s%n", path.getName(i));
        }
        System.out.printf("Parent : %s%n", path.getParent());
        System.out.printf("Root : %s%n", path.getRoot());
        System.out.printf("Absolute : %b%n", path.isAbsolute());
        System.out.printf("Subpath [0,2] : %s%n%n", path.subpath(0, 2));
        
        
    }
}
