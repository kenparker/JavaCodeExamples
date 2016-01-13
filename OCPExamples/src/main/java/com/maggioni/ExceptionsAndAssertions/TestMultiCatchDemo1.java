package com.maggioni.ExceptionsAndAssertions;

import java.io.IOException;

class Exception1 extends IOException {}
class Exception2 extends Exception {}

public class TestMultiCatchDemo1 {

    public static void main(String[] args) {
        
        try {
            int a = 10;
            if (a <= 10) {
                throw new Exception1();
            } else {
                throw new Exception2();
            }
        } catch (Exception1 | Exception2 e) {
            System.out.println(e);
        }
    }

}
