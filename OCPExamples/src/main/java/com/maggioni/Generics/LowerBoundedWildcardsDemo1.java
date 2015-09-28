package com.maggioni.Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardsDemo1 {

    public static void main(String[] args) {
        
        List<? super Gift> list = new ArrayList<>();
        list.add(new Gift());
        list.add(new Book());
        list.add(new Phone());
        // list.add(new Object()); do not compile
        
        for (Object object : list) { // Elements are read as objects         
        }

    }

}
