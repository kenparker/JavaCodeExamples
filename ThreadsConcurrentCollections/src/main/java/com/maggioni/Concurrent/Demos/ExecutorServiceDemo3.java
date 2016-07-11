package com.maggioni.Concurrent.Demos;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Order3 implements Callable<Void> { // implements Callable

    String name;

    public Order3(String name) {
        this.name = name;
    }

    @Override
    public Void call() throws Exception { // returns a Value
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name : " + threadName + " name :" + name);
        return null;
    }

}

class Hotel3 {

    final Queue<Order3> orders = new ArrayDeque<>();
    
    ExecutorService service = Executors.newFixedThreadPool(5);

    public void orderFood(Order3 order) {
        orders.offer(order);    // the order is first added to a queue
        //System.out.println(orders.size());
    }
    
    public void doIt() {
        try {
            List<Future<Void>> invokeAll = service.invokeAll(orders); // invoke all orders for execution
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public void closeHotel() {
        service.shutdown();
    }

}

public class ExecutorServiceDemo3 {

    public static void main(String[] args) {
        Hotel3 hotel = new Hotel3();

        /*
        all order as added first to a queue
        */
        hotel.orderFood(new Order3("tea"));
        hotel.orderFood(new Order3("coffe"));
        for (int i = 0; i < 10; i++) {
            hotel.orderFood(new Order3("burger"+i));
        }
        
        /*
        orders are submitted for execution all together
        */
        hotel.doIt();
        hotel.closeHotel();
    }

}
