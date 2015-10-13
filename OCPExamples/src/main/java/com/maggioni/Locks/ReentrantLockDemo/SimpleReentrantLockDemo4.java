package com.maggioni.Locks.ReentrantLockDemo;

import com.maggioni.Locks.ReentrantLockDemo.CounterToLock4;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import com.jcabi.log.Logger;

public class SimpleReentrantLockDemo4 implements Runnable{
    private CounterToLock4 counter;

    public SimpleReentrantLockDemo4(CounterToLock4 counter) {
        this.counter = counter;
    }

    
    
    public static void main(String[] args) {
        
        Lock loch = new ReentrantLock();
        CounterToLock4 counter = new CounterToLock4(loch, 0);
        
        Thread[] thread = new Thread[5];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(new SimpleReentrantLockDemo4(counter), "Thread-"+i);
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
        counter.getCounter();
    }

}
