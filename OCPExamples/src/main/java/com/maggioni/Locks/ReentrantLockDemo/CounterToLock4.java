package com.maggioni.Locks.ReentrantLockDemo;

import java.util.concurrent.locks.Lock;
import com.jcabi.log.Logger;

public class CounterToLock4 {
    private Lock lock;
    private int count;

    public CounterToLock4(Lock lock, int count) {
        this.lock = lock;
        this.count = count;
        Logger.info(this,"Logger initialized");
    }
    
    public int getCounter() {
        lock.lock();
        try {
            count++;
            Logger.info(this, " count = (%d)", count);
        } finally {
            lock.unlock();
        }
        return count;
    }
    
    
}
