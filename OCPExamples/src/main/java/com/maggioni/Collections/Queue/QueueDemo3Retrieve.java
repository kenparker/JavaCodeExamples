package com.maggioni.Collections.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo3Retrieve {

    public static void main(String[] args) {
        Queue<Integer> qPriority = new PriorityQueue();
        Queue<Integer> qArrayDeque = new ArrayDeque();
        Queue<Integer> qLinkedList = new LinkedList();

        /*
         queue are empty
        
        peek() and poll() behave in this case the same, they return a 'null' value
         */
        Integer peek1 = qPriority.peek();
        Integer peek2 = qArrayDeque.peek();
        Integer peek3 = qLinkedList.peek();
        System.out.println("qPriority.peek()   : " + peek1); // null
        System.out.println("qArrayDeque.peek() : " + peek2); // null
        System.out.println("qLinkedList.peek() : " + peek3); // null
        Integer poll1 = qPriority.poll();
        Integer poll2 = qArrayDeque.poll();
        Integer poll3 = qLinkedList.poll();
        System.out.println("qPriority.poll()   : " + poll1);    // null
        System.out.println("qArrayDeque.poll() : " + poll2);    // null
        System.out.println("qLinkedList.poll() : " + poll3);    // null

        /*
        remove() and elemnt() behave in this case the same, runtimeerror
        */
        Integer remove1 = null;
        try {
            remove1 = qPriority.remove();                   // runntimeerror
            qPriority.element();                            // runtimeerror
            System.out.println("qPriority.poll()   : " + remove1);
        } catch (NoSuchElementException e) {
            System.out.println(" java.util.NoSuchElementException thown by remove() if queue is empty");
        }

        /*
         Exception in thread "main" java.util.NoSuchElementException
         Integer remove2 = qArrayDeque.remove();
         qLinkedList.remove();
         */
    }

}
