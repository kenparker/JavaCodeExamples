package com.maggioni.PartI.Chapter4;

class MyExc1 extends Exception {}
class Tire {
    void doStuff() {}
    void doStuff1() {}
    void doStuff2() throws Exception{}
    void doStuff3() {}
}
public class Retread extends Tire{

     public static void main(String[] args) {
        new Retread().doStuff();
    }
    
     void doStuff() {                           // Fine as overriding doStuff() from Tire
         System.out.println(7/0);
     }
     
     void doStuff1() throws RuntimeException{   // fine as overriding Method throws unchecked exception
         System.out.println(7/0);
     }
     void doStuff2() throws Exception{          // fine as overriding method throws same checked exception
         System.out.println(7/0);
     }
     void doStuff3() throws MyExc1{             // compile error as overriding method throws checked exception not in overridden method
         System.out.println(7/0);
     }
}
