package com.maggioni.PartI.Whizlab.Pretest;

/**
 *
 * @author magang
 */
public class ExceptionDemo1 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Test {
    public static int getNumber() {
        try {
            int x = 10/0;
            return 10;
        } catch (Exception e) {
            return 9;
        } finally {
            return 8;
        }
        //return 0;
    }
}
