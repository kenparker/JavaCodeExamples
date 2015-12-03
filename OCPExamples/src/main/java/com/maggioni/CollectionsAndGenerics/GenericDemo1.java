package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
Chapter 11
https://docs.oracle.com/javase/tutorial/extra/generics/methods.html
http://openbook.rheinwerk-verlag.de/javainsel/javainsel_09_005.html#dodtp3d148a00-5e2e-421f-8bae-99afc9bf304a
http://www.angelikalanger.com/GenericsFAQ/FAQSections/TypeArguments.html#FAQ203
*/
public class GenericDemo1 {

    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Fish());
        animals.add(new Siamesi());
        doFoo1(animals);
        doFoo2(animals);
        doFoo3(animals);
        doFoo4(animals);
        //doFoo5(li); do not compile Animal cannot be converted to Cat
        List<Siamesi> siamesis = new ArrayList<>();
        siamesis.add(new Siamesi());
        doFoo5(siamesis); // ok no problems
        List<Cat> cats = new ArrayList<>(Arrays.asList(new Cat(),new Cat()));
        doFoo5(cats); /// ok no problems
        doFoo6(cats); /// ok no problems
        doFoo7(cats); /// ok no problems
        doFoo7(animals); /// ok no problems
        
        // more list declarations
        List<?> fishList = new ArrayList<Fish>();
        //fishList.add(new Fish()); do not work
        Object getObject = fishList.get(0); // works return type is always an object
        
        List<? extends Animal> animals1 = new ArrayList<Animal>();
        //animals1.add(new Fish()); do not compile
        Animal get = animals1.get(0);
        
        List<? super Cat> siamesiList = new ArrayList<Cat>();
        siamesiList.add(new Siamesi());
        siamesiList.add(new Cat());
        Object get1 = siamesiList.get(0);
        Cat get2 = (Cat) siamesiList.get(0);
        
        List<Fish> fishs = new ArrayList<>();
        //doFoo4(fishs); do not compile
        doFoo7(fishs);
        doFoo4b(fishs);
        
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
    public static List doFoo4b(List<? extends Animal> a) {
        return new ArrayList();
    }
    public static List doFoo5(List<? extends Cat> a) {
        return new ArrayList();
    }
    public static List doFoo6(List<? super Cat> a) {       
        a.add(new Cat());       // works no problem
        a.add(new Siamesi());   // works no problem
        //a.add(new Animal()); // do not work as Animal ist in the hierarchy lower then Cat
        return a;
    }
    public static List doFoo7(List<?> a) {       
        //a.add(new Cat());       // do not work
        //a.add(new Siamesi());   // you cannot add anything
        //a.add(new Animal()); // do not work as Animal ist in the hierarchy lower then Cat
        return a;
    }
    
}

class Animal {}
class Fish extends Animal {}
class Cat extends Animal {}
class Siamesi extends Cat {}
