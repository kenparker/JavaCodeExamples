package com.maggioni.NIOExamples.Basics;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/*
http://www.javaworld.com/article/2899694/core-java/nio-2-cookbook-part-2.html
*/
public class CheckFileSystemDemo1 {

    public static void main(String[] args) {
        final FileSystem fileSystemdefault = FileSystems.getDefault();    
        System.out.println("Default filesystem : " + fileSystemdefault);
        System.out.println(" separator : " +  fileSystemdefault.getSeparator());
        System.out.println(" root directories : " +  fileSystemdefault.getRootDirectories());
       
    }

}
