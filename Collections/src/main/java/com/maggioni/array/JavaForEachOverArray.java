package com.maggioni.array;

/**
 *
 * http://java67.blogspot.sg/2013/08/how-to-iterate-over-array-in-java-15.html
 */
public class JavaForEachOverArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] languages = {"Java", "Scala", "C++", "Ruby", "Python", "Perl"};

        // looping over array using foreach loop
        System.out.println("Iterating over String array using Java 1.5 foreach loop");
        for (String str : languages) {
            System.out.println(str);
        }

        // looping over classical for loop
        System.out.println("Looping over String array using for loop");
        for (int i = 0; i < languages.length / 2; i++) {
            System.out.println(languages[i]);
        }
    }

}
