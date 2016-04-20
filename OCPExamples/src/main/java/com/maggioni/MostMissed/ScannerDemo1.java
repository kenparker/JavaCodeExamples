package com.maggioni.MostMissed;

import java.util.Scanner;

public class ScannerDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner("this0is1 what2is ");
        sc.useDelimiter("[0-9]");
        scPrint(sc);
        /*
        this
        is
        what
        is 
        */
        sc = new Scanner("this0is1 what9is ");
        sc.useDelimiter("[09]");
        scPrint(sc);
        /*
        this
        is1 what
        is  
        */
        sc = new Scanner("this0is1 what09is ");
        sc.useDelimiter("09");
        scPrint(sc);
        /*
        this0is1 what
        is
        */
        sc = new Scanner("this00is1 what9is ");
        sc.useDelimiter("[09]");
        scPrint(sc);
        /*
        this

        is1 what
        is 
        */
        sc = new Scanner("this00is1 what9is ");
        sc.useDelimiter("[09]+");
        scPrint(sc);
        /*
        this
        is1 what
        is 
        */
    }

    private static void scPrint(Scanner sc) {
        System.out.println("->>>"+sc.delimiter());
        while (sc.hasNext()) {
            String next = sc.next();
            System.out.println(next);
        }
    }

}
