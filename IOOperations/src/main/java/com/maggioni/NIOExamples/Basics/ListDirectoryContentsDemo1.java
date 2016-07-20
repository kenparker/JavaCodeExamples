package com.maggioni.NIOExamples.Basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListDirectoryContentsDemo1 {

    public static void main(String[] args) {

        File fil1 = new File("./dir3");
        String[] list = fil1.list();
        System.out.println("contents of directory; "+fil1);
        for (String list1 : list) {
            System.out.println(" "+list1);
        }
        /*
        the output:
        contents of directory; dir3
        dir4indir3
        dir5indir3
         fileindir2.tyt
        */
        
        Path dir2 = Paths.get("dir3");
        
        try (DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(dir2);) {
            System.out.println("contents of directory with newDirectoryStream()");
            for (Path newDirectoryStream1 : newDirectoryStream) {
                System.out.println(" "+newDirectoryStream1);
            }
        } catch (IOException e) {
            System.out.println("IO Exception1");
        }
        /*
        the output:
        contents of directory with newDirectoryStream()
        dir3\dir4indir3
        dir3\dir5indir3
        dir3\fileindir2.tyt
        */
        
        dir2 = Paths.get("./dir3");
        
        try (DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(dir2);) {
            System.out.println("contents of directory with newDirectoryStream()");
            for (Path newDirectoryStream1 : newDirectoryStream) {
                System.out.println(" "+newDirectoryStream1);
            }
        } catch (IOException e) {
            System.out.println("IO Exception2");
        }
        /*
        contents of directory with newDirectoryStream()
        .\dir3\dir4indir3
        .\dir3\dir5indir3
        .\dir3\fileindir2.tyt
        */
        
    }

}
