package com.maggioni.Whizlab.Pretest.Inheritance;

public abstract class AbstractDemo1 {

    int absField = 0;
    public AbstractDemo1() {
        this.absField = 0;
    }

    public AbstractDemo1(int absField) {
    this.absField = absField;
    }
   
    void print() {
        System.out.println("Abstract class field :" + absField);
    }
    
    abstract void absMethod();
}
