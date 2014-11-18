package com.maggioni.Threads;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println("Executing thread "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        MyThread myThread = new MyThread("AngeloThread");
        myThread.start();
    }
    
}
