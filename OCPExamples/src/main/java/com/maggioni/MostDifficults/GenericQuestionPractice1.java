package com.maggioni.MostDifficults;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import com.maggioni.Generics.TestClasses.Book;
import com.maggioni.Generics.TestClasses.Gift;

public class GenericQuestionPractice1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> backwards1 = backwards1(list);
        //ArrayList<String> backwards2 = backwards2(list); // do not compile
        Collection<String> backwards11 = backwards1(list);
        Object backwards12 = backwards1(list);
        
        Collection<String> backwards3 = backwards3(list);
        //List<String> backwards31 = backwards3(list); // do not compile
        
        
        List<Gift> listOfGifts = new ArrayList<>();
        List<Book> listOfBooks = new LinkedList<>();
        m6Demo(list, listOfBooks, listOfGifts);
        
        m8Demo(listOfBooks, listOfGifts);
            
        m9Demo(listOfBooks, listOfGifts);
    }




    public static <T> List<T> backwards1(List<T> input) {
        List<T> output = new ArrayList<>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }
    public static <T> List<T> backwards2(List<T> input) {
        ArrayList<T> output = new ArrayList<>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }
    public static <T> Collection<T> backwards3(List<T> input) {
        ArrayList<T> output = new ArrayList<>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }
    public static <T> Collection<T> backwards4(List<T> input) {
        List<T> output = new ArrayList<>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }
    public static <T> Collection<T> backwards5(List<T> input) {
        LinkedList<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }
    
    private static void m6Demo(List<String> list, List<Book> listOfBooks, List<Gift> listOfGifts) {
        List<String> backwards61 = backwards6(list);
        List<Book> backwards62 = backwards6(listOfBooks);
        List<Gift> backwards63 = backwards6(listOfGifts);
        List<Gift> backwards64 = backwards6(listOfBooks);
        //List<Gift> ll = new ArrayList<Book>();
    }
    public static <T> List<T> backwards6(List<? extends T> input) {
        LinkedList<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }
    public static <T> List<T> backwards7(List<? super T> input) {
        LinkedList<T> output = new LinkedList<>();
        /*for (T t : input) {  // do not compile. cannot convert <? super T> to T
            output.add(0, t);
        }*/
        return output;
    }
    
    private static void m8Demo(List<Book> listOfBooks, List<Gift> listOfGifts) {
        List<? extends Book> backwards81 = backwards8(listOfBooks);
        //List<Book> backwards811 = backwards8(listOfBooks); // do not compile
        List<? extends Gift> backwards82 = backwards8(listOfBooks); 
        List<? extends Book> backwards821 = null;
        backwards82 = backwards821;
        List<? extends Gift> backwards83 = backwards8(listOfGifts);
        List<? extends Gift> e1 = new ArrayList<Gift>();
        List<? extends Gift> e2 = new ArrayList<>();
        //List<? extends Gift> e21 = new ArrayList<? extends Book>();
        List<? extends Gift> e3 = new ArrayList<Book>();
    }
    public static <T> List<? extends T> backwards8(List<T> input) {
        LinkedList<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }
    
    private static void m9Demo(List<Book> listOfBooks, List<Gift> listOfGifts) {
        List<? super Book> backwards91 = backwards9(listOfBooks);
        List<? super Book> backwards92 = backwards9(listOfGifts);
        List<? super Gift> backwards93 = backwards9(listOfGifts);
        Collection<? super Gift> backwards94 = backwards9(listOfGifts);
        //List<? super Object> backwards95 = backwards9(listOfGifts);
        //List<? super Gift> backwards96 = backwards9(listOfBooks);
        List<? super Book> l1 = new ArrayList<Book>();
        List<? super Book> l3 = new ArrayList<Gift>();
        List<? super Book> l2 = new ArrayList<>();
        List<? super Gift> l4 = new ArrayList<>();
        //List<? super Gift> l5 = new ArrayList<Book>();
        List<? super Gift> l5 = new ArrayList<Gift>();
        List<? super Gift> l6 = new ArrayList<Object>();
    }
    
    public static <T> List<? super T> backwards9(List<T> input) {
        LinkedList<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0, t);
        }
        return output;
    }
}
