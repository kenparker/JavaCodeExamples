package com.maggioni.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericSuperDemo8 {

    public static void main(String[] args) {
        
        List<? super Siamesi> listOfSiamesi1 = new ArrayList<>();
        List<? super Siamesi> listOfSiamesi2 = new ArrayList();
        List<? super Siamesi> listOfSiamesi3 = new ArrayList<Animal>();
        //List<? super Siamesi> listOfSiamesi4 = new ArrayList<Fish>();
        List<? super Siamesi> listOfSiamesi5 = new ArrayList<Cat>();
        Object get = listOfSiamesi5.get(0);
        //listOfSiamesi5.add(new Object());
        listOfSiamesi5.add(new Siamesi());
        //listOfSiamesi5.add(new Cat());
        
        List<? super Cat> listOfSiamesi6 = new ArrayList<Cat>();
        listOfSiamesi6.add(new Cat());
        listOfSiamesi6.add(new Siamesi());
        //listOfSiamesi6.add(new Animal());
        List<? super Cat> listOfSiamesi7 = new ArrayList<Animal>();
        listOfSiamesi7.add(new Cat());
        listOfSiamesi7.add(new Siamesi());
        //listOfSiamesi7.add(new Fish());
        Object get1 = listOfSiamesi7.get(0);
        
        List<? super Cat> listOfCats1 = new ArrayList<Cat>();
        List<? super Siamesi> listOfSiamesi8 = listOfCats1;
        
        List<? extends Cat> listOfCats2 = new ArrayList<Cat>();
        List<? extends Cat> listOfCats3 = new ArrayList<Siamesi>();
        //List<? extends Cat> listOfCats4 = listOfSiamesi8;
        //List<? extends Cat> listOfCats5 = listOfCats1;
    }

}
