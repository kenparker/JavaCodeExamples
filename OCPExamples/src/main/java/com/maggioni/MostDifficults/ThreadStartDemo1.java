package com.maggioni.MostDifficults;

public class ThreadStartDemo1 {

    public static void main(String[] args) {
        final MyThread1 myThread1 = new MyThread1();
        Thread t1 = new Thread(myThread1);
        t1.start();
    }

}

class MyThread1 implements Runnable{

    public void start() {
        System.out.println("Start Method ..."); // ignored
    }
    @Override
    public void run() {
        System.out.println("Run . . .");
    }
    
}
