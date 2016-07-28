package com.maggioni.StringProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo2 {

    public static void main(String[] args) {
        String s = "John writes about this, and John writes about that," +
                          " and John writes about everything. ";
        String regex = "(John)|(writes)";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        
        while (m.find()) {            
            System.out.printf("Group 1 : %8s Group2 : %8s Start : %3d End : %3d \n",m.group(1),m.group(2),m.start(),m.end());
        }
        
    }

}
