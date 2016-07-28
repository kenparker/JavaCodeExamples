package com.maggioni.MostMissed.PracticeTestII;

public class TestAssertionErrorDemo1 {

    static void testAssertionError() throws Error{
        if (true)
            throw new AssertionError();
        
        System.out.println("Test Assertion Error");
    }
    public static void main(String[] args) {
        try {
            testAssertionError(); // Exception in thread "main" java.lang.AssertionError
        } catch (Exception e) {
            System.out.println("exception is thrown");
        }
        System.out.println("end of the show");
    }

}
