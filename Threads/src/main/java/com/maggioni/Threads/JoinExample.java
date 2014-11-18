package com.maggioni.Threads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinExample implements Runnable {

    private  Random rand = new Random(System.currentTimeMillis());
    
            
    @Override
    public void run() {
        // simulate some CPU expensive task
        for (int i = 0; i < 1000000000; i++) {       
            rand.nextInt();
        }
        System.out.println("["+Thread.currentThread().getName()+"] finished. ");
    }

    public static void main(String[] args) throws InterruptedException {
       Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            System.out.println("joinThread-"+i+" starting");
            threads[i] = new Thread(new JoinExample(), "joinThread-"+i);        
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            System.out.println("["+Thread.currentThread().getName()+"] joining thread="+i);
            threads[i].join();
        }
        System.out.println("["+Thread.currentThread().getName()+"] All Threads have finished. ");
    }

}
