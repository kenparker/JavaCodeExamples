package com.maggioni.queue;

import java.util.concurrent.SynchronousQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * http://javarevisited.blogspot.de/2014/06/synchronousqueue-example-in-java.html
 *
 * @author maggioni
 */
public class SynchronousQueueDemo {

    public static void main(String args[]) {

        final SynchronousQueue<String> queue = new SynchronousQueue<String>(true);

        Thread producer = new Thread("PRODUCER") {

            public void run() {

                int i = 0;
                for (i = 4; i >= 0; i--) {
                    String event = "Number " + i;

                    try {

                        queue.put(event);
                        System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), event);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SynchronousQueueDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        Thread consumer = new Thread("CONSUMER") {

            public void run() {
                int i = 0;
                for (i = 4; i >= 0; i--) {
                    try {
                        String event = queue.take();
                        System.out.printf("[%s] consumed event : %s %n", Thread.currentThread().getName(), event);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SynchronousQueueDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        producer.start();
        consumer.start();

    }
}
