package com.maggioni.Parsing;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParseDemo1 {

    public static void main(String[] args) {
        String patter = "";
        System.out.println(""+Locale.getDefault());
        DecimalFormat format = new DecimalFormat(patter);
        System.out.println(""+format.getCurrency());
        System.out.println(""+format.getDecimalFormatSymbols().getDecimalSeparator());
        
        parseInput("1000", format);                     // value 1000 is parsed as 1000,00
                                                        // value 1000 is parsed as 1000,00 
        parseInput("1,000.00", format);                 // value 1,000.00 is parsed as 1,00
                                                        // value 1,000.00 is parsed as 1
        parseInput("1000.33", format);                  // value 1000.33 is parsed as 100033,00
                                                        // value 1000.33 is parsed as 100033
        parseInput("1000,33", format);                  // value 1000,33 is parsed as 1000,33 (mit comma)
                                                        // value 1000,33 is parsed as 1000.33 (mit punkt)
        parseInput("1000,123456789", format);           // value 1000,123456789 is parsed as 1000,12
                                                        // value 1000,123456789 is parsed as 1000.123456789
        parseInput("10bla00,123bla456789", format);     // value 10bla00,123bla456789 is parsed as 10,00
                                                        // value 10bla00,123bla456789 is parsed as 10
        parseInput("one", format);                      // value one cannot be parsed
    }

    public static void parseInput(String aValue, DecimalFormat format) {
        
        
        try {
            double doubleValue = format.parse(aValue).doubleValue();
            Number parse = format.parse(aValue);
            System.out.printf("value %s is parsed as %.2f \n",aValue, doubleValue);
            System.out.printf("value %s is parsed as %s \n",aValue, parse);
        } catch (ParseException ex) {
            System.out.printf("value %s cannot be parsed \n", aValue);
        }
    }
}
