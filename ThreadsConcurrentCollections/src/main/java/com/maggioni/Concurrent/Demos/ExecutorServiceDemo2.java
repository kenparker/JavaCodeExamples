package com.maggioni.Concurrent.Demos;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Order2 implements Callable<Void> { // implements Callable

    String name;

    public Order2(String name) {
        this.name = name;
    }

    @Override
    public Void call() throws Exception { // returns a Value
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name : " + threadName + " name :" + name);
        return null;
    }

}

class Hotel2 {

    ExecutorService service = Executors.newFixedThreadPool(5);

    public void orderFood(Order2 order) {
        service.submit(order); // the order is submitted for execution 
    }
    
    public void closeHotel() {
        service.shutdown();
    }

}

public class ExecutorServiceDemo2 {

    public static void main(String[] args) {
        Hotel2 hotel = new Hotel2();

        hotel.orderFood(new Order2("tea"));
        hotel.orderFood(new Order2("coffe"));
        for (int i = 0; i < 10; i++) {
            hotel.orderFood(new Order2("burger"+i));
        }
        
        hotel.closeHotel();
        
    }

}
