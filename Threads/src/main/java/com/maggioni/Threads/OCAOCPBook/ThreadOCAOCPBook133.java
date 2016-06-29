package com.maggioni.Threads.OCAOCPBook;

public class ThreadOCAOCPBook133 {

    public static void main(String[] args) {
        
        String[] ar2 = {"hello","there"};
        printAll(ar2);
    }

    public static void printAll(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            System.out.println("" + line);
            try {
                Thread.currentThread().sleep(1000); // InterruptedException need to be catched
            } catch (InterruptedException ex) {
                System.out.println("interrupted exception");
            }
        }
    }
}
