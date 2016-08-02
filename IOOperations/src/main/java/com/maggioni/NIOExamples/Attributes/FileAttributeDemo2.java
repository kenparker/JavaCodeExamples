package com.maggioni.NIOExamples.Attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileAttributeDemo2 {

    public static void main(String[] args) {
        
        Path file = Paths.get("dir3/fileindir2.tyt");
        try {
            Object attribute = Files.getAttribute(file, "size");
            System.out.println(" size is "+attribute);
            long size = (long) Files.getAttribute(file, "size");
            System.out.println(" size is "+size);
            
            //boolean isReadOnly = (boolean) Files.getAttribute(file, "readOnly");    // throws "IllegalArgumentException"
            boolean isReadOnly = (boolean) Files.getAttribute(file, "dos:readonly");  
            System.out.println(" readonly? "+isReadOnly);
            
            Object attribute1 = Files.getAttribute(file, "size,lastModifiedTime"); // throws IllegalArgumentException
            System.out.println(" "+attribute1);
            
            BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(file, BasicFileAttributeView.class);
            BasicFileAttributes readAttributes = fileAttributeView.readAttributes();
            System.out.println(" size is " + readAttributes.size());
        } catch (IOException ex) {
            Logger.getLogger(FileAttributeDemo2.class.getName()).log(Level.SEVERE, "getAttribute1 error", ex);
        }
    }

}
