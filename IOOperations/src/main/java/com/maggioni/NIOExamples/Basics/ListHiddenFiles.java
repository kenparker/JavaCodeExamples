package com.maggioni.NIOExamples.Basics;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListHiddenFiles {

    public static void main(String[] args) throws IOException {
       
        Path path = Paths.get("c:",FileSystems.getDefault().getSeparator());
        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        for (Path file : stream) {
            if(Files.isHidden(file))
                System.out.println(file);
        }
        
        stream = Files.newDirectoryStream(path);
        for (Path file : stream) {
            System.out.println(file + " is Directory :" + Files.isDirectory(file) + " is file :" + Files.isRegularFile(file) + " isAbsolute? : " +  file.isAbsolute());
        }
    }

}
