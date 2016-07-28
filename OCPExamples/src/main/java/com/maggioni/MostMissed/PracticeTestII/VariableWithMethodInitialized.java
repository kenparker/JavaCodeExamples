package com.maggioni.MostMissed.PracticeTestII;

public class VariableWithMethodInitialized {

    int x = getValue();
    static int y = 20;
    public static void main(String[] args) {
        VariableWithMethodInitialized var = new VariableWithMethodInitialized();
        System.out.println(var.x);
    }
    
    private int getValue() {
        return y;
    }

}
