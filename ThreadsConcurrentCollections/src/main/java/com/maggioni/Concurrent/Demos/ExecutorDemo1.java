package com.maggioni.Concurrent.Demos;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

class Order implements Runnable { // implements Runnable

    String name;

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    

    @Override
    public void run() { // no return value
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name : " + threadName + " name :" + name);
        Long duration = (long) (ThreadLocalRandom.current().nextLong(1, 10));
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}

class Hotel implements Executor {

    final Queue<Runnable> custQueue = new ArrayDeque<>();

    @Override
    public void execute(Runnable r) {
        synchronized (custQueue) {
            custQueue.offer(r);
        }
        processEarliestOrder();
    }

    private void processEarliestOrder() {
        synchronized (custQueue) {
            Runnable task = custQueue.poll();
            new Thread(task).start();
        }
    }
}

public class ExecutorDemo1 {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.execute(new Order("tea"));
        hotel.execute(new Order("coffe"));
        hotel.execute(new Order("burger"));
    }

}
