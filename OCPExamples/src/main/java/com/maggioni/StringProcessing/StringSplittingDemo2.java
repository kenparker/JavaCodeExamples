package com.maggioni.StringProcessing;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplittingDemo2 {

    public static void main(String[] args) {

        /*
        in the following example the delimiters "hi" are the same but Scanner, StringTokenizer ans Split
        act differently
        
        Scanner and Split are the same
        */
        String s = "Hello, this is a string wiith a looot offf words";

        System.out.println("Scanner example:");
        Scanner sc = new Scanner(s);
        sc.useDelimiter("[hi]");
        while (sc.hasNext()) {
            String next = sc.next();
            System.out.println("\"" + next + "\"");
        }
        /*
        Note: Scanner return also an empty String when the delimiters are nearby
        */
        /*
        "Hello, t"
        ""
        "s "
        "s a str"
        "ng w"
        ""
        "t"
        " a looot offf words"
        */

        System.out.println("\nStringTokenizer example:");
        StringTokenizer st = new StringTokenizer(s, "[hi]");
        while (st.hasMoreElements()) {
            Object nextElement = st.nextElement();
            System.out.println("\"" + nextElement + "\"");
        }
        /*
        StringTokenizer is NOT returning an empty String when the delimiters are nearby
        */
        /*
        "Hello, t"
        "s "
        "s a str"
        "ng w"
        "t"
        " a looot offf words"
        */

        System.out.println("\nSplit example:");

        String[] split = s.split("[hi]");
        for (String split1 : split) {
            System.out.println("\"" + split1 + "\"");

        }
        /*
        "Hello, t"
        ""
        "s "
        "s a str"
        "ng w"
        ""
        "t"
        " a looot offf words"
        */
        
        System.out.println("\nPattern example:\n"+s);
        Pattern p = Pattern.compile("[hi]");
        Matcher m = p.matcher(s);
        while (m.find()) {            
            System.out.printf("Matcher %s beginning: %d end: %d \n",m.group(),m.start(),m.end());
        }
    }

}
