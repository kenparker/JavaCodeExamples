package com.maggioni.PartII.WorkingWithDateNumbersAndCurrencies;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class LocaleDemo2 {

    public static void main(String[] args) {
        Locale locDefault = Locale.getDefault();
        Locale locIT = new Locale("IT", "DE");
        Locale locAfr = new Locale("af", "DE");
        
        System.out.println(" available locals :" +  Arrays.toString(Calendar.getAvailableLocales()));
                
        
        System.out.println(" defaul locale is : " +  locDefault.getCountry() +  " " + " " + locDefault.getDisplayCountry());
        System.out.println(" local country IT is : " +  locIT.getCountry() + " " + locIT.getDisplayCountry() + " and language "+  locIT.getLanguage() + " "+ locIT.getDisplayLanguage());
        System.out.println(" local country Aar is : " +  locAfr.getCountry() + " " + locAfr.getDisplayCountry() + " and language "+  locAfr.getLanguage() + " "+ locAfr.getDisplayLanguage());
                
    }

}
