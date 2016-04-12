package com.maggioni.PartII.WorkingWithRegex;
/*
 http://www.javaworld.com/article/2073192/core-java/core-java-regular-expressions-simplify-pattern-matching-code.html
 http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_04_007.htm


 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo1 {

    public static void main(String[] args) {
        if (false) {
            regex("ab", "abaaba");
            regex("\\d", "a125b  der12");
            regex("[0-9]", "a125b  der12"); // same as \d
            regex("\\d\\d", "a125b  der12");
            regex("\\d\\d+", "a125b  der12");
            regex("\\d\\d+", "a125b1  der12");
            regex("\\w", "a125b1  der12");
            regex("\\W", "a 1§56 _Z");
            regex("\\b", "abcd ab a cder");
            regex("\\b", "abcd#ab a cder");
            regex("\\b", "#abcd#ab a cder");
            regex("0[xX][a-fA-F0-9]", "0xaba0xder11 ");
            regex("0[xX]([a-fA-F0-9])+", "0xaba0xder11 ");
            regex("(0[xX])?([a-fA-F0-9])+", "0xaba0xder11 ");
            regex("(0[xX]){1}([a-fA-F0-9])+", "0xaba0xder11 ");
            regex("proj1([^,])*", "proj3.txt,proj1scheid.pdf,proj1,proj2,proj1.java");
            regex("proj1[^,]*", "proj3.txt,proj1scheid.pdf,proj1,proj2,proj1.java");
        regex("\\b", "a 1§56 _Z");
        regex("\\B", "a 1§56 _Z");
        regex("\\w", "a 1§56 _Z");
        regex("\\d\\w", "ab4 56_7ab");
        regex("a?", "aba");
        regex("a?", "baba");
        regex("\\w", "^23 *$76 bc");
        regex("\\b", "^23 *$76 bc");
        regex("\\B", "^23 *$76 bc");
        regex("\\b", "#ab de#");
        regex("\\B", "#ab de#");
        regex("\\bcat\\b", "black cat");
        regex("\\bcat\\b", "catatonic");
        regex("\\bcat\\b", "_catatonic");
        regex("\\bcat", "catatonic");
        regex("\\bcat", "_catatonic");
        regex("\\bcat", "tomcat");
        regex("cat\\b", "tomcat");
        regex("\\bcat.\\b", "certificate");
        regex("cat.\\b", "certificate");
        regex("\\Bthe\\B", "the leather in their coat made her seethe");
        regex("\\Bthe", "the leather in their coat made her seethe");
        regex("\\bthe\\B", "the leather in their coat made her seethe");
        regex("\\Bthe\\b", "the leather in their coat made her seethe");
        regex("\\bthe|the\\b", "the leather in their coat made her seethe");
        }
        regex("(th)?", "ththe leather in their coat made her seethe");
        regex("[th]*", "ththe leather in their coat made her seethe");
        regex("(th)*", "ththe leather in their coat made her seethe");
        regex("(o)?", "food");
        regex("(o)*", "food");
        regex("\\Ss\\S", "she sells sea shells");
        regex("\\ss\\S", "she sells sea shells");

    }

    public static void regex(String... s) {
        if (s.length != 2) {
            System.out.println("Java Regex Demo error");
            return;
        }
        Pattern p;
        try {
            p = Pattern.compile(s[0]);
        } catch (PatternSyntaxException e) {
            System.out.println(" Regex syntax error : " + e.getMessage());
            System.out.println(" Error Description : " + e.getDescription());
            System.out.println(" Error index : " + e.getIndex());
            System.out.println(" Erroneous pattern : " + e.getPattern());
            return;
        }

        Matcher m = p.matcher(s[1]);

        System.out.println("\n\n regex = " + s[0]);
        System.out.println(" text =  " + s[1]);
        System.out.println(" index = 0123456789012345678901234567890\n");
        while (m.find()) {
            System.out.print("\n found : " + m.group());
            System.out.print("\t starting at index : " + m.start() + " and ending at index : " + m.end());
        }
        System.out.println("");
    }

}
