package com.maggioni.sync;


/**
 * 
 * http://stackoverflow.com/questions/27105544/synchronize-across-threads
 */

public class LocalSync implements Runnable {

    private Integer sync = 0;

    public void someMethod() {
        synchronized (this) {
            System.out.println("[" + Thread.currentThread().getName() + "]" + " before value of sync is " + sync);
            sync++;
            System.out.println("[" + Thread.currentThread().getName() + "]" + " after value of sync is " + sync);
        }
    }

    @Override
    public void run() {
        someMethod();
    }

    public static void main(String[] args) {

        LocalSync localSync = new LocalSync();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(localSync, "Thread-" + i);
            threads[i].start();
        }

    }
}
