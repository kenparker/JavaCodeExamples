package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook1316v2 implements Runnable{

    Chicks c;

    public ThreadOCAOCPBook1316v2() {
        /*
        moving the following statement in the constructor works
        */
        c = new Chicks();
    }
    
    public void ThreadOCAOCPBook1316v2() {System.out.println("I'n not the constructor");}
    
    
    public static void main(String[] args) {
        ThreadOCAOCPBook1316v2 v2 = new ThreadOCAOCPBook1316v2();
        v2.go();
        v2.ThreadOCAOCPBook1316v2();
    }
    void go() {
        new Thread(new ThreadOCAOCPBook1316v2()).start();
        new Thread(new ThreadOCAOCPBook1316v2()).start();
    }
    public void run() {
        /*
        it always throws java.lang.NullPointerException because the c variable 
        is not initialized
        */
        c.yack(Thread.currentThread().getId());
    }
}
