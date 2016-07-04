package com.maggioni.Threads;

import static java.lang.Thread.sleep;

public class MonitorDemo1 {    
    public static void main(String[] args) {
        MyMonitorObjectTwo m = new MyMonitorObjectTwo();
        Thread t1 = new Thread(new MyRunn1(m));
        Thread t2 = new Thread(new MyRunn2(m));
        t1.start();
        t2.start();
    }

}

class MyRunn1 implements Runnable{
    private MyMonitorObjectTwo m;
    public MyRunn1(MyMonitorObjectTwo m) {
        this.m = m;
    }
    
    @Override
    public void run() {
        try {
            m.leseMethod1();
        } catch (InterruptedException ex) {
            //
        }
    }
    
}

class MyRunn2 implements Runnable{
    private MyMonitorObjectTwo m;
    public MyRunn2(MyMonitorObjectTwo m) {
        this.m = m;
    }
    
    @Override
    public void run() {
        try {
            m.leseMethod2();
        } catch (InterruptedException ex) {
            //
        }
    }
    
}

/*
both leseMethod1 and leseMethod1 synchronize on the monitor of the Object MonitorExample.

calls to the leseMethod1 and leseMethod2 try to acquire the object monitor, so the two methods cannot be executed in parallel
*/
class MyMonitorObjectTwo {

    synchronized void leseMethod1() throws InterruptedException {
        System.out.println("start leseMethod1");
        Thread.sleep(5000);
        System.out.println("end leseMethod1");
    }

    synchronized void leseMethod2() throws InterruptedException {
        System.out.println("start leseMethod2");
        sleep(5000);        // this statement do not work without the import statement above
        System.out.println("end leseMethod2");
    }
}
