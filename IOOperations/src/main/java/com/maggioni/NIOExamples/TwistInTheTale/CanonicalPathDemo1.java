package com.maggioni.NIOExamples.TwistInTheTale;

import java.io.File;
import java.io.IOException;

public class CanonicalPathDemo1 {

    public static void main(String[] args) throws IOException {

        File f = new File("./fileddd.txt");
        System.out.println(""+f.getPath());                 // .\fileddd.txt
        System.out.println(""+f.getAbsolutePath());         // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\.\fileddd.txt      
        System.out.println(""+f.getCanonicalPath());        // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\fileddd.txt
        System.out.println(""+f.getCanonicalFile());        // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\fileddd.txt
        System.out.println(""+f.getName());                 // fileddd.txt
        System.out.println(""+f.getParent());               // .
        
        f = new File("/fileddd.txt");
        System.out.println(""+f.getPath());                 // \fileddd.txt
        System.out.println(""+f.getAbsolutePath());         
        System.out.println(""+f.getCanonicalPath());        
        System.out.println(""+f.getName());                 // fileddd.txt
        System.out.println(""+f.getParent());               // \
        
        f = new File("fileddd.txt");
        System.out.println(""+f.getPath());                 // fileddd.txt
        System.out.println(""+f.getAbsolutePath());         // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\fileddd.txt
        System.out.println(""+f.getCanonicalPath());        // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\fileddd.txt
        System.out.println(""+f.getName());                 // fileddd.txt
        System.out.println(""+f.getParent());               // null
        
        
        f = new File("../fileddd.txt");
        System.out.println(""+f.getPath());                 // ..\fileddd.txt
        System.out.println(""+f.getAbsolutePath());         // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\IOOperations\..\fileddd.txt
        System.out.println(""+f.getCanonicalPath());        // D:\Java_Aufgaben_old_loeschen\JavaCodeExamples\fileddd.txt
        
        f = new File("c:\\aa.txt");
        System.out.println(""+f.getPath());                 // c:\aa.txt
        System.out.println(""+f.getAbsolutePath());         // c:\aa.txt
        System.out.println(""+f.getCanonicalPath());        // c:\aa.txt
        System.out.println(""+f.getParent());               // c:\
        
        f = new File("c:\\.\\bb.txt");
        System.out.println(""+f.getPath());                 // c:\.\bb.txt
        System.out.println(""+f.getAbsolutePath());         // c:\.\bb.txt
        System.out.println(""+f.getCanonicalPath());        // C:\bb.txt
        
        f = new File("c:\\..\\..\\bcb.txt");
        System.out.println(""+f.getPath());                 // c:\..\..\bcb.txt
        System.out.println(""+f.getAbsolutePath());         // c:\..\..\bcb.txt
        System.out.println(""+f.getCanonicalPath());        // C:\bcb.txt
        System.out.println(""+f.getCanonicalFile());        // C:\bcb.txt
    }

}
