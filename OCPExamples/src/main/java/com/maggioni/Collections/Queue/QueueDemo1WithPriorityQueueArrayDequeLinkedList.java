package com.maggioni.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo1WithPriorityQueueArrayDequeLinkedList {

    public static void main(String[] args) {
        /*
        Queue is an Interface
        PriorityQueue und ArrayDeque are concreate implementations
        */
        Queue<Integer> qPriority = new PriorityQueue();
        Queue<Integer> qArrayDeque = new ArrayDeque();
        Queue<Integer> qLinkedList = new LinkedList();
        
        Integer[] integerArray = {25,3698,1,258,3};
        qPriority.addAll(Arrays.asList(integerArray));
        System.out.println(" " + qPriority); // [1, 3, 25, 3698, 258]
        // add insert element in the sorted position
        qPriority.add(4);
        System.out.println(" " + qPriority); // [1, 3, 4, 3698, 258, 25]
        // offer insert element at the tail
        qPriority.offer(5);
        System.out.println(" " + qPriority); // [1, 3, 4, 3698, 258, 25, 5]
        
        qArrayDeque.addAll(Arrays.asList(integerArray));
        System.out.println(" "+ qArrayDeque);   // [25, 3698, 1, 258, 3]
        // add and offer insert the element at the tail
        qArrayDeque.add(4);
        System.out.println(" " + qArrayDeque);  // [25, 3698, 1, 258, 3, 4]
        qArrayDeque.offer(5);
        System.out.println(" " + qArrayDeque);  // [25, 3698, 1, 258, 3, 4, 5] 
        
        qLinkedList.addAll(Arrays.asList(integerArray));
        System.out.println(" " +  qLinkedList); // [25, 3698, 1, 258, 3]
        qLinkedList.add(4);
        qLinkedList.offer(5);
        System.out.println(" " +  qLinkedList); // [25, 3698, 1, 258, 3, 4, 5]
        
        
        
    }

}
