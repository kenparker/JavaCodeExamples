package com.maggioni.CollectionsAndGenerics.MostDifficults;

/*
Note that + operator is overloaded only for String and not for StringBuilder. 
Therefore, + operator must either have both the operands as numeric or at least one operand as String. 
In this case 8 + i is valid because both are numeric but i + sb is not. 
If you had something like this:  System.out.println(8 + i + sb.toString()); , it would print 168.
*/
public class StringProcessionToughDemo2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("8");
        int i = 8;
        System.out.println(8 + i);                  // 16
        System.out.println(8 + i + sb.toString());  // 168
    }

}
