package com.maggioni.CollectionsAndGenerics.ExamQuestions_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*
Searches the specified list for the specified object using the binary search algorithm. 
The list must be sorted into ascending order according to the natural ordering of its elements (as by the sort(List) method) prior to making this call. 
If it is not sorted, the results are undefined.

public static <T> Comparator<T> reverseOrder()
Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface. 
(The natural ordering is the ordering imposed by the objects' own compareTo method.) 
This enables a simple idiom for sorting (or maintaining) collections (or arrays) of objects that implement the Comparable interface in reverse-natural-order.

public static <T extends Comparable<? super T>> void sort(List<T> list)
Sorts the specified list into ascending order, according to the natural ordering of its elements. 
All elements in the list must implement the Comparable interface. 
Furthermore, all elements in the list must be mutually comparable (that is, e1.compareTo(e2) must not throw a ClassCastException for any elements e1 and e2 in the list).

*/

public class CollectionsMethodsDemo1 {

    public static void main(String[] args) {
       List<Quote> quotes = new ArrayList();
       final Quote quote1 = new Quote(new Date(), 1256);
       final Quote quote2 = new Quote(new Date(), 9876666);
       final Quote quote3 = new Quote(new Date(), 1111);
       final Quote quote4 = new Quote(new Date(), 2563);
       final QuoteExtend qe1 = new QuoteExtend(new Date(), 121212);
       quotes.add(quote1);
       quotes.add(quote2);
       quotes.add(quote3);
       quotes.add(qe1);
       
       System.out.println(" List unordered"+quotes);
        int binarySearch = Collections.binarySearch(quotes, quote2); // no need of a Comparator
        System.out.println(" Collections.binarySearch(quotes, quote3) "+binarySearch);
        
       Comparator comp = new Comparator<Quote>() {

           @Override
           public int compare(Quote o1, Quote o2) {
               return o1.price.compareTo(o2.price);
           }
       };
       quotes.sort(comp);
       System.out.println(" List ordered"+quotes);
        int indexOf = quotes.indexOf(quote2);
        System.out.println("index of :"+indexOf);
        boolean contains = quotes.contains(quote2);
        System.out.println("contains :"+contains);
        
        
       Collections.sort(quotes); // require a default compareTo
       System.out.println(" List ordered"+quotes);
       Collections.reverse(quotes);
       System.out.println(" List reverse"+quotes);
       Comparator<Object> reverseOrder1 = Collections.reverseOrder();
       Collections.sort(quotes, reverseOrder1);
       System.out.println(" List Comparator<Object>"+quotes);
       Comparator<Quote> reverseOrder2 = Collections.reverseOrder();
       Collections.sort(quotes, reverseOrder2);
       System.out.println(" List Comparator<Quote>"+quotes);
        binarySearch = Collections.binarySearch(quotes, quote3, reverseOrder2); // Achtung: hier ist der gleiche Comparator wie beim sort
        System.out.println(" Collections.binarySearch(quotes, quote3) "+binarySearch);
       
       Collections.sort(quotes); // require a default compareTo
       System.out.println(" List ordered"+quotes);
        binarySearch = Collections.binarySearch(quotes, quote3); // no need of a Comparator
        System.out.println(" Collections.binarySearch(quotes, quote3) "+binarySearch);
    }

}

class Quote implements Comparable<Quote>{

    Date date;
    Integer price;

    public Quote(Date date, Integer price) {
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quote{" + "date=" + date + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Quote o) {
        return o.price.compareTo(this.price);
    }
    
}

class QuoteExtend extends Quote  {

    public QuoteExtend(Date date, Integer price) {
        super(date, price);
    }
    
}

