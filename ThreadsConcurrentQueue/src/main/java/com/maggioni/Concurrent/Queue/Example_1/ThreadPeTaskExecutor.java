package com.maggioni.Concurrent.Queue.Example_1;

import java.util.concurrent.Executor;

/**
 *
 * @author magang
 */
public class ThreadPeTaskExecutor implements  Executor 
{
    
    public void execute(Runnable r)
    {
        new Thread(r).start();
    }
    
    public static void main(String[] args)
    {
        Executor executor = new ThreadPeTaskExecutor();
        
        ConcurrentQueue concurrentQueue = new ConcurrentQueue();
        executor.execute(concurrentQueue);
        executor.execute(new ConcurrentQueueClient(concurrentQueue));
    }
}
