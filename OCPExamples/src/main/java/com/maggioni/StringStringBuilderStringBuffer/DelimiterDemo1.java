package com.maggioni.StringStringBuilderStringBuffer;

import java.util.Scanner;

public class DelimiterDemo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("ThemeXtheirXcarpet77");
        scanner.useDelimiter("t.*e");
        printTokens(scanner); // print ThemeX t77
        scanner = new Scanner("ThemeXtheirXcarpet77");
        scanner.useDelimiter("X");
        printTokens(scanner); // print Theme their carpet77
        scanner = new Scanner("ThemeXtheirXcarpet77");
        scanner.useDelimiter("t*e");
        printTokens(scanner); // print Th m Xth irXcarp t77
    }

    private static void printTokens(Scanner scanner) {
        System.out.println(scanner.toString());
        while (scanner.hasNext()) {
            String next = scanner.next();
            System.out.printf(next+ " ");
        }
        System.out.println("");
    }

}
