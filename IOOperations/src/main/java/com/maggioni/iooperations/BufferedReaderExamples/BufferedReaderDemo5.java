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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author magang
 */
public class BufferedReaderDemo5 {

    private static final String OUTPUT_FILE = "C:\\Users\\nikos\\Desktop\\TestFiles:testFilenotexist.txt";

    public static void main(String[] args) {

        Path filePath = Paths.get(OUTPUT_FILE); // java.nio.file.InvalidPathException: Illegal char <:> at index 32

        try {
            BufferedReader bufReader = Files.newBufferedReader(filePath, Charset.defaultCharset()); // throws java.nio.file.NoSuchFileException
        } catch (IOException ex) {
            Logger.getLogger(BufferedReaderDemo5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
