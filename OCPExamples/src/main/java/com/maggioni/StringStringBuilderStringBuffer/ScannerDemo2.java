package com.maggioni.StringStringBuilderStringBuffer;

import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {
       String in;
       in = "1 a 10 . 100 1000";
       Scanner sca;
       sca = new Scanner(in);
       int accum = 0;
        for (int i = 0; i < 4; i++) {
            accum += sca.nextInt(); // Exception in thread "main" java.util.InputMismatchException
        }
        System.out.println(accum);
    }

}
