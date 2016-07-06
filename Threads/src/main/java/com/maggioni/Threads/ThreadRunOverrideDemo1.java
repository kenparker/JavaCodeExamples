package com.maggioni.Threads;

public class ThreadRunOverrideDemo1 extends Thread{

    public static void main(String[] args) throws InterruptedException {
        
        ThreadRunOverrideDemo1 t1 = new ThreadRunOverrideDemo1();
        ThreadRunOverrideDemo1 t2 = new ThreadRunOverrideDemo1() {
            public void run() {
                System.out.println("anonymus class");
            }
        };
        Thread t3 = new Thread(t1);
        t1.start();         // original run
        t1.join();
        t2.start();         // anonymus class
        t2.join();          
        t3.start();         // original run
        
        Thread t4 = new Thread(new MyRunOverride());
        t4.start();
        
        Thread t5 = new Thread(new MyRunOverride()) {
            public void run() {
                System.out.println("I'm from anonymus t5");
            }
        };
        t5.start();
                
        
    }

    @Override
    public void run() {
        System.out.println("original run");
    }
}

class MyRunOverride implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm from MyRunOverride");
    }
    
}
