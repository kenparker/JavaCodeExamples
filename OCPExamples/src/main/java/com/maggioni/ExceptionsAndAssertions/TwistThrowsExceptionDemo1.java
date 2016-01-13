package com.maggioni.ExceptionsAndAssertions;

import java.io.FileNotFoundException;

public class TwistThrowsExceptionDemo1 {

    public void readFile(String file) throws FileNotFoundException {
        System.out.println("readFile");
        throw new FileNotFoundException();
    }
    public void useReadFile(String name) throws FileNotFoundException {
        System.out.println("useReadFile");
        try {
            readFile(name);
        } catch (FileNotFoundException fileNotFoundException) {
        }
    }
            
    public static void main(String[] args) throws FileNotFoundException { // without the throws Statement the program is not compiling
        new TwistThrowsExceptionDemo1().useReadFile("AA"); 
    }

}
