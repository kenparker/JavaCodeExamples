package com.maggioni.HashMap.OCP;

public class Person2 {
    String name;

    public Person2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + " hascode=" + hashCode() + '}';
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    } 
    
}
