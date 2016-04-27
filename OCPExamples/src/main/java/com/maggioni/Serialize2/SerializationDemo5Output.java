package com.maggioni.Serialize2;

import com.maggioni.Serialize2.ClassWithStaticFields;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo5Output {

    static ClassWithStaticFields c = new ClassWithStaticFields();

    public static void main(String[] args) {

        File file = new File("src/main/resources/serializeTest5.ser");
        output(file);
        
    }

    private static void output(File file) {

        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fo);

           c.d = 11111.1111;
           c.i = 55;
           c.s2 = "bb";
           c.s3 = "cc";
            
            
            oos.writeObject(c);

            oos.flush();
            oos.close();
            fo.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


