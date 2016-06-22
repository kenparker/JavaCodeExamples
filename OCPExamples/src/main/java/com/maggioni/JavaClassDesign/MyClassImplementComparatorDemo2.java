package com.maggioni.JavaClassDesign;

import com.maggioni.Generics.TestClasses.Book;
import java.util.Comparator;

public class MyClassImplementComparatorDemo2 implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return 1;
    }
    
}
