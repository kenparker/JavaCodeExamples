package com.maggioni.Threads;

public class SyncJerkyThreadDemo1 extends Thread{

    private int data = 0;
    private boolean done = false;

    public SyncJerkyThreadDemo1(int x) {
        super();
        this.data = x;
    }
    public synchronized int getData() {
        return data;
    }
    public synchronized boolean isDone() {return done;}
    @Override
    public synchronized void run() {
        data += data;
        done = true;
    }
    public static void main(String[] args) {
        SyncJerkyThreadDemo1[] jta = new SyncJerkyThreadDemo1[3];
        for (int i = 0; i < 3; i++) {
            jta[i] = new SyncJerkyThreadDemo1(i); 
            if (i == 2) {
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    //
                }
            }
            jta[i].start();
        }
        for (SyncJerkyThreadDemo1 jt : jta) {
            if (jt.isDone()) {
                /*
                0 2 4
                0 2
                2 4
                4
                0 4
                0
                2
                */
                System.out.println(jt.getData());
            }
        }
    }

}
