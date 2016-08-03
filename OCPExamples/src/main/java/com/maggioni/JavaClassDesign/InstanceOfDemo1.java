package com.maggioni.JavaClassDesign;

public class InstanceOfDemo1 {

    public static void main(String[] args) {
        Short s = 15;
        Boolean b;
        
        //b = (s instanceof String); //do not compile
        b = (s instanceof Number);
        b = (s instanceof Short);
        
        Alpha alpha = new Gamma();
        Gamma gamma = new Gamma();
        Foo foo = new Foo();
        
        Alpha a1 = (Alpha)foo; // this works only because Alpha is an interface
                                // if Alpha were a Class, then the statement do not compile
        
        if (alpha instanceof Beta) { }
        if (foo instanceof Alpha) { }
               
    }

}

interface Alpha{}
class Beta implements Alpha{}
class Gamma extends Beta{}
class Foo{}
