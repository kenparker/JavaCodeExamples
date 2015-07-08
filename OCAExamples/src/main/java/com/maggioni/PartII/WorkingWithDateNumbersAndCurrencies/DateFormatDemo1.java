package com.maggioni.PartII.WorkingWithDateNumbersAndCurrencies;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateFormatDemo1 {

    public static void main(String[] args) {

        Date d1 = new Date(1_000_000_000_000L);
        DateFormat[] dfa = new DateFormat[6];
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
        
        for (DateFormat df : dfa) {
            System.out.println(df.format(d1));
        }
        
        String s = dfa[5].format(d1);
        System.out.println("date = " + s);
        try {
            Date parse = dfa[0].parse(s);
            System.out.println("parse = " +  parse);
        } catch (ParseException ex) {
            Logger.getLogger(DateFormatDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
