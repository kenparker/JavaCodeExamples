package com.maggioni.methodreferences;

import java.util.function.Function;

public class MethodReferenceDemo3 {
    
    public static void main(String[] args) {
        String s = " HELLO  THEREEEE";
        print(String::toLowerCase, s);
        print(a-> a.toLowerCase(), s);
        print(new Function<String, String>() {

            @Override
            public String apply(String t) {
                return t.toLowerCase();
            }
        }, s);
        
        
    }
    
    public static void print(Function<String,String> function, String a) {
        System.out.println(function.apply(a));
    }
    
}
