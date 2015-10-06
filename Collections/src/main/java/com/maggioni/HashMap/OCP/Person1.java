package com.maggioni.HashMap.OCP;

public class Person1 {
    String name;

    public Person1(String name) {
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

 
    
    
}
