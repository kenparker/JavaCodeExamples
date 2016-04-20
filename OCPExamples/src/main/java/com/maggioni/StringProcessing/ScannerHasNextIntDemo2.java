package com.maggioni.StringProcessing;

import java.util.Scanner;

public class ScannerHasNextIntDemo2 {

    public static void main(String[] args) {
        String s = "Hello World! 3 3 + 3.0 = 6.0 true ";
        
        Scanner sc = new Scanner(s);
        
        while (sc.hasNext()) {
            
            if (sc.hasNextInt()) {
                System.out.println("found : "+ sc.nextInt());
            } else {
            System.out.println("not found : "+ sc.next());
            }
        }
        sc.close();
    }

}
