package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook1315v1 implements Runnable {

    static Dudesv2 d;

    public static void main(String[] args) {
        new ThreadOCAOCPBook1315v1().go();
    }

    @Override
    public void run() {
        d.chat(Thread.currentThread().getId());
    }
    
    void go() {
        d = new Dudesv2();
        new Thread(new ThreadOCAOCPBook1315v1()).start();
        new Thread(new ThreadOCAOCPBook1315v1()).start();
    }

}

class Dudesv2 {

    static long flag = 0;

    /*
    the output of this code is always 
    yo yo
    dude dude
    
    this is because the chat method is syncronized
    and the flag variable is static
    */
    synchronized void chat(long l) {

        if (flag == 0) flag = l;
        for (int i = 1; i < 3; i++) {
            if (flag == l) System.out.print("yo ");
            else System.out.print("dude ");
        }
        System.out.println("");
    }
}
