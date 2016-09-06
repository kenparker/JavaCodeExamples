package com.maggioni.java67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncronizedArrayListDemo1  {

    List<String> listOfThings = new ArrayList<>();
    
    public class ThreadIterate implements Runnable{
        @Override
        public void run() {
            iterateThroughList();
        }      
    }
    
    public class ThreadAddElemets implements Runnable{
        @Override
        public void run() {
            addElementToList();
        } 
    }
    
    public static void main(String[] args) {

        SyncronizedArrayListDemo1 sync = new SyncronizedArrayListDemo1();
        sync.loadArrayList();
        
        SyncronizedArrayListDemo1.ThreadIterate threadIterate = sync.new ThreadIterate();
        SyncronizedArrayListDemo1.ThreadAddElemets threadAddElemets = sync.new ThreadAddElemets();

        Thread t1 = new Thread(threadIterate, "t1");
        Thread t2 = new Thread(threadIterate, "t2");
        Thread t3 = new Thread(threadAddElemets, "t3");
        Thread t4 = new Thread(threadIterate, "t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public void loadArrayList() {
        // why do I need a syncronizedList Keyword here?
        listOfThings = Collections.synchronizedList(listOfThings);
        listOfThings.add("toster");
        listOfThings.add("patate");
        listOfThings.add("burro");
        listOfThings.add("Pane");
    }
    
    public void iterateThroughList() {
        synchronized (listOfThings) {
            System.out.println("----> " + Thread.currentThread().getName());

            Iterator<String> iterator = listOfThings.iterator();
            while (iterator.hasNext()) {
                System.out.println("" + iterator.next());
            }

        }
        
    }
    
    public void addElementToList() {
        synchronized(listOfThings) {
            System.out.println("----> " + Thread.currentThread().getName());
            listOfThings.add("vino");
            listOfThings.add("olio");
        }
    }

}
