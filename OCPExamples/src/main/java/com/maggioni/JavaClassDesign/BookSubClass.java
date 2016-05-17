package com.maggioni.JavaClassDesign;

public class BookSubClass extends BookBase{
    
    @Override
    public void method1(CharSequence c) {
        
    }
    
    // Overload not override
    public void method1(String s) {
        
    }
    
    public void method1() {
        
    }
    
    /* 
    correct Overriding but you cannot override the same method twice
    @Override
    public CharSequence method2() {
        return "Hello again";
    }
    */
    
    /*
    correct Overriding with a Covariant return type
    */
    @Override
    public String method2() {
        return "Hello again";
    }
}
