package com.maggioni.StringProcessing;

import java.util.Scanner;

public class ScannerDemo3 {

    public static void main(String[] args) {
       String s;
       s = "The \tnew \nprogrammer exam";
       Scanner scanner;
        scanner = new Scanner(s);
       printScanner(scanner);
       s = "The1new22programmer exam6";
        scanner = new Scanner(s);
       scanner.useDelimiter("[\\d]+");
       printScanner(scanner);
       s = "The1new22programmer exam6";
        scanner = new Scanner(s);
       scanner.useDelimiter("[\\sA-Za-z]+");
       printScanner(scanner);
       // System.out.println("");
       s = "ABC 223.2343 Paul 10";
        scanner = new Scanner(s);
        System.out.println("find in line "+scanner.findInLine("(ABC)+[\\d]+\\.[\\d]+"));
       printScanner(scanner);
        scanner = new Scanner(s);
        System.out.println("find in line "+scanner.findInLine("ABC+[\\d]+\\.[\\d]+"));
       printScanner(scanner);
        scanner = new Scanner(s);
        System.out.println("find in line "+scanner.findInLine("[\\d]+\\.[\\d]+"));
       printScanner(scanner);
    }

    private static void printScanner(Scanner scanner) {
        System.out.println("->>>"+scanner.delimiter());
        while (scanner.hasNext()) {
            System.out.println( scanner.next());
            
        }
    }

}
