package com.maggioni.Threads.OCPBook;

/*
so ist richtig
*/
public class Twist10_3_2 {

    public static void main(String[] args) throws InterruptedException {
        Book1 book = new Book1();
        Thread t1 = new OnlineBuy(book); t1.start();
        Thread t2 = new OnlineBuy(book); t2.start();
        Thread t3 = new OnlineReturn(book); t3.start();
    }

}

class Book1 {
    int copiesSold = 0;
    synchronized public void newSales() {++copiesSold; System.out.println(" book : " +  copiesSold);}
        
    synchronized public void returnBook() {--copiesSold;System.out.println(" book : " +  copiesSold);}
}
class OnlineBuy extends Thread {
    private Book1 book;

    public OnlineBuy(Book1 book) {
        this.book = book;
    }
    synchronized public void run() {
        
        book.newSales();
    }
}
class OnlineReturn extends Thread {
    private Book1 book;

    public OnlineReturn(Book1 book) {
        this.book = book;
    }
    synchronized public void run() {
        book.returnBook();
    }
}
