package com.maggioni.Serialize1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerDemo1 {

    public static void main(String[] args) {
        
        
        
        File file = new File("src/main/resources/serializeTest.ser");
        
        output(file);
        
        input(file);
                
    }

    private static void output(File file) {
        
        Stock st = new Stock();
        st.name = "SPY";
        st.quote.date = new Date();
        st.quote.price = 20;
        
        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            
            oos.writeObject(st);
            
            oos.flush();
            oos.close();
            fo.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void input(File file) {
        try {
            FileInputStream fo = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fo);
             
            Stock st = (Stock) ois.readObject();
            
            System.out.println("" + st.name);
            
            ois.close();
            fo.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
       
    }

}
