package com.maggioni.Threads.OCPBook;

import java.util.Set;

public class DisplayAllThreadsDemo1 {

    public static void main(String[] args) {
        Set<Thread> keySet = Thread.getAllStackTraces().keySet();
        for (Thread keySet1 : keySet) {
            System.out.println( keySet1 + " " + keySet1.getState());
        }
    }

}
