package com.maggioni.Serialize1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDemo3 {

    public static void main(String[] args) {
        
        
        
        File file = new File("src/main/resources/serializeTest3.ser");
        
        output(file);
        
        input(file);
                
    }

    private static void output(File file) {
        
        String s = "my first demo in serialization";
        double d = 12.3456;
        int i = 100200;
        Integer integer = 12000;
        
        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            
            oos.writeUTF(s);
            oos.writeInt(i);
            oos.writeInt(integer);
            oos.writeDouble(d);
            
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
            
            //String readUTF = ois.readUTF(); 
            int readInt = ois.readInt();
            int readInt1 = ois.readInt();
            double readDouble = ois.readDouble();
            
            /* output:
            readInt : 1994105
            readInt : 543582578
            readDouble : 1.4072309912026004E248
            */
            
            //double readDouble2 = ois.readDouble(); // java.io.EOFException
            
            //System.out.println("readUTF : "+ readUTF);
            System.out.println("readInt : "+ readInt);
            System.out.println("readInt : "+ readInt1);
            System.out.println("readDouble : "+ readDouble);
            
            
            ois.close();
            fo.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
       
    }

}
