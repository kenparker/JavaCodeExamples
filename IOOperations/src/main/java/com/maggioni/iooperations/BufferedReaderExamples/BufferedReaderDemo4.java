/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.iooperations.BufferedReaderExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author magang
 */
public class BufferedReaderDemo4 {

    private static final String OUTPUT_FILE = "C:\\Users\\nikos\\Desktop\\TestFiles\\testFilenotexist.txt";

    public static void main(String[] args) {

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
