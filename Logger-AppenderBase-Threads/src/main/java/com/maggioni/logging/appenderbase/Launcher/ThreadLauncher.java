package com.maggioni.logging.appenderbase.Launcher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public abstract class ThreadLauncher {

    private static int NTHREADS = 5;
    ExecutorService es = Executors.newFixedThreadPool(NTHREADS);

    public void submitThreads() {
        for (int i = 0; i < NTHREADS; i++) {
            submitLogGenerator();
        }        
        shutdown();
    }

    private void shutdown() {
        es.shutdown();
        try {
            es.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException ex) {           
        }
    }

    public abstract void submitLogGenerator();
}
