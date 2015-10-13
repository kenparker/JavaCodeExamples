package com.maggioni.Locks.ReentrantLockDemo;

import com.maggioni.Locks.ReentrantLockDemo.CounterToLock3;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import com.jcabi.log.Logger;

public class SimpleReentrantLockDemo3 implements Runnable{
    private CounterToLock3 counter;

    public SimpleReentrantLockDemo3(CounterToLock3 counter) {
        this.counter = counter;
        Logger.info(this,"Logger initialized");
    }

    
    
    public static void main(String[] args) {
        
        Lock loch = new ReentrantLock();
        CounterToLock3 counter = new CounterToLock3(loch, 0);
        
        Thread[] thread = new Thread[5];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(new SimpleReentrantLockDemo3(counter), "Thread-"+i);
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
        counter.getCounter(this);
    }

}
