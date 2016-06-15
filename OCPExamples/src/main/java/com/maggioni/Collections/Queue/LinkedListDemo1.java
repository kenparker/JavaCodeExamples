package com.maggioni.Collections.Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo1 {

    public static void main(String[] args) {
        
        Integer[] integerArray = {25,3698,1,258,3};

        Queue<Integer> qLinkedListAsQueue = new LinkedList(Arrays.asList(integerArray));
        Deque<Integer> qLinkedListAsDeque = new LinkedList(Arrays.asList(integerArray));
        List<Integer>  qLinkedListAsList = new LinkedList(Arrays.asList(integerArray));
        
        Integer get = qLinkedListAsList.get(2);
        /*
        no get element for a queue, elements can only be retrieved from the head
        */
        Integer element = qLinkedListAsQueue.element();
        
        qLinkedListAsDeque.element();
        qLinkedListAsDeque.getLast();
        qLinkedListAsDeque.getFirst();
        qLinkedListAsDeque.peek();
        qLinkedListAsDeque.peekFirst();
        qLinkedListAsDeque.peekLast();
        qLinkedListAsDeque.remove();
        qLinkedListAsDeque.remove(258);
        qLinkedListAsDeque.poll();
        qLinkedListAsDeque.pollFirst();
        qLinkedListAsDeque.pollLast();
    }

}
