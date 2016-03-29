package com.maggioni.MostDifficults;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroupCOuntDemo1 {

    public static void main(String[] args) {
        String regEx = "[+|-]?(\\d+(\\.\\d*)?)|(\\.\\d+)";
        String str = "a b c d e 1 2 3 4.5 +5 +6.7";
        Pattern pattern = Pattern.compile(regEx);
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.println("Group " + i + ": " + m.group(i)); // Group i substring
            }
        }
    }

    /*
        Group 0: 1
        Group 1: 1
        Group 2: null
        Group 3: null
        Group 0: 2
        Group 1: 2
        Group 2: null
        Group 3: null
        Group 0: 3
        Group 1: 3
        Group 2: null
        Group 3: null
        Group 0: 4.5
        Group 1: 4.5
        Group 2: .5
        Group 3: null
        Group 0: +5
        Group 1: 5
        Group 2: null
        Group 3: null
        Group 0: +6.7
        Group 1: 6.7
        Group 2: .7
        Group 3: null
    */
}
