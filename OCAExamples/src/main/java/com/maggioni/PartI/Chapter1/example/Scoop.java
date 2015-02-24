package com.maggioni.PartI.Chapter1.example;
/*
this is a Exam question
The Statemets do not compile without line 9

Originally the var x was declared in Line 14
x is not defined in the catch and finally block
as it is a local var in try block
*/
public class Scoop {
    static int thrower() throws Exception { return 42;}
    public static void main(String[] args) {
        int x=0;    // The only way this code is going to work
                    // is with the declaration of x in Line 9
        try {
            // int x = thrower();
             x = Scoop.thrower();   // this is a tricky statement
                                    // It works perfectly and the return is 42
        } catch (Exception e) {     // There is nothing to catch
            x++;                    // this statement is never done
        } finally {
            System.out.println("X = " + ++x);   // the output is 43=1+42
        }
            
    }
}
