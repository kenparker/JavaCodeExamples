package com.maggioni.Boxing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerAutoboxingDemo1 {

    public static void main(String[] args) {
        List li = new ArrayList();
        //li.add("1");
        li.add(1);
        li.add(new Integer("1"));
        li.add(new Integer(1));
        li.add(Integer.parseInt("812"));
        Collections.sort(li);
        System.out.println(li);
        
    }

}
