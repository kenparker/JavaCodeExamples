package com.maggioni.Threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WaitTimeoutDemo1 {

    private List synchedList;

    public WaitTimeoutDemo1() {
        synchedList = Collections.synchronizedList(new ArrayList());
    }
    public String removeElement() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Opening ...");
        synchronized(synchedList) {
            while (synchedList.isEmpty()) {
                System.out.println("List is empty :");
                /*
                the following statement compile
                but there is a runtime error : IllegalMonitorStateException
                wait(10000);        // InterruptedException is needed
                */
                synchedList.wait(10000);        // InterruptedException is needed
                System.out.println("still waiting ... ");
            }
        String remove = (String) synchedList.remove(0);     // this staemend do not throw a runtimeerror
                                                            // the reason is that the list ist synchronized
                                                            // if the list is not synchronized, that that would habe led to an error
        System.out.println(Thread.currentThread().getName() + " Closing ...");
        return remove;
        }
    }
    public void addElement(String element) {
        System.out.println(Thread.currentThread().getName() + " Opening ...");
        
        synchronized(synchedList) {
            synchedList.add(element);
            System.out.println("new Element: " +  element);
            
            synchedList.notifyAll();
            System.out.println("NotifyAll called!");
        }
        
        System.out.println(Thread.currentThread().getName() + " Closing ...");
    }
    
    public static void main(String[] args) {
        final WaitTimeoutDemo1 wt = new WaitTimeoutDemo1();
        
        Runnable runRemove = new Runnable() {

            @Override
            public void run() {
                try {
                    for (; ; ) {
                        String removeElement = wt.removeElement();
                        System.out.println("removed element: " + removeElement);            
                    }
                } catch (InterruptedException ex) {
                    System.out.println(Thread.currentThread().getName() + " Interrupted ...");
                }
            }
        };
        Runnable runAdd = new Runnable() {
            public void run() {
                wt.addElement("hello " + Thread.currentThread().getName());     // wt is a local variable and it need to be declared final
            }
        };
        
        Thread ta1 = new Thread(runRemove, "Remove1");
        ta1.start();
        Thread ta2 = new Thread(runRemove, "Remove2");
        ta2.start();
        Thread ta3 = new Thread(runRemove, "Remove3");
        ta3.start();
        
        try {
            System.out.println(Thread.currentThread().getName() + " sleeping ...");
            Thread.sleep(5000);
            //ta.interrupt();
        } catch (InterruptedException ex) {
            //
        }
        
        Thread tb = new Thread(runAdd, "B");
        Thread tc = new Thread(runAdd, "C");
        tb.start(); tc.start();
        
        try {
            Thread.sleep(10000);
            ta1.interrupt();
            ta2.interrupt();
            ta3.interrupt();
            ta1.interrupt(); // no error
            Thread.sleep(1000);
            System.out.println("State : " +  ta1.getState());
            System.out.println("State : " +  ta1.getState());
        } catch (InterruptedException ex) {
            System.out.println("error");
        }
    }

}
