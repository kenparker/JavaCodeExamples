package com.maggioni.array;

import java.util.Arrays;

/**
 *
 * http://java67.blogspot.de/2014/09/how-to-convert-array-to-string-in-java-example.html
 */
public class ArrayToString
{

    
    public static void main(String[] args)
    {
        // Convert int Array to String in Java
        int[] numbers = {1,2,3,4,5,10};
        
        System.out.println(numbers.toString());
        
        String str = Arrays.toString(numbers);
        System.out.println("int array as String : "+str);
        
        // COnverting Char Array to String in Java
        char[] vowels = {'a','e','o'};
        System.out.println("char.tostring()"+vowels.toString());
        
        String charArrayAsString = Arrays.toString(vowels);
        System.out.println("char array as String : "+charArrayAsString);
        
        // convert by array to String in Java
        byte[] bytes = {(byte) 0x12, (byte) 0x14, (byte) 0x25 };
        System.out.println("byte.tostring()"+bytes);
        
        String byteArrayToString = Arrays.toString(bytes);
        System.out.println("byte array as String : " + byteArrayToString);
        
        // convert float array to string
        float[] floats = {0.01f, 0.15f};
        System.out.println("float.tostring()"+floats);
        
        String floatsArrayToString = Arrays.toString(floats);
        System.out.println("float array to string : " + floatsArrayToString);
        
        // Converting double array to String in Java
        double[] values = {0.5, 1.0, 1.5, 2.0, 2.5};
        System.out.println(values.toString());

        String doubleString = Arrays.toString(values);
        System.out.println("double array as String in Java : " + doubleString);

        // Converting object array to String in Java
        Object[] objects = {"abc", "cdf", "deg", "england", "india"};
        System.out.println(objects.toString());

        String objectAsString = Arrays.toString(objects);
        System.out.println("object array as String in Java : " + objectAsString);
        
        // Convert two dimensional array to String in Java
        int[][] twoD = {
            {100, 200, 300, 400, 500},
            {300, 600, 900, 700, 800},};

        System.out.println(twoD.toString());

        String twoDimensions = Arrays.deepToString(twoD);
        System.out.println("Two dimensional array as String in Java : " + twoDimensions);

        // Convert three dimensional array to String in Java
        int[][][] threeD = {
            {
                {11, 22, 33, 44, 55},
                {32, 42, 52, 62, 72},},
            {
                {1111, 2222, 3333, 4444, 5555},
                {1001, 2001, 3001, 4001, 5001},}
        };
        System.out.println(threeD.toString());

        String threeDString = Arrays.deepToString(threeD);
        System.out.println("3 dimensional array as String in Java : " + threeDString);
    }
    
}
