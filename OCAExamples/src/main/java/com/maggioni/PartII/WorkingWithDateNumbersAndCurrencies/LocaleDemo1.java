package com.maggioni.PartII.WorkingWithDateNumbersAndCurrencies;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo1 {

    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance(); 
        System.out.println(" date : " +  c.getTime());
        c.set(1964, 11, 15);
        System.out.println(" date : "+ c.getTime());
        long timeInMillis = c.getTimeInMillis();
        Date d2 = c.getTime();
        System.out.println(" date : " + d2);
        
        Locale locIT = new Locale("it", "IT");
        Locale locPT = new Locale("pt");
        Locale locBR = new Locale("pt", "BR");
        Locale locIN = new Locale("hi", "IN");
        Locale locJA = new Locale("ja");
        
        DateFormat dfUS = DateFormat.getInstance();
        System.out.println(" US  : "+ dfUS.format(d2));
        
        DateFormat dfUSFull = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(" US Full : " +  dfUSFull.format(d2));
        
        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT); 
        System.out.println(" IT : " +  dfIT.format(d2) + " locale : " +  locIT.getCountry() +"/" + locIT.getDisplayCountry() 
                                        + "/"+ locIT.getDisplayCountry(locIN));
        
        DateFormat dfITShort = DateFormat.getDateInstance(DateFormat.SHORT, locIT); 
        System.out.println(" IT Short : " +  dfITShort.format(d2));
        
        DateFormat dfINFull = DateFormat.getDateInstance(DateFormat.FULL, locIN);
        System.out.println(" India Full : " +  dfINFull.format(d2));
        
        
    }

}
