package com.maggioni.Concurrent.Demos;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

public class BasicThreadPoolExecutorDemo1 {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        System.out.println("executor.getMaximumPoolSize() :" + executor.getMaximumPoolSize());
        executor.setMaximumPoolSize(5);
        System.out.println("executor.getMaximumPoolSize() :" + executor.getMaximumPoolSize());
        
        
        for (int i = 0; i < 10; i++) {
            Order order = new Order("Order "+i);
            System.out.println("new order has been added : " + order.getName());
            try {
                executor.execute(order);
            } catch (RejectedExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("executor.getPoolSize() :" + executor.getPoolSize());
        System.out.println("executor.getActiveCount() :" + executor.getActiveCount());
        System.out.println("executor.getCompletedTaskCount() :" + executor.getCompletedTaskCount());
        
        executor.shutdown();
    }

}
