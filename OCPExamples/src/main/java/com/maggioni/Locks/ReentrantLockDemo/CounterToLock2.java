package com.maggioni.Locks.ReentrantLockDemo;

import java.util.concurrent.locks.Lock;

public class CounterToLock2 {
    private Lock lock;
    private int count;

    public CounterToLock2(Lock lock, int count) {
        this.lock = lock;
        this.count = count;
    }
    
    public int getCounter() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
        return count;
    }
    
    
}
