package com.maggioni.StringProcessing;

import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {
        String in;
        in = "1 a 10 . 100 1000";
        Scanner sca;
        sca = new Scanner(in);
        System.out.println("-->>");
        while (sca.hasNext()) {
            String next = sca.next();
            System.out.println(next);
        }

        System.out.println("-->>");
        in = "1 a 10 . 100 1000";
        sca = new Scanner(in);
        int accum = 0;
        for (int i = 0; i < 4; i++) {
            int nextInt = sca.nextInt();
            System.out.println(nextInt);
            accum += nextInt; // Exception in thread "main" java.util.InputMismatchException
        }
        System.out.println(accum);
    }

}
