package com.maggioni.Thread.InterThreadCommunication;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * javarevisited,blogspot.sg/2013/12
 */
public class InterThreadCommunicationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        BasicConfigurator.configure();
        final Queue sharedQ = new LinkedList();
        
        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);
        
        producer.start();
        consumer.start();
        
    }
    
    
}

