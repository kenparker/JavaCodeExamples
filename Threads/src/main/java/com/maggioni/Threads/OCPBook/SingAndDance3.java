package com.maggioni.Threads.OCPBook;

public class SingAndDance3 {

    public static void main(String[] args) {
        Thread sing = new Sing();
        Thread newThread = new Thread(sing);
        newThread.start();
    }

}
class Sing extends Thread{

    @Override
    public void run() {
        System.out.println("Singing");
    }
    
}
