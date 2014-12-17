package com.maggioni.Thread.InterThreadCommunication;

import java.util.Queue;
import org.apache.log4j.Logger;

/**
 *
 * @author angelomaggioni
 */
public class Producer extends Thread {

    
    private static final org.apache.log4j.Logger logger = Logger.getLogger(Producer.class);
    private final Queue sharedQ;

    public Producer(Queue sharedQ) {
        super("Producer");
        this.sharedQ = sharedQ;
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i < 4; i++) {
            
            synchronized (sharedQ) {
                // waiting condition - wait untill queue is not empty
                while (sharedQ.size() >= 1) {
                    try {
                        logger.debug("Queue is full, waiting ...");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                logger.debug("producing : " + i);
                sharedQ.add(i);
                sharedQ.notify();
            }
            
        }
    }
}
