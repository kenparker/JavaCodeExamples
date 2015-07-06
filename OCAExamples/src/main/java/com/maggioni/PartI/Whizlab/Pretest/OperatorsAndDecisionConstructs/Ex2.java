package com.maggioni.PartI.Whizlab.Pretest.OperatorsAndDecisionConstructs;

public class Ex2 {

    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        System.out.println("(j++ == 6 || i++ >=12) :"+(j++ == 6 || i++ >=12));
        i = 10;
        j = 5;
        System.out.println("j++>=6 || (j++ == 6 || i++ >=12) :"+(j++>=6 || (j++ == 6 || i++ >=12)));      
        System.out.println(i);  // 10
        System.out.println(j);  // 7 
        
        i = 10;
        j = 5;
        System.out.println("(j++>=6 | (j++ == 6 | i++ >=12)) :"+(j++>=6 | (j++ == 6 | i++ >=12)));
        System.out.println(i);  // 11
        System.out.println(j);  // 7
        
        
        
        
        j = 5;
        System.out.println("j++ == 6 :" + (j++ == 6)); // false       
        System.out.println(j);
        
        i = 10;
        j = 5;
        System.out.println((j++ == 6 || i++ >=12));
        System.out.println(j);
        System.out.println(i);
        
        if((i++ >=12)){ // false
            System.out.println(i);
        }
    }

}
