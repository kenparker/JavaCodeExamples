package com.maggioni.Concurrent.Queue.Example_4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * http://examples.javacodegeeks.com/core-java/util/concurrent/arrayblockingqueue/java-util-concurrent-arrayblockingqueue/
 */
public class ArrayBlockingQueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Let's create a blocking queue that can hold at most 5 elements.
        BlockingQueue queue = new ArrayBlockingQueue(5);
        
        // The two threads will access the same queue, in order 11
        // to test its blocking capabilities.
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        
        producer.start();
        consumer.start();
        
    }
    
}
