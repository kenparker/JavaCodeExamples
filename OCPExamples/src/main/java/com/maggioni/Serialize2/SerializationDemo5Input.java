package com.maggioni.Serialize2;

import com.maggioni.Serialize2.ClassWithStaticFields;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo5Input {

    
    public static void main(String[] args) {

        File file = new File("src/main/resources/serializeTest5.ser");
                
        input(file);
    }

    
    private static void input(File file) {
        try {
            FileInputStream fo = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fo);

            ClassWithStaticFields cl = (ClassWithStaticFields) ois.readObject();
            
            System.out.println("s " + cl.s);    // initialized as part of class initialization
            System.out.println("s2 " + cl.s2);
            System.out.println("s3 " + cl.s3);
            
            // following statement will throw an exception
            // java.io.InvalidClassException: com.maggioni.Serialize.ClassWithStaticFields; local class incompatible: stream classdesc serialVersionUID = 8476946199500736826, local class serialVersionUID = 3394499110271445253
            System.out.println("s4 " + cl.s4);
            System.out.println("s5 " + cl.s5);
            System.out.println("s6 " + cl.s6);
            System.out.println("s7 " + cl.s7);
            System.out.println("i " + cl.i);
            System.out.println("d " + cl.d);
            System.out.println("t1 " + cl.t1); // initialized to 0
            System.out.println("t2 " + cl.t2); // initialized to 123123
            
            /*
            s Hello
            s2 bb
            s3 cc
            i 20
            d 11111.1111
            t1 0
            */
            ois.close();
            fo.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}


