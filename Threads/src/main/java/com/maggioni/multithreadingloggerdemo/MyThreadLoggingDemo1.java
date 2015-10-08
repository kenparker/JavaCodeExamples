package com.maggioni.multithreadingloggerdemo;

import com.jcabi.log.Logger;
/*
http://www.yegor256.com/2014/05/23/avoid-java-static-logger.html
*/

public class MyThreadLoggingDemo1 extends Thread{

    public MyThreadLoggingDemo1 (String name) {
        super(name);
        Logger.info(this,"Logger initialized");
    }
    
    @Override
    public void run() {
        Logger.info(this, "method #bar(%d) was called", 20);
    }
    
    public static void main(String[] args) {
       
        
        MyThreadLoggingDemo1 myThread;
        for (int i = 0; i < 100; i++) {
            myThread = new MyThreadLoggingDemo1("AngeloThread"+i);
            myThread.start();
        }
    }
    
}
