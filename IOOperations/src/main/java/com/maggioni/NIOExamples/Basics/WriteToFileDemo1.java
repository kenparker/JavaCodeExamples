package com.maggioni.NIOExamples.Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFileDemo1 {

    public static void main(String[] args) {
        myFirstDemo1txt = "myFirstDemo1.txt";    
         // Java 7
        File file7 = new File(myFirstDemo1txt);
        try {
            PrintWriter pw = new PrintWriter(file7); // If the file exists then it will be truncated to zero size
            pw.println("first Line");
            pw.println("second line");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException ex) {
            //
        }
        
        // read the file with Java 8
        Path path = Paths.get(myFirstDemo1txt);
        try {
            Files.lines(path)
                    .forEach(System.out::println);
        } catch (IOException ex) {
            //
        }
              
        
        
    }
    private static String myFirstDemo1txt;

}
