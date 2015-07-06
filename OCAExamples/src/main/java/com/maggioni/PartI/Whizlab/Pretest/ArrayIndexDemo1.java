package com.maggioni.PartI.Whizlab.Pretest;

public class ArrayIndexDemo1 {

    public static void main(String[] args) {
        long l = 0;
        String[] s = new String[100];
        //String h = s[l];    // do not compile as the index need to be int
        String h = s[(int) l];// works
        //String hh = s[(Integer) l]; // long cannot be converted to Integer
        Integer i = new Integer(10);
        String h2 = s[i];       // Integer is fine als index
                }

}
