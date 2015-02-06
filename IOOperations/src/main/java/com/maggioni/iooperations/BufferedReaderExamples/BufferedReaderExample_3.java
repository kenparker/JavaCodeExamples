package com.maggioni.IOOperations.BufferedReaderExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://examples.javacodegeeks.com/core-java/io/bufferedreader/java-bufferedreader-example/?utm_source=feedburner&utm_medium=email&utm_campaign=Feed%3A+JavaCodeGeeks+%28Java+Code+Geeks%29
 */
public class BufferedReaderExample_3 {
private static final String OUTPUT_FILE = "C:\\Users\\nikos\\Desktop\\TestFiles\\testFile.txt";
    public static void main(String[] args) {

        String str = "";

        try (BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Write a line of text :");
            str = bufReader.readLine();
            System.out.println(str );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
