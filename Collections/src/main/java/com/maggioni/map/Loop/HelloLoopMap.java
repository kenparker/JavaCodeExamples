package com.maggioni.Map.Loop;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* http://java67.blogspot.de/2014/05/3-examples-to-loop-map-in-java-foreach.html
*
*/

public class HelloLoopMap {

    private static final Map<Integer, Worker> workersById = new HashMap<>();

    public static void main(String args[]) {

        // let's initialize Map for useworkersById.put(76832, new Worker(76832, "Tan", 8000));
        workersById.put(76833, new Worker(76833, "Tim", 3000));
        workersById.put(76834, new Worker(76834, "Tarun", 5000));
        workersById.put(76835, new Worker(76835, "Nikolai", 6000));
        workersById.put(76836, new Worker(76836, "Roger", 3500));

        // looping through map using foreach loop
        // print initial salary of workers
        System.out.println("Initial Salaries of workers");

        Set<Map.Entry<Integer, Worker>> entrySet = workersById.entrySet();

        for (Map.Entry<Integer, Worker> entry : entrySet) {
            Worker worker = entry.getValue();
            System.out.printf("%d %s :\t %d %n", entry.getKey(), worker.getName(),
                    worker.getSalary());
        }

        // looping through map using Iterator
        // updating salary of each worker
        Iterator<Integer> itr = workersById.keySet().iterator();
        while (itr.hasNext()) {
            Worker current = workersById.get(itr.next());
            int increasedSalary = (int) (current.getSalary() * 1.08);
            current.setSalary(increasedSalary);
        }

        // how to loop map using for loop
        // looping through values using for loop
        Collection<Worker> workers = workersById.values();
        System.out.println("New Salaries of Workers : ");
        for (Worker worker : workers) {
            System.out.printf("%s :\t %d %n", worker.getName(),
                    worker.getSalary());
        }

    }
}
