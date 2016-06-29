package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook1316v1 implements Runnable{

    Chicks c;
    public static void main(String[] args) {
        new ThreadOCAOCPBook1316v1().go();
    }
    void go() {
        c = new Chicks();
        new Thread(new ThreadOCAOCPBook1316v1()).start();
        new Thread(new ThreadOCAOCPBook1316v1()).start();
    }
    public void run() {
        /*
        it always throws java.lang.NullPointerException because the c variable 
        is not initialized
        */
        c.yack(Thread.currentThread().getId());
    }
}

class Chicks {
    synchronized void yack(long id) {
        for (int i = 1; i < 3; i++) {
            System.out.println(id + " ");
            Thread.yield();
        }
    }
}
