package com.maggioni.NIOExamples.Advanced;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkingCurrentDirectoryDemo1 {

    public static void main(String[] args) throws IOException {
        
        String userDirectory=  System.getProperty("user.dir");
        System.out.println("1 " + userDirectory);
        Path userDirPath = Paths.get(userDirectory);
        Path currentDir = Paths.get(".");
        System.out.println("2 " + userDirPath.resolve(currentDir));
                
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(currentDir);
        for (Path newDirectoryStream1 : newDirectoryStream) {
            System.out.println(newDirectoryStream1 
                    + "\n resolve 1: " + currentDir.resolve(newDirectoryStream1) 
                    + "\n resolve 2: " + newDirectoryStream1.resolve(currentDir)  // bad
                    + "\n resolve 3: " + newDirectoryStream1.resolve(userDirPath) ); // bad
            
        }
        
        System.out.println("--------------------");
        currentDir = Paths.get("");
        System.out.println("2 " + userDirPath.resolve(currentDir));
                
        newDirectoryStream = Files.newDirectoryStream(currentDir);
        for (Path newDirectoryStream1 : newDirectoryStream) {
            System.out.println(newDirectoryStream1 
                    + "\n resolve 4: " + userDirPath.resolve(newDirectoryStream1) 
                    + "\n resolve 5: " + currentDir.resolve(newDirectoryStream1) 
                     );
            
        }
    }

}
