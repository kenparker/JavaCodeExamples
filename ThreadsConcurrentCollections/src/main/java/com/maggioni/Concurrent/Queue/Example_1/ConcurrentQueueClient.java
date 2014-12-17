package com.maggioni.Concurrent.Queue.Example_1;

/**
 *
 * @author magang
 */
public class ConcurrentQueueClient implements Runnable
{

    private ConcurrentQueue concurrentQueue;

    public ConcurrentQueueClient(ConcurrentQueue concurrentQueue)
    {
        this.concurrentQueue = concurrentQueue;
    }

    public void run()
    {
        boolean stopCondition = (concurrentQueue.getQueueSize() == 0);

        while (!stopCondition)
        {

            for (int i = 0; i < concurrentQueue.getQueueSize(); i++)
            {
                System.out.println("Client dequeue item " + concurrentQueue.dequeueItem());

                try
                {
                    Thread.sleep(1500);

                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            stopCondition = (concurrentQueue.getQueueSize() == 0);
        }
        
        System.out.println("Client Thread exiting");
    }
}
