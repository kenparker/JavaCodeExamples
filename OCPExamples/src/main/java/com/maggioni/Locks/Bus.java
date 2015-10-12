package com.maggioni.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bus {
    Lock lock = new ReentrantLock();
    public void boardBus(String name) {
        System.out.println(name+": boarded");
    }
}
