package com.maggioni.stringExamples;

// http://www.coderanch.com/t/411681/java/java/print-reference-String-Object
public class StringPrintReferenceDemo1 {

    public static void main(String[] args) {
        MyClass ob = new MyClass();
        System.out.println(ob);
        String sob = new String("Hello");
        ob.toStr(sob);
        String sob2 = "Hello";
        ob.toStr(sob2);     // same as sob3
        String sob3 = "Hello";
        ob.toStr(sob3);     // same as sob2
    }
    
}

class MyClass {
    public void toStr(String s) {
        System.out.println("hey");
        System.out.println(Integer.toHexString(System.identityHashCode(s)));
    }
}