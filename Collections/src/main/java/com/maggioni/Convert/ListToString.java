package com.maggioni.Convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListToString {

    public static void main(String[] args) {
    
        List<String> list = new ArrayList<>();
        
        list.add("Angelo");
        list.add("Mario");
        list.add("Fabio");
        
        Object[] toArray = list.toArray();
        String[] stringArray = (String[]) list.toArray(new String[0]);
        Arrays.stream(stringArray).forEach((String) -> System.out.println(String));
        
       
    }
    
}
