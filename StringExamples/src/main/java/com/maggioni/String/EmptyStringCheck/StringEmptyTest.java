package com.maggioni.String.EmptyStringCheck;

import org.apache.commons.lang.StringUtils;

/**
 *
 * http://java67.blogspot.de/2014/09/right-way-to-check-if-string-is-empty.html
 */
public class StringEmptyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String notEmpty = "This String is not empty";
        String nullString = null;
        String emptyString = "";
        String isBlank = " ";

        // Using isEmpty() method to check if String is empty in Java
        // need null check to avoid NullPointerException
        String[] inputs = {notEmpty, nullString, emptyString, isBlank};
        System.out.println("*** isEmpty() method Example (Readable)***");

        for (String s : inputs) {
            if (s != null) {
                System.out.println(String.format("Does String '%s' is empty? ", s) + s.isEmpty());
            }
        }
        
        // Using length() method to check if String is empty
        // for empty String length() == 0, require null check
        System.out.println("**** length() method Example (Fastest)****");
        
        for (String s : inputs) {
            if (s != null) {
                System.out.println(String.format("Does String '%s' is empty? ", s)+ (s.length() == 0));
            }
        }
        
        // Using equals method to check if String is empty or not
        // this approach is null-safe and doesn't require null check
        // unlike previous examples.
        System.out.println("**** equals() method Example (safe)***");
        
        for (String s : inputs) {
            System.out.println(String.format("Does String '%s' is empty? ", s) + ("".equals(s)));
            
        }
        
        // Using Apache commons
        System.out.println("**** using Apache commons *****");
        for (String s : inputs) {
            System.out.println(String.format("Does String '%s' is empty? ", s) + StringUtils.isEmpty(s));
        }
        for (String s : inputs) {
            System.out.println(String.format("Does String '%s' is blank? ", s) + StringUtils.isBlank(s));
        }
    }
        
        
    

}
