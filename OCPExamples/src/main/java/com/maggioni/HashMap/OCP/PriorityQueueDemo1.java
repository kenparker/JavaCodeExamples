package com.maggioni.HashMap.OCP;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("2");
        pq.add("4");
        pq.forEach(System.out::println);
        System.out.println(" queue size="+pq.size());
        System.out.println(" pq.peek()="+pq.peek()+" ");
        pq.forEach(System.out::println);
        pq.offer("1");
        System.out.println(" queue size="+pq.size());
        pq.add("3");
        boolean remove = pq.remove("1");
        System.out.println(" removed="+remove);
        pq.forEach(System.out::println);
        System.out.println(" pq.poll()="+pq.poll()+" ");
        if (pq.remove("2")) System.out.println(pq.poll()+"");
        System.out.println(" pq.poll()="+pq.poll()+"  pq.peek()="+pq.peek());
        System.out.println(" queue size="+pq.size());
        
        String[] st = {"b","AA","22","aa","2","B","c","1"};
        System.out.println("sorted in natural order :");
        Arrays.sort(st);
        Arrays.stream(st)
                .forEach(System.out::println);
        Comparator<Object> reverseOrder = Collections.reverseOrder();
        System.out.println("sorted in reverse order :");
        Arrays.sort(st,reverseOrder);
        Arrays.stream(st)
                .forEach(System.out::println);
        
        pq.addAll(Arrays.asList(st));
        System.out.println(" queue size="+pq.size());
        for (int i = pq.size() -1; i >= 0; i--) {
            pq.poll();
            System.out.println("size="+pq.size());
        }
        String poll = pq.poll();
        System.out.println("  pool() with empty Queue=" + poll);
    }

}
