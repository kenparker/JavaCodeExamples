package com.maggioni.Threads;

import static java.lang.Thread.sleep;

public class MonitorDemo3 {

    public static void main(String[] args) {
        MyMonitorObject1 m = new MyMonitorObject1();
        Thread t1 = new Thread(new MyRunn12(m));
        Thread t2 = new Thread(new MyRunn21(m));
        t1.start();
        t2.start();
    }

}

class MyRunn12 implements Runnable {

    private MyMonitorObject1 m;

    public MyRunn12(MyMonitorObject1 m) {
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

class MyRunn21 implements Runnable {

    private MyMonitorObject1 m;

    public MyRunn21(MyMonitorObject1 m) {
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
 in this example the two methods syncronize on two different objects
the second object is part of the first object
syncronizing the first object do not syncronize the second object
 */
class MyMonitorObject1 {

    private Object syncObj = new Object();

    synchronized void leseMethod1() throws InterruptedException {
        System.out.println("start leseMethod1");
        Thread.sleep(5000);
        System.out.println("end leseMethod1");
    }

    void leseMethod2() throws InterruptedException {
        synchronized (syncObj) {
            System.out.println("start leseMethod2");
            sleep(5000);        // this statement do not work without the import statement above
            System.out.println("end leseMethod2");
        }
    }
}
