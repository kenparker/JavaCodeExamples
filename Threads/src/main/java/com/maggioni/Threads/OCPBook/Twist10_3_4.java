package com.maggioni.Threads.OCPBook;

public class Twist10_3_4 {

    public static void main(String[] args) throws InterruptedException {
        Book3 book = new Book3();
        OnlineBuy3 onlineBuy3 = new OnlineBuy3(book);
        Thread t1 = onlineBuy3;
        t1.start(); // works
        //t1.join();
        System.out.println(" " +  onlineBuy3.getState());
        Thread t2 = onlineBuy3;
        t2.start(); // java.lang.IllegalThreadStateException

    }

}
