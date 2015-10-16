package com.maggioni.Concurrent.Example_5;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo1 {

     private ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
     private ConcurrentHashMap<String, Integer> chput = new ConcurrentHashMap<>();
     
     public void putMethodsDemo() {
         Integer put = chm.put("Angelo", 2015);
         Integer putIfAbsent = chm.putIfAbsent("Paolo", 215558);
         chm.putAll(chput); // retun void
     }
     
     public void getMethodsDemo() {
         Set<Map.Entry<String, Integer>> entrySet = chm.entrySet();
         Integer get = chm.get("Angelo");
         ConcurrentHashMap.KeySetView<String, Integer> keySet = chm.keySet();
         ConcurrentHashMap.KeySetView<String, Integer> keySet1 = chm.keySet(2015);
         Enumeration<String> keys = chm.keys();
         Enumeration<Integer> elements = chm.elements();
         Collection<Integer> values = chm.values();
     }
     
     public void removeMethodsDemo() {
         Integer remove = chm.remove("Angelo");
         boolean remove1 = chm.remove("Angelo", 2015);
     }
}
