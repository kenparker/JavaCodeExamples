package com.maggioni.iooperations.Examples;

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
        String stringFromStream = CharStreams.toString(new InputStreamReader(file, "UTF-8"));
        System.out.println("String from InputFile.txt :" + stringFromStream);
        
        Reader fileReader = new FileReader("InputFile.txt");
        stringFromStream = CharStreams.toString(fileReader);
        System.out.println("String from fileReader :" + stringFromStream);
        
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("InputFile.txt"));
        stringFromStream = CharStreams.toString(new InputStreamReader(bufferedInputStream, "UTF-8"));
        System.out.println("String from BufferedInputStream :" + stringFromStream);
        
       // BufferedReader br = new BufferedReader(bufferedInputStream);
        
        Reader initialReader = new StringReader("Firstline \n secondline \nthrird line");
        stringFromStream = CharStreams.toString(initialReader);
        System.out.println("String from StringReader :" + stringFromStream);

        // Conversion from String to InputStream
        InputStream inputStream = new ByteArrayInputStream(stringFromStream.getBytes());
        System.out.println(CharStreams.toString(new InputStreamReader(inputStream)));
    }
    
}
