
package com.maggioni.Concurrent.Queue.Example_3;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * http://examples.javacodegeeks.com/core-java/util/concurrent/linkedblockingqueue/java-util-concurrent-linkedblockingqueue-example/
 */
public class LinkedBlockingQueueExample {
    
    public static void main(String[] args) {
        
        LinkedBlockingQueue queue = new LinkedBlockingQueue(10);
        
        Producer producer = new Producer(queue);
        ObservingConsumer observingConsumer = new ObservingConsumer(queue, producer);
        RemovingConsumer removingConsumer = new RemovingConsumer(queue, producer);
        
        Thread producerThread = new Thread(producer);
        Thread obsConsumerThread = new Thread(observingConsumer);
        Thread remConsumerThread = new Thread(removingConsumer);
        
        producerThread.start();
        obsConsumerThread.start();
        remConsumerThread.start();
    }
    
}
