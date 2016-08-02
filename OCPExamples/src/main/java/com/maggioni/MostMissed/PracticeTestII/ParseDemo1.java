package com.maggioni.MostMissed.PracticeTestII;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParseDemo1 {

    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance();
        Date d1;
        try {
            //d1 = df.parse("28/11/94");  // java.text.ParseException: Unparseable date: "28/11/94"
            d1 = df.parse("28.11.94");  // Date : Fri Nov 28 00:00:00 CET 94
            System.out.println("Date : " + d1);
        } catch (ParseException ex) {
            Logger.getLogger(ParseDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Date d2;
        try {
            d2 = df2.parse("28.11.94");     // Fri Nov 28 00:00:00 CET 94
            //d2 = df2.parse("28.11.1994"); // Mon Nov 28 00:00:00 CET 1994
            System.out.println("Date : " +  d2);
        } catch (ParseException ex) {
            Logger.getLogger(ParseDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Locale l = null;
        Locale aDefault = l.getDefault();
        System.out.println(""+aDefault);
        
        Locale aDefault2 = Locale.getDefault();
        System.out.println(""+aDefault2);
    }

}
