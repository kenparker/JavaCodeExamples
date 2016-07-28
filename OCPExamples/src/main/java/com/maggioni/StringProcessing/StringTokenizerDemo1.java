package com.maggioni.StringProcessing;

import java.util.StringTokenizer;

public class StringTokenizerDemo1 {

    public static void main(String[] args) {
        String line = "Harry;8765,Per[fect";
        StringTokenizer st;
        st = new StringTokenizer(line); // default delimiter blank
        printTokens(st); // output Harry;8765,Per[fect
        st = new StringTokenizer(line,";");
        printTokens(st); // output: Harry / 8765,Per[fect
        st = new StringTokenizer(line,";,[]");
        printTokens(st); // output: Harry / 8765 / Per / fect
        
        System.out.println("split is ;");
        String[] split = line.split(";");
        printArrayTokens(split);
        System.out.println("split is \\d");
        split = line.split("\\d");
        printArrayTokens(split);
        System.out.println("split is \\d+");
        split = line.split("\\d+");
        printArrayTokens(split);
    }

    private static void printArrayTokens(String[] split) {
        int i = 0;
        for (String split1 : split) {
            System.out.printf("index : %d token : %s \n",i++,split1);
        }
    }

    private static void printTokens(StringTokenizer st) {
        while (st.hasMoreElements()) {
            Object nextElement = st.nextElement();
            System.out.println(nextElement);
        }
    }

}
