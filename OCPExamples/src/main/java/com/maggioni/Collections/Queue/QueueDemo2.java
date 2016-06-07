package com.maggioni.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo2 {

    public static void main(String[] args) {
        /*
        Queue is an Interface
        PriorityQueue und ArrayDeque are concreate implementations
        */
        Queue<Integer> qPriority = new PriorityQueue();
         
        Integer[] integerArray = {25,3698,1,258,3};
        qPriority.addAll(Arrays.asList(integerArray));
        
        boolean add = qPriority.add(4);
        boolean offer = qPriority.offer(5);
        System.out.println(" " + qPriority); // [1, 3, 4, 3698, 258, 25, 5]
        Integer peek = qPriority.peek();
        System.out.println(" peek retrieve from the HEAD and do not remove : " + peek +  " queue: " + qPriority); // 1 queue: [1, 3, 4, 3698, 258, 25, 5]
        Integer poll = qPriority.poll();
        System.out.println(" poll retrieve from the HEAD and        remove : " + poll +  " queue: " + qPriority); // 1 queue: [3, 5, 4, 3698, 258, 25]
        Integer remove = qPriority.remove();
        System.out.println(" remove retrieve from the HEAD and        remove : " + remove +  " queue: " + qPriority); // 3 queue: [5, 4, 3698, 258, 25]
        boolean remove1 = qPriority.remove(3698);
        System.out.println(" object 3698 removed : " +  remove1 + " queue: " + qPriority); // true queue: [4, 5, 25, 258]
        qPriority.removeAll(Arrays.asList(integerArray));
        System.out.println(" " +  qPriority); // [4, 5]
        
        
    }

}
