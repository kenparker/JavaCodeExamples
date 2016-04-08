package com.maggioni.Concurrent.Demos;

import java.util.concurrent.Executor;

class myRun implements Runnable {

    @Override
    public void run() {
        System.out.println(""+Thread.currentThread().getName());
        System.out.println("do something");
    }
    
}

class myExe1 implements Executor {

    @Override
    public void execute(Runnable command) {
        command.run(); // no thread is created here
    }
    
}

class myExe2 implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
    
}
public class RunnableDemo1 {

    public static void main(String[] args) {
        Runnable r = new myRun();
        Thread t = new Thread(r);
        t.start();
        
        new myExe1().execute(r);
        new myExe2().execute(r);
    }

}
