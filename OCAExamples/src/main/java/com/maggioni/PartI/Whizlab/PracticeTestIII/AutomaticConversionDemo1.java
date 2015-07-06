package com.maggioni.PartI.Whizlab.PracticeTestIII;

public class AutomaticConversionDemo1 {

    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        b = (byte)s;
        s = (short) 1.2;
        int i = 10;
        i = (int)1.2;
    }

}
