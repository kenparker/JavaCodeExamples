package com.maggioni.Concurrent.Queue.Example_4;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author magang
 */
class Consumer implements Runnable {

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (queue.remainingCapacity() > 0) {
            System.out.println("Queue size :" + queue.size() + ", remaining capacity: " + queue.remainingCapacity());

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }

}
