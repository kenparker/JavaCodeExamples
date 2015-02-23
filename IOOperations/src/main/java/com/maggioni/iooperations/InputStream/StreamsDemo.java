package com.maggioni.iooperations.InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author magang
 */
public class StreamsDemo {
    
    public static void main(String[] args) throws FileNotFoundException {
        InputStream file1 = new FileInputStream("InputFile.txt");
        InputStream buffer1 = new BufferedInputStream(file1);
        BufferedReader br = new BufferedReader(new InputStreamReader(buffer1));
        br.lines()
                .forEach(l -> System.out.println(l));
    }
}
