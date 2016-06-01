package com.maggioni.Generics;

public class GenericDemo2 {

    public static void main(String[] args) {
      
        Animal a = new Animal();
        // foo1(a); do not compile "upperbound" error
        String b = "22";
        String foo1 = foo1(b);
        Object foo2 = foo1(b);
        CharSequence foo3 = foo1(b);
        foo4(b);
        
        SubtypeOfS sub = new SubtypeOfS();
        foo1(sub);
        foo2(sub);
        foo3(sub);
        SubtypeOfS foo4 = foo4(sub);
                
                
    }

    public static <S extends CharSequence> S foo1(S s) {
        return null;
    }
    
    public static <S extends CharSequence> S foo2(S s) {      
        return s;
    }
    
    
    public static <S extends CharSequence> S foo3(S s) {
        String toString = s.toString();
        //return toString; // do not work
        return null;
    }
    public static <S extends CharSequence> S foo4(S s) {
        //CharSequence c = s.subSequence(0, 1);
        //SubtypeOfS c = new SubtypeOfS();
        S d = null;
        return d;
    }
    
    
}

class SubtypeOfS implements CharSequence {

    @Override
    public int length() {
        return 1;
    }

    @Override
    public char charAt(int index) {
        return 2;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String s= "abc";
        return subSequence(start, end);
    }
    
}
