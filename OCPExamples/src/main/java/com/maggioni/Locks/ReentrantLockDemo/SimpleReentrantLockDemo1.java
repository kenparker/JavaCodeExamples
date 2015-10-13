package com.maggioni.Locks.ReentrantLockDemo;

import com.maggioni.Locks.ReentrantLockDemo.CounterToLock1;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import com.jcabi.log.Logger;

public class SimpleReentrantLockDemo1 implements Runnable {

    private CounterToLock1 counter;

    public SimpleReentrantLockDemo1(CounterToLock1 counter) {
        this.counter = counter;
        Logger.info(this, "Logger initialized");
    }

    public static void main(String[] args) {

        Lock loch = new ReentrantLock();
        CounterToLock1 counter = new CounterToLock1(loch, 0);
        final SimpleReentrantLockDemo1 simpleReentrantLockDemo1 = new SimpleReentrantLockDemo1(counter);

        Thread[] thread = new Thread[5];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(simpleReentrantLockDemo1, "Thread-" + i);
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
        counter.lock.lock();
        try {
            counter.count++;
            Logger.info(this, " count = (%d)", counter.count);

        } finally {
            counter.lock.unlock();
        }
    }

}
