package com.maggioni.NIOExamples.Whitzlab;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OutputStreamDemo2 {

    public static void main(String[] args) {

        /*
        FileOutputStream has five Constructors -> String, File, etc.
        OutputStream cannot be passed
        FileOutputStream cannot be passed too
        */
        try (FileOutputStream fo1 = new FileOutputStream("myFile.txt", true);) {
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        
        FileOutputStream fo2 = null;     
        try{
           fo2 = new FileOutputStream("myFile.txt", true); 
        } catch (IOException ex) {}
        finally {
            try {
                fo2.close();
            } catch (IOException ex) {
                Logger.getLogger(OutputStreamDemo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        /*
        BufferedOutputStream has only two Constructors
        */
        BufferedOutputStream bfs1 = new BufferedOutputStream(fo2);
        OutputStream bfs2 = new BufferedOutputStream(fo2);
        
    }

}
