package com.maggioni.StringProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo1 {

    public static void main(String[] args) {
        String s = "Hello, this is a string wiith a looot offf words";
        
        Pattern p = Pattern.compile("\\D*|\\d*");
        Matcher m = p.matcher(s);
        
        boolean matches = m.matches();
        System.out.println(matches);
    }

}
