package com.maggioni.NIOExamples.Basics;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAttrib {

    public static void main(String[] args) throws IOException {
       
        Path path = Paths.get("c:", FileSystems.getDefault().getSeparator());
        DirectoryStream<Path> stream = Files.newDirectoryStream(path);
        for (Path file : stream) {
            if (Files.isRegularFile(file) && Files.isReadable(file)) {
                System.out.println(" file : " + file+ " last change : " +  Files.getLastModifiedTime(file) +  " owner : " + Files.getOwner(file));
            }
        }
    }

}
