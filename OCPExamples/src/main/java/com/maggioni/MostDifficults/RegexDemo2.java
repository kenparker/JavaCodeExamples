package com.maggioni.MostDifficults;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

    public static void main(String[] args) {
        String str = "she sells sea shells";
        String rex = "\\Ss\\S";
        String replace = "X";
        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);
        System.out.println(m);
        System.out.println(""+m.groupCount()); // no match
        String val = m.replaceAll(replace);
        System.out.println(""+val);
        
        rex = "\\ss\\S";
        p = Pattern.compile(rex);
        m = p.matcher(str);
        while(m.find()) {
        System.out.println(m);
        }
        System.out.println(""+m.groupCount()); // no match
        val = m.replaceAll(replace);
        System.out.println(""+val);
        
    }

}
