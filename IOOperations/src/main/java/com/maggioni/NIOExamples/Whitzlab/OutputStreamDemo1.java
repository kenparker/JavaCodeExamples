package com.maggioni.NIOExamples.Whitzlab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo1 {

    public static void main(String[] args) {

        OutputStream os1 = new OutputStream() {

            @Override
            public void write(int b) throws IOException {
                System.out.println("");
            }
        };

        try {
            os1.close();
        } catch (IOException ex) {
            System.out.println("");
        }

        try (OutputStream os2 = new FileOutputStream("myFile.txt");) {

        } catch (FileNotFoundException ex) { // FileNotFoundException extend IO Exception
            System.out.println("");
        } catch (IOException ex) {
            System.out.println("");
        }

        try (OutputStream os4 = new FileOutputStream("myFile.txt", true);) {
        } catch (IOException e) {
        }

        try {
            OutputStream os3 = new FileOutputStream(new File("myFile.txt"));
        } catch (FileNotFoundException ex) {

        }
    }

}
