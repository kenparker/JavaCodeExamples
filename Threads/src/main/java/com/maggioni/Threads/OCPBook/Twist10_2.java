package com.maggioni.Threads.OCPBook;

public class Twist10_2 {

    public static void main(String[] args) {
        Thread sing = new Sing1();
        sing.start();
        throw new RuntimeException("main");
    }

}

class Sing1 extends Thread {
    public void run() {
        System.out.println("Singing ..");
        throw new RuntimeException("run");
    }
}
