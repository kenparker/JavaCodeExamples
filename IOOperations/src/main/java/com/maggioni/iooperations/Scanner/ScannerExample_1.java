package com.maggioni.IOOperations.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * http://examples.javacodegeeks.com/java-basics/java-scanner-example/?utm_content=buffer82041&utm_medium=social&utm_source=facebook.com&utm_campaign=buffer
 */
public class ScannerExample_1
{

    public static void readFromFile(String inputFile) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File(inputFile));

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }

    public static void readFromString(String inputString)
    {
        Scanner scanner = new Scanner(inputString);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException
    {

        //userDirHome();
        ScannerExample_1.readFromFile("InputFile.txt");
        System.out.println();
        ScannerExample_1.readFromString("This is a sample string that is about to be scanned!");
    }

    public static void userDirHome()
    {
        // This will print a complete absolute path from where your application has initialized.
        String currentDir = System.getProperty("user.dir");
        System.out.println("The current Dir using user.dir is: " + currentDir);
        System.out.println("Separator is: " + File.separator);
        String currentHome = System.getProperty("user.home");
        System.out.println("The current Home using user.home is: " + currentHome);
        System.out.println("The java.class.path is: " + System.getProperty("java.class.path"));
        final String name = ScannerExample_1.class.getName().replace(".", "/");
        String path = name.substring(0, name.indexOf("ScannerExample_1"));
        System.out.println(
                "The class.getName() is: " + path);
        //System.out.println("The class.getPackage() is: " + ScannerExample_1.class.getPackage() );
        System.out.println("");
    }

}
