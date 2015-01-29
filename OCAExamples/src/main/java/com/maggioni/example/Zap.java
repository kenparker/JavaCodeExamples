package com.maggioni.example;

public class Zap implements Foo{

    @Override
    public void go() {
       // BAR = 44; Error, won't compile
    }
    
}
