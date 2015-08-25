package com.maggioni.methodreferences;

import java.util.function.Supplier;

public class MethodReferenceDemo2 {
    
    public static void main(String[] args) {
        String s = " HELLO there";
        print(s::toLowerCase);
        
        print(() -> s.toLowerCase());
        
        print(new Supplier<String>() {         
            @Override
            public String get() {
                return s.toLowerCase();
            }
        });
        
    }
    
    public static void print(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
    
}
