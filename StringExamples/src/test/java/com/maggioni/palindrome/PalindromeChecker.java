package com.maggioni.palindrome;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeChecker {

    public static boolean checkPalindrome(String text) {
    
        StringBuilder sb = new StringBuilder();
        char[] contents = text.toCharArray();
        for (int i = contents.length-1; i >=0 ; i--) {
            sb.append(contents[i]);
        }
        String reversed = sb.toString();
        return text.equals(reversed);
    }
    
    @Test
    public void testPalindrone() {
        assertTrue(checkPalindrome("WoW"));
        assertTrue(checkPalindrome("MaM"));
    }
    
    
}
