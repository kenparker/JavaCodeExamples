package com.maggioni.logging.appenderbase.Launcher;

public class LogInfoLauncher extends ThreadLauncher{

    @Override
    public void submitLogGenerator() {
        this.es.execute(new LogInfoProducer());
    }
    
    public static void main(String[] args) {
        new LogInfoLauncher().submitThreads();
    }
}
