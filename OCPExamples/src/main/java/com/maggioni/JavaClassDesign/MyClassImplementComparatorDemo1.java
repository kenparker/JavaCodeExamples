package com.maggioni.JavaClassDesign;

import java.util.Comparator;

public class MyClassImplementComparatorDemo1 implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        return o1.equals(o2) ? 1 : 0;
    }
    
}
