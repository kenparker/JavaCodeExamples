package com.maggioni.StringStringBuilderStringBuffer;

import java.util.Scanner;

public class ScannerDemo1 {

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
        System.out.println("");
       s = "ABC 223.2343 Paul 10";
        scanner = new Scanner(s);
       scanner.findInLine("(ABC)+[\\d]+\\.[\\d]+");
       printScanner(scanner);
    }

    private static void printScanner(Scanner scanner) {
        while (scanner.hasNext()) {
            System.out.println( scanner.next());
            
        }
    }

}
