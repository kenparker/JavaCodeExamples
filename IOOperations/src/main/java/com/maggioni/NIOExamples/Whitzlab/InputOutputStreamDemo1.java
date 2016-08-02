package com.maggioni.NIOExamples.Whitzlab;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputOutputStreamDemo1 {

    public static void main(String[] args) {

        InputStream is1 = null;
        OutputStream os1 = null;
        try {
            is1 = new BufferedInputStream(new FileInputStream(new File("hello.txt")));
            os1 = new BufferedOutputStream(new FileOutputStream(new File("out.txt")));

            int a;
            byte[] b = new byte[1024];
            while ((a = is1.read(b)) != -1) {
                os1.write(b);
            }

        } catch (FileNotFoundException e) {
            System.out.println("FineNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        } finally {
            if (os1 != null) {
                try {
                    os1.close();
                } catch (IOException ex) {
                    Logger.getLogger(InputOutputStreamDemo1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (is1 != null) {
                try {
                    is1.close();
                } catch (IOException ex) {
                    Logger.getLogger(InputOutputStreamDemo1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

}
