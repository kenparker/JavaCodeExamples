package com.maggioni.logging.appenderbase.Launcher;

public class LogProducerBase implements Runnable{

    @Override
    public void run() {
        generateLog();
        doSomething();
    }
    
    public void generateLog(){
        
    }
    
    private void doSomething() {
        
    }
    
}
