package com.maggioni.NIOExamples.Whitzlab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileCreateCompareDemo1 {

    public static void main(String[] args) {
        
        File f1 = new File(".\\dir3\\web", "\\home.html");
        System.out.println(""+f1);
        
        boolean exists = f1.exists();
        System.out.println("file exist? "+exists);
        
        
        /*
        the output is "File .\dir3\web\home.html created false"
        because the file is already existing
        no IOException here
        */
        try {
            boolean createNewFile = f1.createNewFile();
            System.out.println("File " +  f1 + " created " + createNewFile);
        } catch (IOException ex) {
            System.out.println("File " +  f1 + " exists");
        }
        
        /*
        in this case the file is only a directory
        the directory exists
        the output is "Directory false"
        */
        f1 = new File(".\\dir3\\web");
        try {
            System.out.println("Directory " + f1.createNewFile());
        } catch (IOException ex) {
            System.out.println("Directory " +  f1 + " exists");
            
        }
        
        /*
        in this case it do not thing this is a directory
        it thinks this is a file to be created
        */
        f1 = new File(".\\dir3\\webbbbb\\");
        try {
            System.out.println(f1 + " created? " + f1.createNewFile());
        } catch (IOException ex) {
            System.out.println(f1 + " IOException");
            
        }
        
        f1 = new File(".\\dir3\\we1111\\newdata.txt");
        try {
            System.out.println(f1 + " created? " + f1.createNewFile());
        } catch (IOException ex) {
            System.out.println(f1 + " IO Exception");
            
        }
        
        Path f2 = f1.toPath();
        
        try {
            System.out.println("Files.createFile(f2) "+ Files.createFile(f2));;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

}
