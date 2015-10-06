package com.maggioni.HashMap.OCP;

public class Person4 {
    String name;

    public Person4(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + " hascode=" + hashCode() + '}';
    }

    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Person4) {
            return this.name.equals(((Person4)o).name);
        } else return false;
    } 
    
}
