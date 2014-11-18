package com.maggioni.ThreadSafeAndNotSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author angelomaggioni
 */
public class LockDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final Counter myCounter = new Counter(new ReentrantLock());

        // task to be executed by each thread
        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    System.out.printf("count at thread %s is %d %n", Thread.currentThread().getName(),
                            myCounter.getCounter());
                }
            }
        };

        // creating three threads
        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
        Thread t3 = new Thread(r, "t3");

        // Start Threads
        t1.start();
        t2.start();
        t3.start();

    }

}

class Counter {

    private Lock lock;
    private int count;

    public Counter(Lock myLock) {
        this.lock = myLock;
    }

    public final int getCounter() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
        return count;
    }
}
