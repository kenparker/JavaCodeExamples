package com.maggioni.Concurrent.Queue.Example_3;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author magang
 */
public class ObservingConsumer implements Runnable {

    private LinkedBlockingQueue queue;
    private Producer producer;

    public ObservingConsumer(LinkedBlockingQueue queue, Producer producer) {
        this.queue = queue;
        this.producer = producer;
    }

    @Override
    public void run() {
        while (this.producer.isRunning()) {
            System.out.println("OC\tElements right now :" + queue);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println("OC Completed.");
        System.out.println("Final elements in the queue :" + queue);
    }

}
