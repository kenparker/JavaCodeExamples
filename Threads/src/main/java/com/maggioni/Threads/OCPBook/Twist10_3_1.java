package com.maggioni.Threads.OCPBook;

/*
Explanation: Because the methods newSale() and returnBook() aren’t defined as synchronized methods, 
multiple threads can access these methods concurrently, 
posing a risk of thread interference that fails to protect the data of object book, 
defined on line 3. Defining the run() methods as synchronized doesn’t help to protect the data of object book. 
It restricts execution of run to a single thread; it doesn’t restrict modification of an instance of Book to a single thread. 
To protect your shared data, you should add the synchronized keyword to the methods that directly manipulate your shared data.
*/
public class Twist10_3_1 {

    public static void main(String[] args) throws InterruptedException {
        Book2 book = new Book2();
        Thread t1 = new OnlineBuy2(book); t1.start();
        Thread t2 = new OnlineBuy2(book); t2.start();
        Thread t3 = new OnlineReturn2(book); t3.start();
    }

}

class Book2 {
    int copiesSold = 0;
    public void newSales() {++copiesSold; System.out.println(" book : " +  copiesSold);}
        
    public void returnBook() {--copiesSold;System.out.println(" book : " +  copiesSold);}
}
class OnlineBuy2 extends Thread {
    private Book2 book;

    public OnlineBuy2(Book2 book) {
        this.book = book;
    }
    synchronized public void run() {
        
        book.newSales();
    }
}
class OnlineReturn2 extends Thread {
    private Book2 book;

    public OnlineReturn2(Book2 book) {
        this.book = book;
    }
    synchronized public void run() {
        book.returnBook();
    }
}
