package com.maggioni.PathMatcher;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PathMatcherDemo1 {

    public static void main(String[] args) {
       
        Path path = Paths.get("src/main/java/com/maggioni/serialize1");
        String pattern = "*e*";
        try {
            DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path,pattern);
            for (Path newDirectoryStream1 : newDirectoryStream) {
                
                System.out.println(" " +  newDirectoryStream1 + " is Directory ? " +  newDirectoryStream1.toFile().isDirectory());
            }
        } catch (IOException ex) {
            Logger.getLogger(PathMatcherDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
