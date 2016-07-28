package com.maggioni.MostMissed.PracticeTestII;

public class StaticVariableWithMethodInitialized {

    private static int x = getValue(); // forward referencing
                                        // variable y is not initialized yet
                                        // getValue() return 0
    private static int y = 5;
    private static int getValue() {
        return y;
    }
           
    public static void main(String[] args) {
        /*
        
        */
        System.out.println(x); // 0
                
    }

}
