package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook1315v2 implements Runnable {

    static Dudes d;

    public static void main(String[] args) {
        new ThreadOCAOCPBook1315v2().go();
    }

    @Override
    public void run() {
        d.chat(Thread.currentThread().getId());
    }
    
    void go() {
        d = new Dudes();
        new Thread(new ThreadOCAOCPBook1315v2()).start();
        new Thread(new ThreadOCAOCPBook1315v2()).start();
    }

}

class Dudes {

    static long flag = 0;

    /*
    the output is unpredictable because the chat method is not syncronized
    both threads could enter the chat method simultaneously
    
    the output could be : yo dude dude yo
    */
    void chat(long l) {

        if (flag == 0) flag = l;
        for (int i = 1; i < 3; i++) {
            if (flag == l) System.out.print("yo ");
            else System.out.print("dude ");
        }
        System.out.println("");
    }
}
