package com.maggioni.Generics;

import com.maggioni.Generics.TestClasses.Gift;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo6 {

    void met1() {
        List<Fruit> listOfFruits1 = new ArrayList<>();
        listOfFruits1.add(null);
        listOfFruits1.add(new Fruit());
        listOfFruits1.add(new Apple());
        listOfFruits1.add(new Macintosch());
        
        List<Fruit> listOfFruits2 = new ArrayList();
        listOfFruits2.add(new Fruit());
        //listOfFruits2.add(new Fish()); do not compile
        listOfFruits1.addAll(listOfFruits2);
        
        List<Fruit> listOfFruits3 = new ArrayList<Fruit>();
        //ArrayList <Fruit> listOfFruits4 = new ArrayList<Apple>(); // do not compile
        methodList(listOfFruits3);  // works
        
        List<Fish> listOFishs = new ArrayList<>();
        methodList(listOFishs);     // works
        
        ArrayList<Fruit> arrayListOfFruits = new ArrayList<>();
        methodList(arrayListOfFruits);
    }
    
    static void methodList(List list) {
        
    }
    
    void met2() {
        List<Fruit> listOfFruits4 = new ArrayList<>();
        methodOfQue1(listOfFruits4);
        //listOfFruits4 = methodOfQue2(listOfFruits4);  // do not compile
        List<Gift>  listOfGifts   = new ArrayList<>();
        methodOfQue1(listOfGifts);
        
        List<?> listOfQu1 = new ArrayList();
        methodOfQue1(listOfQu1);
        listOfQu1 = methodOfQue2(listOfQu1);
        listOfQu1 = methodOfQue4(listOfQu1);
        listOfQu1.add(null);
        //listOfQu1.add(new Integer(22));   // do not compile
        //listOfQu1.addAll(listOfFruits4);  // do not compile
        
        listOfQu1 = listOfFruits4;
        listOfQu1 = listOfGifts;
        methodList(listOfQu1);
        
        List<?> listOfQu2 = new ArrayList<Fish>();
        
    }
    
    static void methodOfQue1(List<?> list) {
        list.add(null);
        System.out.println(" size " + list.size());
        //list.add(new Integer("11"));      // do not compile
        //list.add(new Fruit());      // do not compile
        List<Fruit> list1;
        //list.addAll(list1);
    }
    
    static List<?> methodOfQue2(List<?> list) {
        return new ArrayList<Object>();
    }
    static List<?> methodOfQue3(List<?> list) {
        return new ArrayList<>();
    }
    static List<?> methodOfQue4(List<?> list) {
        return new ArrayList<Fish>();
    }
    static List<?> methodOfQue5(List<?> list) {
        List<Fruit> fruits = null;
        return fruits;
    }
}
