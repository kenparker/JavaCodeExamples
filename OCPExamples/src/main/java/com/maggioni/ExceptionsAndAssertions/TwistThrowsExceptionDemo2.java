package com.maggioni.ExceptionsAndAssertions;

import java.io.FileNotFoundException;

public class TwistThrowsExceptionDemo2 {

    public void readFile(String file) throws FileNotFoundException {
        System.out.println("readfile " +  file);
    }
    public static void main(String[] args) throws FileNotFoundException { // it do not compile withouth the throws clause
        System.out.println("main");
        new TwistThrowsExceptionDemo2().readFile("Hello.txt");
    }

}
