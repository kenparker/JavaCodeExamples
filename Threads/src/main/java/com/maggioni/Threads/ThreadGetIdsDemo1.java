package com.maggioni.Threads;

public class ThreadGetIdsDemo1 {

    public static void main(String[] args) {
        System.out.println("id= " + Thread.currentThread().getId());
        
        Runn r = new Runn();
        
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        
    }

}

class Runn implements Runnable {

    @Override
    public void run() {
        System.out.println("id= " + Thread.currentThread().getId());
    }
    
}
