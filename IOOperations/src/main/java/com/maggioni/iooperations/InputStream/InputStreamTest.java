package com.maggioni.iooperations.InputStream;

import com.google.common.io.CharStreams;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

/*
 http://www.baeldung.com/java-convert-reader-to-inputstream#commons-io&sref=https://delicious.com/kenparker/java
 http://javarevisited.blogspot.de/2012/08/convert-inputstream-to-string-java-example-tutorial.html
 */
public class InputStreamTest {
    
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        
        FileInputStream file = new FileInputStream("InputFile.txt");
        String stringFromStream = CharStreams.toString(new InputStreamReader(file, "UTF-8")); // conversion to String
        System.out.println("String from InputFile.txt :" + stringFromStream);
        
        System.out.println("\n");
        Reader fileReader = new FileReader("InputFile.txt");
        stringFromStream = CharStreams.toString(fileReader); // conversion to String
        System.out.println("String from fileReader :" + stringFromStream);
        fileReader.close();
              
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("InputFile.txt"));
        stringFromStream = CharStreams.toString(new InputStreamReader(bufferedInputStream, "UTF-8"));
        System.out.println("String from BufferedInputStream :" + stringFromStream);
        
        System.out.println("");
        InputStream file1 = new FileInputStream("InputFile.txt");
        InputStream buffer1 = new BufferedInputStream(file1);
        stringFromStream = CharStreams.toString(new InputStreamReader(buffer1));
        System.out.println("String from BufferedInputStream :" + stringFromStream);
        buffer1.close(); // important to close otherweise the next read will not work
        
        System.out.println("\n example using streams 1");
        fileReader = new FileReader("InputFile.txt");
        BufferedReader br = new BufferedReader(fileReader);
        br.lines()
                .forEach(l -> System.out.println(l));
        br.close();
        
        System.out.println("\n example using streams 2");
        file1 = new FileInputStream("InputFile.txt");
        buffer1 = new BufferedInputStream(file1);
        br = new BufferedReader(new InputStreamReader(buffer1));
        br.lines()
                .forEach(l -> System.out.println(l));
        br.close();
        
        Reader initialReader = new StringReader("Firstline \n secondline \nthrird line");
        stringFromStream = CharStreams.toString(initialReader);
        System.out.println("String from StringReader :" + stringFromStream);

        // Conversion from String to InputStream
        InputStream inputStream = new ByteArrayInputStream(stringFromStream.getBytes()); // this is the actual conversion
        System.out.println(CharStreams.toString(new InputStreamReader(inputStream))); // this line is just a test that the InputStream can be printed out
    }
    
}
