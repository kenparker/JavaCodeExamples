package com.maggioni.Generics;

import com.maggioni.Generics.TestClasses.Phone;
import com.maggioni.Generics.TestClasses.Gift;
import com.maggioni.Generics.TestClasses.Book;
import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcardsDemo1 {

    public static void main(String[] args) {
        
        List<Gift> listOfGifts = new ArrayList<>();
        listOfGifts.add(new Gift());
        listOfGifts.add(new Gift());
        listOfGifts.add(new Gift());
        listOfGifts.add(new Phone());
       
        List<Phone> listOfPhones = new ArrayList<>();
        listOfPhones.add(new Phone());
        listOfPhones.add(new Phone());
        
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book());
        listOfBooks.add(new Book());
        listOfBooks.add(new Book());
        
        List<? extends Gift> list;      
        list = listOfGifts;
        System.out.println("->readList with listOfGift");
        readList1(list);         // ok
        System.out.println("->readList2 with listOfGift");
        readList2(listOfGifts); // ok
        
        
        List<? extends Book> listEBooks = new ArrayList<Book>();      
        list = listOfBooks;
        // List<? extends Gift> = List<? extends Book>
        list = listEBooks;
        System.out.println("->readList with listOfBooks");
        readList1(list);         // ok
        //readList2(listOfBooks); // won't compile
        
        list = listOfPhones;    
        System.out.println("->readList with listOfPhones");
        readList1(list);         // ok
    }                  

    private static void readList1(List<? extends Gift> list) {
        System.out.println("-->for with Gift");
        for (Gift list1 : list) {System.out.println(list1.toString());} 
        System.out.println("-->for with Object");
        for (Object list1 : list) {System.out.println(list1.toString());}
    }
    private static void readList2(List<Gift> list) { // only Gift type of Lists
        for (Gift list1 : list) {
            System.out.println(list1.toString());
        }
    }

}
