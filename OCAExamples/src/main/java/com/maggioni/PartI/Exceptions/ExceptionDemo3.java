package com.maggioni.PartI.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo3 {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr1 = new FileReader(new File("xyz.txt"));
        FileReader fr2 = new FileReader(new File("xyz.txt"));
        System.out.println(fr1.equals(fr2)); // equals() from Object
    }

}
