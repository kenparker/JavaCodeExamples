package com.maggioni.Threads;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Executing thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread myThread1 = new Thread(new MyRunnable(), "AngeloRunnable1");
        Thread myThread2 = new Thread(new MyRunnable(), "AngeloRunnable2");
        myThread1.start();
        myThread2.start();
    }

}
