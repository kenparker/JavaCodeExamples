package com.maggioni.NIOExamples.Basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateFileDemo1 {

    public static void main(String[] args)  {

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
        
        /*
        passing a directory to createNewFile() do not create the directory
        */
        File file2 = new File("./directory1/");
        try {
            boolean createNewFile = file2.createNewFile();
            System.out.println(" directory created? "+createNewFile);
        } catch (IOException ex) {
            System.out.println("IO Exception");
        }
        
        /*
        if the directory is not there the createNewFile() is throwing an IOException
        */
        File file3 = new File("./directory1/fileindirectory1.txt");
        try {
            System.out.println(" created1? " +  file3.createNewFile());
        } catch (IOException ex) {
            System.out.println("IO Error 1");
        }
        
        file3 = new File("./fileindirectory2.txt");
        try {
            System.out.println(" created2? " +  file3.createNewFile());
        } catch (IOException ex) {
            System.out.println("IO Error 2");
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
        
        /*
        the following example create a File and not a directory
        */
        Path path2 = Paths.get("./dir1/");
        try {
            Path createFile = Files.createFile(path2);
            System.out.println("path2? "+createFile);
        } catch (IOException ex) {
            System.out.println("IO Error path2");
        }
        
        /*
        the following example thows an IO Exception because the directory is not there
        */
        path2 = Paths.get("./dir2/fileindir2.tyt");
        try {
            Path createFile = Files.createFile(path2);
            System.out.println("path3? "+createFile);
        } catch (IOException ex) {
            System.out.println("IO Error path3");
        }
        
        /*
        it throws also IOException
        */
        path2 = Paths.get("./dir3/fileindir2.tyt");
        try {
            Path createDirectory = Files.createDirectory(path2);
            System.out.println("directory3? "+createDirectory);
            Path createFile = Files.createFile(path2);
            System.out.println("path4? "+createFile);
        } catch (IOException ex) {
            System.out.println("IO Error path4");
        }
        
        /*
        works
        */
        path2 = Paths.get("./dir3/fileindir2.tyt");
        try {
            //Path createDirectory = Files.createDirectory(path2.getParent());  // works
            Path createDirectory = Files.createDirectory(path2.resolveSibling(""));
            System.out.println("directory3? "+createDirectory);
            Path createFile = Files.createFile(path2);
            System.out.println("path5? "+createFile);
        } catch (IOException ex) {
            System.out.println("IO Error path5");
        }
        
        
        
        /*
        delete nonempty directory
        
        delete() returns "false" for nonempty directory
        */
        File filedelete1 = new File("./dir3");
        System.out.println("deleted1? " +  filedelete1.delete());
        
        /*
        delete nonempty directory
        
        delete() thows an IOException
        */
        Path pathtodelete1 = Paths.get("./dir3");
        try {
            Files.delete(pathtodelete1);
        } catch (IOException ex) {
            System.out.println("IOException delete1");
        }
       
        File dir1 = new File("dir3/dir4indir3");
        boolean mkdir = dir1.mkdir();
        System.out.println(dir1.toString() + " "+ mkdir);
         dir1 = new File("dir3/dir5indir3/");
         mkdir = dir1.mkdir();
        System.out.println(dir1.toString() + " "+ mkdir);
        
        
        File fileindir1 = new File("dir3/dir4indir3/fileindir.txt");
        try {
            fileindir1.createNewFile();
        } catch (IOException ex) {
            System.out.println("IOexception in dir 1");
        }
    }

}
