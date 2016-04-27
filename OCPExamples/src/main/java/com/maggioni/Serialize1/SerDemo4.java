package com.maggioni.Serialize1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDemo4 {

    static String s = "my first demo in serialization";

    public static void main(String[] args) {

        File file = new File("src/main/resources/serializeTest4.ser");

        output(file);

        input(file);

    }

    private static void output(File file) {

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

            String readUTF = ois.readUTF();
            int readInt = ois.readInt();
            int readInt1 = ois.readInt();
            double readDouble = ois.readDouble();

            /* output:
                readUTF : my first demo in serialization
                readInt : 100200
                readInt : 12000
                readDouble : 12.3456
             */
            //double readDouble2 = ois.readDouble(); // java.io.EOFException
            System.out.println("readUTF : " + readUTF);
            System.out.println("readInt : " + readInt);
            System.out.println("readInt : " + readInt1);
            System.out.println("readDouble : " + readDouble);

            ois.close();
            fo.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
