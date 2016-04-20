package com.maggioni.StringProcessing;

import java.util.StringTokenizer;

public class StringProcessingDemo2 {

    public static void main(String[] args) {
        String str = "DoDELIMNotDELIMDoDELIMThis";
        String delim = "DELIM";
        tokDemo(str, delim);
        /*
        o
        Not
        o
        This
        */
        
        str = "Do\nDELIMNotDELIMDoDELIMThis";
        delim = "\n\t\r\f";
        tokDemo(str, delim);
        /*
        Do
        DELIMNotDELIMDoDELIMThis
        */
        
        str = "Do\nDELIM\tNotDELIM\r\rDoDELIMThis\f";
        tokDemo(str, delim);
        /*
        Do
        DELIM
        NotDELIM
        DoDELIMThis
        */
    }

    private static void tokDemo(String str, final String delim) {
        StringTokenizer st = new StringTokenizer(str, delim);
        while (st.hasMoreElements()) {
            Object nextElement = st.nextElement();
            System.out.println(nextElement);
        }
    }

}
