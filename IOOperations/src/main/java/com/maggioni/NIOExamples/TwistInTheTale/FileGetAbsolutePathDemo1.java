package com.maggioni.NIOExamples.TwistInTheTale;

import java.io.File;
import java.io.IOException;

public class FileGetAbsolutePathDemo1 {

    public static void main(String[] args) {

        File f = null;
        File f1 = null;
        String path = "";
        boolean bool = false;

        try {
            f = new File("testGetAbsolutePath.txt");
            boolean createNewFile = f.createNewFile();
            String absolutePath = f.getAbsolutePath();
            String canonicalPath = f.getCanonicalPath();
            System.out.println(" File : " + f + " created? : " + createNewFile);
            System.out.println(" File : " + f + " AbsolutePath : " + absolutePath);     // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\testGetAbsolutePath.txt
            System.out.println(" File : " + f + " CanonicalPath : " + canonicalPath);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
