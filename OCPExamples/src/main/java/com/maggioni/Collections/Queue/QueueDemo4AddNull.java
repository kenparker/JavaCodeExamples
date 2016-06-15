package com.maggioni.Collections.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo4AddNull {

    public static void main(String[] args) {
        Queue<Integer> qPriority = new PriorityQueue();
        Queue<Integer> qArrayDeque = new ArrayDeque();
        Queue<Integer> qLinkedList = new LinkedList();
        
        /*
        adding null do not work for PriorityQueue und ArrayDeque
        
        runtimeerror: java.lang.NullPointerException
        
        qPriority.add(null);
        qArrayDeque.add(null);
        
        */
        
        /*
        adding null works but not suggested
        */
        qLinkedList.add(null);
    }

}
