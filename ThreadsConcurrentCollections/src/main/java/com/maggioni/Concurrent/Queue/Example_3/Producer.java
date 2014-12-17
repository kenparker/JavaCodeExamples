package com.maggioni.Concurrent.Queue.Example_3;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author magang
 */
public class Producer implements Runnable {

    private LinkedBlockingQueue queue;
    private boolean running;

    public Producer(LinkedBlockingQueue queue) {
        this.queue = queue;
        this.running = true;
    }

    // We need to check if the producer thread is
    // Still running, and this method will return
    // the state (running/stopped).
    public boolean isRunning() {
        return running;
    }

    @Override
    public void run() {

        // We are adding elements using put() which waits
        // until it can actually insert elements if there is
        // not space in the queue.
        for (int i = 0; i < 15; i++) {

            String element = "String " + i;
            try {
                queue.put(element);
                System.out.println("P\tAdding element : " + element);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("P Completed");
        running = false;
    }

}
