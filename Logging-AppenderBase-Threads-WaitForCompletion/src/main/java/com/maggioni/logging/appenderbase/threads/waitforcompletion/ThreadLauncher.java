package com.maggioni.logging.appenderbase.threads.waitforcompletion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class ThreadLauncher {

    private static Logger logger = LoggerFactory.getLogger("root.ThreadLauncher");
    private static int NTHREADS = 5;
    ExecutorService es = Executors.newFixedThreadPool(NTHREADS);
    List<LogCallable> futureList = new ArrayList<>();

    public void doIt() {
        generateCallables();
        invokeAllCallables();
        shutdown();        
    }
    
    private void generateCallables() {
        logger.info("generateCallables");
        for (int i = 0; i < NTHREADS; i++) {
            LogCallable logCallable = new LogCallable();
            futureList.add(logCallable);
        }
    }
    
    private void invokeAllCallables() {
        logger.info("invokeAllCallables");
        try {
            List<Future<Void>> invokeAll = es.invokeAll(futureList);
        } catch (InterruptedException ex) {
            logger.error(ex.getMessage());
        }
    }

    private void shutdown() {
        logger.info("shutdown");
        es.shutdown();
    }

    protected abstract void submitLogGenerator();

    private class LogCallable implements Callable<Void>{

        @Override
        public Void call() throws Exception {
            submitLogGenerator();
            return null;
        }
    }
}
