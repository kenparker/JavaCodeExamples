package com.maggioni.Threads;

import static java.lang.Thread.sleep;

public class MonitorDemo2 {    
    public static void main(String[] args) {
        MyMonitorObject2 m = new MyMonitorObject2();
        Thread t1 = new Thread(new MyRunn1(m));
        Thread t2 = new Thread(new MyRunn2(m));
        t1.start();
        t2.start();
    }

}



/*
both leseMethod1 and leseMethod1 synchronize on the monitor of the Object MonitorExample.

calls to the leseMethod1 and leseMethod2 try to acquire the object monitor, so the two methods cannot be executed in parallel
*/
class MyMonitorObject2 extends MyMonitorObjectTwo{

    
    @Override
     void leseMethod2() throws InterruptedException {
         /*
         this is another way to acquire the monitor ob the object
         */
         synchronized(this) {
            System.out.println("start leseMethod2");
            sleep(5000);        // this statement do not work without the import statement above
            System.out.println("end leseMethod2");
         }
    }
}
