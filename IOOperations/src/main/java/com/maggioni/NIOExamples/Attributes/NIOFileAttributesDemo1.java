package com.maggioni.NIOExamples.Attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
http://andreinc.net/2013/12/05/java-7-nio-2-tutorial-file-attributes/
*/

public class NIOFileAttributesDemo1 {

    public static void main(String[] args) throws IOException {
       
        Path file = Paths.get("/Users", "/magang","Documents","whitzlab","Bla_Bla.txt");
        System.out.println(file);
        
        System.out.println("Files.isDirectory(file) "+Files.isDirectory(file));
        System.out.println("Files.isRegularFile(file) "+Files.isRegularFile(file));
        
        /*
            following statements do not compile whithout throws IOException
        */
        System.out.println("Files.isHidden(file) "+Files.isHidden(file));                       
        System.out.println("Files.getLastModifiedTime(file) "+Files.getLastModifiedTime(file));   
        System.out.println("Files.getFileStore(file) "+Files.getFileStore(file));   
        System.out.println("Files.getOwner(file) "+Files.getOwner(file));
        System.out.println("Files.isHidden(file) "+Files.isHidden(file));
        /*
            end
        */
        boolean atrIsDirec = (boolean) Files.getAttribute(file, "basic:isDirectory");
        System.out.println("Files.getAttribute(file, \"basic:isDirectory\") "+atrIsDirec);
        atrIsDirec = (boolean) Files.getAttribute(file, "isDirectory");
        System.out.println("Files.getAttribute(file, \"isDirectory\") "+atrIsDirec);
        //atrIsDirec = (boolean) Files.getAttribute(file, "hidden"); // java.lang.IllegalArgumentException: 'hidden' not recognized
        atrIsDirec = (boolean) Files.getAttribute(file, "dos:hidden");
        System.out.println("Files.getAttribute(file, \"dos:hidden\") "+atrIsDirec);
        
    }

}
