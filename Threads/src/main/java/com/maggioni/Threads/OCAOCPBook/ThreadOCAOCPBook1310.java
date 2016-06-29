package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook1310 extends Thread{

    public ThreadOCAOCPBook1310() {
        System.out.print("MyThread ");
    }

   
    public void run() {
        System.out.print("bar \n");
    }
    
    public void run(String s) {
        System.out.println("baz");
    }
    
    public static void main(String[] args) {
        Thread t = new ThreadOCAOCPBook1310() {
            
        };
        t.start(); // MyThread bar 
        
        new ThreadOCAOCPBook1310() {
           @Override
           public void run() {
               System.out.print("foo \n"); // MyThread foo
           }
        }.start();
    }

}
