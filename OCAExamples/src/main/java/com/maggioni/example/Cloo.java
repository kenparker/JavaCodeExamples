package com.maggioni.example;

// import works because Class Roo is Public otherwise would not work
import com.maggioni.figure12.Roo;

public class Cloo extends Roo{

    public static void main(String[] args) {
        Cloo cl = new Cloo();
        cl.testCloo();
    }

    public void testCloo() {
        System.out.println(doTooThings());
    }
}
