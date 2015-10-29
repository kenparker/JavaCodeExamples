package com.maggioni.JavaClassDesign;

public class InstanceOfDemo1 {

    public static void main(String[] args) {
        Short s = 15;
        Boolean b;
        //b = (s instanceof String); do not compile
        b = (s instanceof Number);
        b = (s instanceof Short);
    }

}
