package com.maggioni.MostDifficults;

public class ThreadDemo1 {

    public static void main(String[] args) {
        Thread t = new Thread(new MyClass1());
        t.start();
        t = new Thread(new MyClass2());
        t.start();
    }

    
}

class MyClass1 extends Thread{}
class MyClass2 implements Runnable{

    @Override
    public void run() {
        //
    }
}
