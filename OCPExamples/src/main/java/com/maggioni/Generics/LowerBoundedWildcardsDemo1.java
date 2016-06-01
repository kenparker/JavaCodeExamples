package com.maggioni.Generics;

import com.maggioni.Generics.TestClasses.Phone;
import com.maggioni.Generics.TestClasses.Gift;
import com.maggioni.Generics.TestClasses.Book;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardsDemo1 {

    public static void main(String[] args) {
        
        List<? super Gift> list = new ArrayList<>();
        list.add(new Gift());
        list.add(new Book());
        list.add(new Phone());
        // list.add(new Object()); do not compile
        
        List<? super Book> list1SBooks = new ArrayList<Book>();
        list1SBooks.add(new Book());
        //list1SBooks.add(new Gift());
        //list1SBooks.add(new Phone());
        for (Object list1SBook : list1SBooks) {
            
        }
        
        List<? super Book> list2SBooks = new ArrayList<>();
        list2SBooks.add(new Book());
        //list2SBooks.add(new Gift());
        //list2SBooks.add(new Phone());
        
        
        for (Object object : list) { // Elements are read as objects         
        }
        
        List<Gift> list1 = new ArrayList<>();
        list1.add(new Gift());
        list1.add(new Book());
        list1.add(new Phone());
        for (Gift list11 : list1) {
            
        }
        
        List<Book> list2 = new ArrayList<>();
        list2.add(new Book());
        //list2.add(new Gift());

        list = list1;
        List<Object> listO = new ArrayList<>();
        list = listO;
        //list = list2; do not compile
        // List<? super Book> list1SBooks 
        list1SBooks = list2; // List<Book> 
        list1SBooks = list; // List<? super Gift>
        list1SBooks = list1; // List<Gift>
    }

}
