package com.maggioni.Whizlab.Pretest.OperatorsAndDecisionConstructs;

public class PrefixPostfixAnotherDemo1 {

    static Integer i = 20;
    static Integer j = new Integer(20);
    public static void main(String[] args) {
        changeInteger(j++);
        changeInteger(i);
        System.out.println("i : " + i.hashCode() + " j :" +  j);
        changeInteger(j);
        System.out.println("i : " + i + " j :" + j);
    }
    
    static void changeInteger(Integer j) {
        j = 30;
        System.out.println(" j :" +  j.hashCode());
    }

}
