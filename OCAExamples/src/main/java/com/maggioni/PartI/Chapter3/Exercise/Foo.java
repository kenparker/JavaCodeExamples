package com.maggioni.PartI.Chapter3.Exercise;

class Bar {
    int barNum = 28;
}
public class Foo {

    Bar myBar = new Bar();
    void changeId(Bar myBar) {
        myBar.barNum = 99;
        System.out.println("mybar " + myBar.barNum);
        myBar = new Bar();
        myBar.barNum = 88;
        System.out.println("mybar " + myBar.barNum);
    }
    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println("mybar " + foo.myBar.barNum);
        foo.changeId(foo.myBar);
        System.out.println("mybar " + foo.myBar.barNum);
    }
    
}
