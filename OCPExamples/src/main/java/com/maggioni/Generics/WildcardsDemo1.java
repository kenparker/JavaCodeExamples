package com.maggioni.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardsDemo1 {

    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        List<Fruit> fruits1 = new ArrayList<>();
        List<Macintosch> mac = new ArrayList<>();
        List<? extends Fruit> fruits2 = apples;
        List<? extends Fruit> fruits21 = mac;
        List<? extends Fruit> fruits22 = fruits1;
        //fruits2.add(new Macintosch()); // do not compile
        //fruits1 = apples; // do not compile
        
        List<? extends Fruit> f1 = new ArrayList<Apple>();
        List<? extends Fruit> f2 = new ArrayList<Macintosch>();
        List<? extends Fruit> f3 = new ArrayList<Fruit>();
        //List<Fruit> f1 = new ArrayList<Apple>();
        //List<Apple> a1 = new ArrayList<Fruit>();

        List<? super Apple> fruits3 = fruits1;
        fruits3.add(new Macintosch());
        fruits3.add(new Apple());
        
        
        Object get = fruits3.get(0);
        List<? super Apple> fruits4 = apples;
        //List<? super Apple> fruits5 = mac; // do not compile
        List<? super Apple> fruits5 = new ArrayList<Apple>();
        List<? super Apple> fruits6 = new ArrayList<Fruit>();
        List<? super Apple> fruits7 = new ArrayList<Object>();
        
        List<? super Fruit> wild1 = new ArrayList<Fruit>();
        List<? super Fruit> wild2 = new ArrayList<Object>();
        //List<? super Fruit> wild3 = new ArrayList<Apple>();
        
        List<? extends Apple> wild5 = new ArrayList<Apple>();
        List<? extends Apple> wild6 = new ArrayList<Macintosch>();
        //List<? extends Apple> wild7 = new ArrayList<Object>();
       
    }

}
