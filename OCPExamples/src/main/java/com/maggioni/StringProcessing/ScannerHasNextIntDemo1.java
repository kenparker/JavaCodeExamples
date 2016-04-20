package com.maggioni.StringProcessing;

import java.util.Scanner;

public class ScannerHasNextIntDemo1 {

    public static void main(String[] args) {
        String s = "1 this is a 234 5 string";
        Scanner sc = new Scanner(s);
        String patter = "\\w";
        whileMet(sc, patter);
        
        s = "1 this is a 234 5 string";
        sc = new Scanner(s);
        patter = "\\w+";
        whileMet(sc, patter);
        
        s = "1 this is a 234 5 string";
        sc = new Scanner(s);
        patter = "[a-zA-Z0-9]+";
        whileMet(sc, patter);
    }

    private static void whileMet(Scanner sc, final String patter) {
        System.out.println("-->>"+patter);
        while (sc.hasNext()) {
            if (sc.hasNext(patter)) {
                System.out.println(sc.match() + " " + sc.next());
            } else {
                sc.next();
            }
        }
    }

}
