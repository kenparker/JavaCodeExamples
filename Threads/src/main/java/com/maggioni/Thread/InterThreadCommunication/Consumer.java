package com.maggioni.Thread.InterThreadCommunication;

import java.util.Queue;
import org.apache.log4j.Logger;

/**
 *
 * @author angelomaggioni
 */
public class Consumer  extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class);
    protected final Queue sharedQ;
    
    public Consumer(Queue sharedQ) {
        super("Consumer");
        this.sharedQ = sharedQ;
    }
    
    @Override
    public void run() {
        while (true) {            
            
            //logger.debug("wait syncronized");
            synchronized (sharedQ) {
                //logger.debug("sync");
                // waiting condition - wait until Queue is not empty
                while (sharedQ.size() == 0) {
                    try {
                        logger.debug("Queue is empty, waiting ...");
                        sharedQ.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                }
                int number = (int) sharedQ.poll();
                logger.debug("Consuming : " +  number);
                sharedQ.notify();
                
                // termination condition
                if (number == 3) break;
            }
        }
    }
}
