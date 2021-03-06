package com.maggioni.PartI.Whizlab.Pretest.OperatorsAndDecisionConstructs;

/*
http://www.coderanch.com/t/481611/java/java/postfix-prefix-increment-precedence-conditional
http://www.coderanch.com/t/481607/java/java/postfix-prefix-precedence
http://www.coderanch.com/t/411365/java/java/Post-increment-Pre-Increment-Precedence#1811178
*/
public class PrefixPostfixDemo1 {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("i++>=5 : " +  (i++>=5));
        System.out.println("expected true");
        System.out.println("i : " +   i);
        
        System.out.println("------------------");
        int a,b,c,d;
        i = 6;
        System.out.println("i++>=i : " +  (i++>=i));
        System.out.println("expected true");
        System.out.println("i : " +   i);
        i = 6;
        System.out.println("i++>=7 : " +  (i++>=7));
        System.out.println("expected true");
        System.out.println("i : " +   i);
        
        System.out.println("------------------");
        i = 6;
        System.out.println("i<=i++ : " +  (i<=( a = i++)));
        System.out.println("expected true");
        System.out.println("i : " +   i + " a : " + a);
        i = 6;
        System.out.println("i<=++i : " +  (i<=( a = ++i)));
        System.out.println("expected true");
        System.out.println("i : " +   i + " a : " + a);
        i = 6;
        System.out.println("7<=i++ : " +  (7<=(a = i++)));
        System.out.println("expected true");
        System.out.println("i : " +   i+ " a : " + a);
    }

}
