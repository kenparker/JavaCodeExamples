package com.maggioni.Concurrent.CopyOnWrite;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
Example from OCA/OCP Java SE7 Study Guide
*/
public class CopyOnWriteArrayListDemo1 {

    public static void main(String[] args) {
       
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("Hallo");
        System.out.println("copyOnWriteArrayList.hashCode() :"+copyOnWriteArrayList.hashCode());    // same object  
        System.out.println("Integer.toHexString(System.identityHashCode(copyOnWriteArrayList)) :"+Integer.toHexString(System.identityHashCode(copyOnWriteArrayList)));
        copyOnWriteArrayList.addIfAbsent("Hallo"); // not added as already present
        System.out.println("copyOnWriteArrayList.hashCode() :"+copyOnWriteArrayList.hashCode());    // same object  
        copyOnWriteArrayList.addIfAbsent("How are you doing?"); 
        System.out.println("copyOnWriteArrayList.hashCode() :"+copyOnWriteArrayList.hashCode());     // new object
        copyOnWriteArrayList.addIfAbsent("Fine thanks!"); 
        System.out.println("copyOnWriteArrayList.hashCode() :"+copyOnWriteArrayList.hashCode());    // new object
        
        /*copyOnWriteArrayList.stream()
        .forEach(System.out::println);*/
        
        Iterator<String> iterator1 = copyOnWriteArrayList.iterator();
        copyOnWriteArrayList.addIfAbsent("and you? How are you doing?"); // added after the iterator
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());    // content of the Array WITHOUT the last element     
        }
        Iterator<String> iterator2 = copyOnWriteArrayList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());    // content of the Array WITH the last element     
        }
        
        
    }

}
