package com.maggioni.Locks.ReentrantLockDemo;

import com.maggioni.Locks.ReentrantLockDemo.CounterToLock2;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import com.jcabi.log.Logger;

public class SimpleReentrantLockDemo2 implements Runnable{
    private CounterToLock2 counter;

    public SimpleReentrantLockDemo2(CounterToLock2 counter) {
        this.counter = counter;
        Logger.info(this,"Logger initialized");
    }

    
    
    public static void main(String[] args) {
        
        Lock loch = new ReentrantLock();
        CounterToLock2 counter = new CounterToLock2(loch, 0);
        
        Thread[] thread = new Thread[5];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(new SimpleReentrantLockDemo2(counter), "Thread-"+i);
            thread[i].start();
        }
        // join
        for (int i = 0; i < thread.length; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException ex) {
                // handle
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "] All threads have finished.");
    }

    @Override
    public void run() {     
        Logger.info(this, " count = (%d)", counter.getCounter());
    }

}
