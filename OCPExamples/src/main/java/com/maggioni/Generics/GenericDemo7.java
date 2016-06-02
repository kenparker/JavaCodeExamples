package com.maggioni.Generics;

import com.maggioni.Generics.TestClasses.Book;
import com.maggioni.Generics.TestClasses.Gift;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo7 {

    public static void main(String[] args) {
        
        List<Fish> listOfFishs1 = new ArrayList<>();
        // meth1(listOfFishs1); // do not compile
        
        //List<Fish> listOfFischs2 = new ArrayList<Animal>(); // do not compile
        
        List<Animal> listOfAnimals1 = new ArrayList<>();
        //meth2(listOfAnimals1); // do not compile
        meth1(listOfAnimals1);
        List<Animal> listOfAnimals2 = new ArrayList();
        //List<Animal> listOfAnimals3 = new ArrayList<Fish>();  // do not compile
        
        List<? extends Animal> listOfAnimals4 = new ArrayList<Animal>();
        //meth2(listOfAnimals4); // do not compile
        List<? extends Animal> listOfAnimals5 = new ArrayList<Fish>();
        List<? extends Animal> listOfAnimals6 = new ArrayList<Cat>();
        List<? extends Animal> listOfAnimals7 = new ArrayList<Siamesi>();
        //listOfAnimals7.add(new Animal());
        listOfAnimals7.add(null);
        Animal a = null;
        //listOfAnimals7.add(a);
        //listOfAnimals7.add(new Cat());
        
        List<? extends Cat> listOfCats1 = new ArrayList<Cat>();
        List<? extends Cat> listOfCats2 = new ArrayList<Siamesi>();
        Cat get = listOfCats2.get(0);
        //List<? extends Cat> listOfCats3 = new ArrayList<? extends Siamesi>();
        
        List<? extends Animal> listOfAnimals8;
        listOfAnimals8 = listOfCats2;
        List<? extends Siamesi> listOfSiamesis1 = new ArrayList<Siamesi>();
        listOfAnimals8 = listOfSiamesis1;
        //listOfSiamesis1 = listOfAnimals8;
        //listOfSiamesis1 = listOfCats2;
        List<? extends Cat> listOfCats3 = new ArrayList<Cat>();
        listOfCats3 = listOfSiamesis1;
        
        
        List<? extends Book> lBooks = new ArrayList<Book>();
        List<Gift> lGifts = new ArrayList<>();
        //lGifts = lBooks;
                
        
    }

    static void meth1(List<Animal> list) {
        
    }
    static void meth2(ArrayList<Animal> list) {
        
    }
}
