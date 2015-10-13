package com.maggioni.Locks.ReentrantLockDemo;

import java.util.concurrent.locks.Lock;
import com.jcabi.log.Logger;

public class CounterToLock3 {
    private Lock lock;
    private int count;

    public CounterToLock3(Lock lock, int count) {
        this.lock = lock;
        this.count = count;
    }
    
    public int getCounter(Object source) {
        lock.lock();
        try {
            count++;
            Logger.info(source, " count = (%d)", count);
        } finally {
            lock.unlock();
        }
        return count;
    }
    
    
}
