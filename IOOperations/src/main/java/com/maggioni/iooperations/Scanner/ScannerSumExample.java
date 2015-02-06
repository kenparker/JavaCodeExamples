package com.maggioni.IOOperations.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * http://examples.javacodegeeks.com/java-basics/java-scanner-example/?utm_content=buffer82041&utm_medium=social&utm_source=facebook.com&utm_campaign=buffer
 */
public class ScannerSumExample
{

    public static double calculateSum(String inputFile) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File(inputFile));
        double sum = 0.0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                // Ignore the input line.
                scanner.next();
            }
        }
        scanner.close();

        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("The total sum equals to: "
                + ScannerSumExample.calculateSum("InputFile.txt"));
    }
}
