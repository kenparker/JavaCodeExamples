package com.maggioni.Threads.OCPBook;

/*
 so ist es auch ok
 */
public class Twist10_3_3 {

    public static void main(String[] args) throws InterruptedException {
        Book3 book = new Book3();
        Thread t1 = new OnlineBuy3(book);
        t1.start();
        Thread t2 = new OnlineBuy3(book);
        t2.start();
        Thread t3 = new OnlineReturn3(book);
        t3.start();
    }

}

class Book3 {

    int copiesSold = 0;

    public void newSales() {
        ++copiesSold;
        System.out.println(" book : " + copiesSold);
    }

    public void returnBook() {
        --copiesSold;
        System.out.println(" book : " + copiesSold);
    }
}

class OnlineBuy3 extends Thread {

    private Book3 book;

    public OnlineBuy3(Book3 book) {
        this.book = book;
    }

    synchronized public void run() {
        synchronized (book) {
            book.newSales();
        }
    }
}

class OnlineReturn3 extends Thread {

    private Book3 book;

    public OnlineReturn3(Book3 book) {
        this.book = book;
    }

    synchronized public void run() {
        synchronized (book) {
            book.returnBook();
        }
    }
}
