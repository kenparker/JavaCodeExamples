package com.maggioni.JavaClassDesign;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Book {
    void review(int id, List names) throws Exception{
        System.out.println("Base:Review");
    }
    
    void add(int num) {
        System.out.println("Base:add");
    }
    
    static void sta(int n) {
        System.out.println("I'm from Book");
    }
}

class CourseBook extends Book{
    void review(int id, ArrayList names) throws IOException{
        System.out.println("Derived:Review");
    }
    
    @Override
    void add(int num) {
        System.out.println("Derived:add");
    }
    
    static void sta(int n) {
        System.out.println("I'm from CourseBook");
    }
}
public class VerifyOverridingDemo1 {

    public static void main(String[] args) throws Exception {
        Book book = new CourseBook();
        book.review(1, null);               // Base:Review
        List list = new ArrayList();
        ArrayList arrayList = new ArrayList();
        book.review(1, list);           // Base:Review
        book.review(1, arrayList);      // Base:Review
        book.add(1);                        // Derived:add
        book.add(1);                    // Derived:add
        book.add(1);                    // Derived:add
        
        book.sta(1);                    // I'm from Book
        Book.sta(1);                    // I'm from Book
        CourseBook.sta(1);              // I'm from CourseBook
        
        CourseBook courseBook = new CourseBook();
        courseBook.review(1, arrayList);      // Derived:Review
        courseBook.sta(1);                    // I'm from CourseBook
        
        
    }

}
