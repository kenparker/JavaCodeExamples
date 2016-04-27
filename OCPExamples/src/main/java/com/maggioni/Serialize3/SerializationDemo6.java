package com.maggioni.Serialize3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializationDemo6 {

    public static void main(String[] args) {
        ChildOfChild c = new ChildOfChild();
        c.c = "ssssss";
        c.s1 = "in ser";
        
        File file = new File("src/main/resources/serializeTest6.ser");
        
        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            
            oo.writeObject(c);
            
            oo.close();
            fo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializationDemo6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerializationDemo6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
