package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook1313 implements Runnable{

    void go(long id) {
        System.out.print(id + "\n");
    }
    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getId() + " ");
        /*
        the following two statement will always produce an output like: 1
        new ThreadACAOCPBook1313().run(); 
        new Thread(new ThreadACAOCPBook1313()).run();
        */
        /*
        the following statement do not compile
        new ThreadACAOCPBook1313().start();
        */
        /*
        the following statement do not do anything
        the thread is created but not startet
        */
        new Thread(new ThreadOCAOCPBook1313());
        /*
        the following statement produce an output like: 2
        */
        new Thread(new ThreadOCAOCPBook1313()).start();
        
    }

    @Override
    public void run() {
        go(Thread.currentThread().getId());
    }

}
