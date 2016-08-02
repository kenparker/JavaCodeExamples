package com.maggioni.NIOExamples.Whitzlab;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndFilesMethodsDemo1 {

    public static void main(String[] args) {
        File f1 = new File(new File("dir3\\web"), "home.html");
        System.out.println("f1 : " + f1);
        Path f2 = Paths.get("dir3","web", "home.html");
        System.out.println("f2 : " + f2);
        
        System.out.println("f1.canRead() " + f1.canRead());
        System.out.println("Files.isReadable(f2) " + Files.isReadable(f2));
        
        System.out.println("f1.exists() " + f1.exists());
        System.out.println("Files.exists(f2) " + Files.exists(f2));
    }

}
