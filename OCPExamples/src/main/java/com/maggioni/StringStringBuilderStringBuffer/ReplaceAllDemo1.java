package com.maggioni.StringStringBuilderStringBuffer;

public class ReplaceAllDemo1 {

    public static void main(String[] args) {
       String s = "cat cup copp";
       String newS = s.replaceAll("c.p\\b", "()");
        System.out.println(""+newS);
        newS = s.replaceFirst("c.p\\b", "()");
        System.out.println(""+newS);
        newS = s.replaceAll("c.p", "()");
        System.out.println(""+newS);
        newS = s.replace(new StringBuilder("cat"), "()");
        System.out.println(""+newS);
       s = "cat cupp ycopp";
         s = s.replace('c', 'X');
         System.out.println(s);
         
         
         s = "Start startup, time to start";
         System.out.println(s.substring(0, 1).compareTo(s.substring(6, 7))); // output -32
         System.out.println("S".compareTo("s")); // output -32
         System.out.println("s".compareTo("s")); // output 0
         System.out.println("s".compareTo("S")); // output 32
    }

}
