package com.maggioni.Locks.ReentrantLockDemo;

import java.util.concurrent.locks.Lock;

public class CounterToLock1 {
    Lock lock;
    int count;

    public CounterToLock1(Lock lock, int count) {
        this.lock = lock;
        this.count = count;
    }
    
    
}
