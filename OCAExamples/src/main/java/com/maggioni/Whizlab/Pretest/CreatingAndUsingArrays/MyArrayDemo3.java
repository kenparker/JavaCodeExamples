package com.maggioni.Whizlab.Pretest.CreatingAndUsingArrays;

public class MyArrayDemo3 {

    //http://www.javaworld.com/article/2077367/learn-java/array-of-arrays.html
    public static void main(String[] args) {
        
        int array[][] = new int[2][];
        
        //array[0][0] = 0;    // throwing NullPointerException at runtime as [0][0] is not initialized
        array[0] = new int[]{12,3,45};
        array[0] = new int[3];
        array[0][0] = 0;    // works
        
        String[] sa;
        // sa is a null reference
        // the next statement will not compile
        //System.out.println(" sa.length :" +  sa.length);
        sa = new String[2];
        // sa is no longer a null reference, the object is an array with two null string references
        sa[0] = "Hello";
        sa[1] = "how are you?";
        // the next statement will trow a ArrayIndexOutOgBoundException at runtime
        //sa[2] = "whre are you coming from?";
    }
    
}
