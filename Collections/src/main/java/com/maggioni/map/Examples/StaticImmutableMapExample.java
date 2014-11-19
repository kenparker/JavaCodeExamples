package com.maggioni.map.Examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StaticImmutableMapExample {

    private static final Map map;
    
    static {
        Map aMap = new HashMap();
        aMap.put(1, "one");
        aMap.put(2, "two");
        map = Collections.unmodifiableMap(aMap);
    }
    
    public static void main(String[] args) {

    }
    
}
