package com.maggioni.NIOExamples.Basics;

import java.io.File;

public class ListDirectoryContentsDemo2 {

    public static void main(String[] args) {
        
        File dir = new File("./dir3");
        File[] listFiles = dir.listFiles();
        for (File listFile : listFiles) {
            System.out.println(""+listFile);
        }
        /*
        .\dir3\dir4indir3
        .\dir3\dir5indir3
        .\dir3\fileindir2.tyt
        */
        
        /*
        the difference against list() is that in the case of listFile() the directory is also returned
        */
        
    }

}
