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
        
    }

    @Override
    public void run() {
        System.out.println("original run");
    }
}
