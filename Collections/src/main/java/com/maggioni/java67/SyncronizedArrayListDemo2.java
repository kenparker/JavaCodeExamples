package com.maggioni.java67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncronizedArrayListDemo2 {

    private List<String> listOfThings = Collections.synchronizedList(new ArrayList<>());
    
    public static void main(String[] args) throws InterruptedException {

        SyncronizedArrayListDemo2 sd2 = new SyncronizedArrayListDemo2();
    
        new IterateListOfThings(sd2.listOfThings).start();
        new BulkLoadListOfThings(sd2.listOfThings).start();
        new IterateListOfThings(sd2.listOfThings).start();
        new AddSomeElements(sd2.listOfThings).start();
        //Thread.sleep(1);
        new IterateListOfThings(sd2.listOfThings).start();
        Thread.sleep(1500);
        new IterateListOfThings(sd2.listOfThings).start();
        

    }

}

class BulkLoadListOfThings extends Thread {
    private List<String> listOfThings;

    public BulkLoadListOfThings(List<String> listOfThings) {
        this.listOfThings = listOfThings;
    }
    
    @Override
    public void run() {
        bulkLoadForTest();
    }
    
    public void bulkLoadForTest() {

        synchronized (listOfThings) {
            listOfThings.add("toaster");
            listOfThings.add("patatoes");
            listOfThings.add("chips");
            listOfThings.add("bread");
            listOfThings.add("spaghetti");
           
        }
    }
}

class IterateListOfThings extends Thread {

    private List<String> listOfThings;

    public IterateListOfThings(List<String> listOfThings) {
        this.listOfThings = listOfThings;
    }

    @Override
    public void run() {
        IterateThroughList();
    }

    public void IterateThroughList() {
        synchronized (listOfThings) {
            System.out.println("----> " + Thread.currentThread().getName());

            Iterator<String> iterator = listOfThings.iterator();
            while (iterator.hasNext()) {
                System.out.println("" + iterator.next());
            }
        }
    }
}

class AddSomeElements extends Thread {
    
    private List<String> listOfThings;

    public AddSomeElements(List<String> listOfThings) {
        this.listOfThings = listOfThings;
    }

    @Override
    public void run() {
        addElements();
    }
    
    public void addElements() {
        System.out.println("----> " + Thread.currentThread().getName());
        listOfThings.add("wine");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            //
        }
        listOfThings.add("Olive Oil");   
    }
    
}
