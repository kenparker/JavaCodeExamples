package com.maggioni.IOOperations.BufferedReaderExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * http://examples.javacodegeeks.com/core-java/io/bufferedreader/java-bufferedreader-example/?utm_source=feedburner&utm_medium=email&utm_campaign=Feed%3A+JavaCodeGeeks+%28Java+Code+Geeks%29
 */
public class BufferedReaderExample_1
{

    private static final String OUTPUT_FILE = "C:\\Users\\nikos\\Desktop\\TestFiles\\testFile.txt";

    public static void main(String[] args)
    {

        String str = "";

        Path filePath = Paths.get(OUTPUT_FILE);

        try (BufferedReader bufReader = Files.newBufferedReader(filePath, Charset.defaultCharset())) {

            // read the rest of the file line by line
            while ((str = bufReader.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
