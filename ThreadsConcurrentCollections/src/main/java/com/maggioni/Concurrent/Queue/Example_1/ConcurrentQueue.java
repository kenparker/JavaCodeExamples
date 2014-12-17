package com.maggioni.Concurrent.Queue.Example_1;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author magang
 */
public class ConcurrentQueue implements Runnable
{

    private ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<String>();

    public String dequeueItem()
    {
        if (!concurrentLinkedQueue.isEmpty())
        {
            System.out.println(" Queue Size : " + concurrentLinkedQueue.size());
            return concurrentLinkedQueue.remove();
        } else
        {
            return null;
        }
    }

    public int getQueueSize()
    {
        if (!concurrentLinkedQueue.isEmpty())
        {
            return concurrentLinkedQueue.size();
        } else
        {
            return 0;
        }
    }

    private void enqueueItem(String item)
    {
        System.out.println(" Enqueue item " + item);
        concurrentLinkedQueue.add(item);
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            enqueueItem("String " + i);


            try
            {
                Thread.sleep(1000);

            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        System.out.println("ConcurrentQueue Thread exiting");
    }
}
