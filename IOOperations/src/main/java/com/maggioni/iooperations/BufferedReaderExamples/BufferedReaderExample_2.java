package com.maggioni.IOOperations.BufferedReaderExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * http://examples.javacodegeeks.com/core-java/io/bufferedreader/java-bufferedreader-example/?utm_source=feedburner&utm_medium=email&utm_campaign=Feed%3A+JavaCodeGeeks+%28Java+Code+Geeks%29
 */
public class BufferedReaderExample_2
{

    private static final String OUTPUT_FILE = "C:\\Users\\nikos\\Desktop\\TestFiles\\testFile.txt";

    public static void main(String[] args)
    {

        String str = "";
        char[] chars = new char[1000];

        try (BufferedReader bufReader = new BufferedReader(new FileReader(new File(OUTPUT_FILE)),
                4096)) {

            while ((bufReader.read(chars)) != -1) {

                String chunk = new String(chars);
               //alternative
                // String chunk = String.valueOf(chars)

                System.out.println(chunk);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
