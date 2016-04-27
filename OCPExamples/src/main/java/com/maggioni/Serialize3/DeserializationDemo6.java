package com.maggioni.Serialize3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeserializationDemo6 {

    public static void main(String[] args) {

                File file = new File("src/main/resources/serializeTest6.ser");
                
        try {
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            
            ChildOfChild c = (ChildOfChild) ois.readObject();
            
            System.out.println("c " +  c.c);
            System.out.println("c2 " +  c.c2);
            System.out.println("s1 " +  c.s1);
            System.out.println("s2 " +  c.s2);
            System.out.println("x " +  c.x);
            /*
            constructor from Base
            c ssssss
            c2 ffffff
            s1 null
            s2 in init block
            x hello from ChildOfChild
            */
            ois.close();
            is.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeserializationDemo6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DeserializationDemo6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeserializationDemo6.class.getName()).log(Level.SEVERE, null, ex);
        }
                

    }

}
