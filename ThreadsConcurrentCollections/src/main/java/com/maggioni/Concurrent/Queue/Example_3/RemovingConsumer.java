package com.maggioni.Concurrent.Queue.Example_3;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author magang
 */
public class RemovingConsumer implements Runnable {

    private LinkedBlockingQueue queue;
    private Producer producer;

    public RemovingConsumer(LinkedBlockingQueue queue, Producer producer) {
        this.queue = queue;
        this.producer = producer;
    }

    @Override
    public void run() {
        while (producer.isRunning()) {
            try {
                System.out.println("RC\tRemoving element: " + queue.take());
                
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
        
        System.out.println("RC Completed");
    }

}
