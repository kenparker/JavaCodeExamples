package com.maggioni.stringvalidator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * http://www.javacodegeeks.com/2014/10/when-a-string-is-null-but-not-null.html
 */
public class StringValidator {
    
    private List<String> dirtyWords;
    
    public static final int ARRAY_SIZE = 20;
    
    public StringValidator() {
        dirtyWords = new ArrayList<>(ARRAY_SIZE);
    }
    
    public boolean isValid(String test) {
        
        boolean isValid = false;
        isValid = (test != null && !test.isEmpty());
        if (isValid) {
            for (String dirtyWord : dirtyWords) {
                if (dirtyWord.equals(test)) {
                    isValid = false;
                    break;
                }
            }
            
        }
        return isValid;
    }
    
    public void addDirtyWord(String word) {
        if (!isValid(word)) {
            throw new IllegalArgumentException(word + " is not a good dirty word");
        }
        dirtyWords.add(word);
    }
}
