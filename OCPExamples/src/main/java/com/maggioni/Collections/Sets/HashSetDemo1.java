package com.maggioni.Collections.Sets;

import com.maggioni.HashMap.OCP.Person;
import java.util.HashSet;

public class HashSetDemo1 extends HashSet<Person>{

    public static void main(String[] args) {
       
        HashSetDemo1 hsd = new HashSetDemo1();
        hsd.add(new Person("Angelo"));
    }
    
    @Override
    public boolean add(Person o) {
        System.out.println("Adding:"+o);
        return super.add(o); 
    }

}
