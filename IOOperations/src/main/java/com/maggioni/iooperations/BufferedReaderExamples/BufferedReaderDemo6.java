/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.iooperations.BufferedReaderExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author magang
 */
public class BufferedReaderDemo6 {

    private static final String OUTPUT_FILE = "testFilenotexist.txt";

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(OUTPUT_FILE);
        } catch (IOException ex) {
            Logger.getLogger(BufferedReaderDemo6.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
