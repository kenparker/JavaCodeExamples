package com.maggioni.Whizlab.Pretest.UsingLoopConstructors;

public class LoopDemo4 {

    public static void main(String[] args) {
       int[]a = {1,2,3,4,5,6};
       int i = a.length - 1;
       
        while (true) {            
            while (i>=0) {                
                System.out.println(""+i);
                i--;
            }
        }
        //System.out.println("end"); // statement do not compile "unreachable" statement
        
    }

}
