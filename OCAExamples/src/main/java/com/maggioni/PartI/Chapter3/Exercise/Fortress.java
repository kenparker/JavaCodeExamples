
package com.maggioni.PartI.Chapter3.Exercise;

import java.util.ArrayList;

class Encaps {
    private String name;
    private ArrayList<Integer> list;

    public Encaps(String name, ArrayList<Integer> list) {
        this.name = name;
        this.list = list;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public String getName() {
        return name;
    }
    
    void addToList(int x) {
        list.add(x);
    }
}
public class Fortress {

    public static void main(String[] args) {
        Encaps e = new Encaps("Angelo", new ArrayList<Integer>());
        e.addToList(20);
        e.addToList(25);
        System.out.println(e.getName());
        String replace = e.getName().replace("a", "b");
        System.out.println(e.getName());
        System.out.println(e.getList());
        ArrayList<Integer> list = e.getList();
        list.add(0,33);
        System.out.println(e.getList());
        
    }
    
}
