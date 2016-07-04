package com.maggioni.Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDemo3 {

    class InnerRun implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    //
                }
                System.out.print("Ren ");
            }
        }
        
    }
    class InnerRunTwo implements Runnable{
        Thread other;

        public InnerRunTwo(Thread other) {
            this.other = other;
        }
        
        @Override
        public void run() {
            try {
                other.sleep(5);
            } catch (InterruptedException ex) {
                //
            }
            try {
                other.join();
                System.out.println("");
            } catch (InterruptedException ex) {
                //
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("Stimpy ");
            }
            System.out.println("");
        }
        
    }
    void start(){
        InnerRun ir = new InnerRun();
        Thread t = new Thread(ir);
        InnerRunTwo irr = new InnerRunTwo(t);
        Thread u = new Thread(irr);
        t.start();
        u.start();
    } 
            
    public static void main(String[] args) {
        ThreadDemo3 td = new ThreadDemo3();
        td.start();
    }

}
