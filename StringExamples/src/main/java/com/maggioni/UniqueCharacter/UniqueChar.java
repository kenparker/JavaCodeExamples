package com.maggioni.UniqueCharacter;

import java.util.HashSet;

/**
 *
 * http://javahungry.blogspot.com/2014/11/string-has-all-unique-characters-java-example.html
 */
public class UniqueChar {

    public static void main(String[] args) {
        boolean result = false;
        String inputString = "Alveiwson";
        System.out.println(inputString);
        HashSet<Character> uniquecharset = new HashSet();
        for (int i = 0; i < inputString.length(); i++) {
            char temp = inputString.charAt(i);
            result = uniquecharset.add(temp);
            if (result == false) {
                System.err.println(temp);
                break;
            }
        }   
    }
}
