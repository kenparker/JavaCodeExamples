package com.maggioni.JavaClassDesign;

import java.util.Arrays;

public class LoopDemo1 {
    
    public static void main(String[] args) {
        looping("_","-","A",".");
        String[] s = new String[] {"_","-","A","."};
        looping(s);
        looping(new String[] {"_","-","A","."});
        looping(Arrays.asList("_","-","A",".").toArray(new String[]{}));
    }
    
    static void looping(String... argStrings) {
        String $ = "";
        for (int x = 0; ++x < argStrings.length;) {
            $ += argStrings[x];
        }
        System.out.println("$ = "+$);
    }
}
