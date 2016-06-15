package com.maggioni.Collections.Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDequeDemo1AddMethods {

    public static void main(String[] args) {
        
        Integer[] integerArray = {25,3698,1,258,3};
        
        Queue queueLinkedList = new LinkedList(Arrays.asList(integerArray));
        Deque dequeLinkedList = new LinkedList(Arrays.asList(integerArray));
        
        
        /*
        Add methods
        
        addlast() and add() are the same
        */
        
        queueLinkedList.add(99);
        dequeLinkedList.add(99);
        System.out.println("Queue : " +  queueLinkedList); // [25, 3698, 1, 258, 3, 99]
        System.out.println("Deque : " +  dequeLinkedList); // [25, 3698, 1, 258, 3, 99]
        dequeLinkedList.addFirst(98);
        dequeLinkedList.addLast(95);
        System.out.println("Deque : " +  dequeLinkedList); // [98, 25, 3698, 1, 258, 3, 99, 95]
 
        queueLinkedList.offer(40);
        dequeLinkedList.offer(40);
        System.out.println("Queue : " +  queueLinkedList); // [25, 3698, 1, 258, 3, 99, 40]
        System.out.println("Deque : " +  dequeLinkedList); // [98, 25, 3698, 1, 258, 3, 99, 95, 40]
        
        /*
        push() and addFirst() are the same
        */
        dequeLinkedList.push(88);
        dequeLinkedList.addFirst(87);
        System.out.println("Deque : " +  dequeLinkedList); // 87, 88, ...]
        
    }

}
