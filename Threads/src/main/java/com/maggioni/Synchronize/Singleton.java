package com.maggioni.Synchronize;

/**
 *
 * http://javarevisited.blogspot.de/2011/04/synchronization-in-java-synchronized.html
 * 
 * 1. synchronized keyword doesn't allow separate locks for reading and writing.
 * as we know that multiple thread can read without affecting thread-safety of class, 
 * synchronized keyword suffer performance due to contention in case of multiple reader and one or few writer.
 * 2. if one thread is waiting for lock then there is no way to time out, thread can wait indefinitely for lock.
 * 3. on similar note if thread is waiting for lock to acquired there is no way to interrupt the thread.
 * 
 * http://jeremymanson.blogspot.de/2007/08/atomicity-visibility-and-ordering.html
 * 
 */
public class Singleton {
    
    private static volatile Singleton instance;
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new  Singleton();
                    
                }
            }
            
        }
        
        return instance;
    }
    
}
