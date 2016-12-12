package com.maggioni.logging.appenderbase.Launcher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class ThreadLauncher {

    private static int NTHREADS = 5;
    ExecutorService es = Executors.newFixedThreadPool(NTHREADS);

    public void submitThreads() {

        for (int i = 0; i < NTHREADS; i++) {

            submitLogGenerator();
        }
        
        es.shutdown();
    }

    public abstract void submitLogGenerator();
}
