package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericDemo1 {

    public static void main(String[] args) {
        
        List<Animal> li = new ArrayList<>();
        li.add(new Animal());
        li.add(new Fish());
        li.add(new Siamesi());
        doFoo1(li);
        doFoo2(li);
        doFoo3(li);
        doFoo4(li);
        //doFoo5(li); do not compile Animal cannot be converted to Cat
        List<Siamesi> siamesis = new ArrayList<>();
        siamesis.add(new Siamesi());
        //doFoo5(siamesis); do not compile Siamesi cannot be converted to Cat
    }

    public static List doFoo1(List li) {
        return li;
    }
    public static List doFoo2(Collection li) {
        //return li; do not compile collection cannot b converted to List
        ArrayList ar = new ArrayList(li);
        return ar;
    }
    public static <E> List<E> doFoo3(Collection<E> c) {            
        return new ArrayList<>();
    }
    public static List doFoo4(List<Animal> a) {
        return new ArrayList();
    }
    public static List doFoo5(List<Cat> a) {
        return new ArrayList();
    }
    
}

class Animal {}
class Fish extends Animal {}
class Cat extends Animal {}
class Siamesi extends Cat {}
