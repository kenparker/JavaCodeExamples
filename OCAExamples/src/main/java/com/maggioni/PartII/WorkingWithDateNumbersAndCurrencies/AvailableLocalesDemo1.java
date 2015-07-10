package com.maggioni.PartII.WorkingWithDateNumbersAndCurrencies;

import java.util.Calendar;
import java.util.Locale;

public class AvailableLocalesDemo1 {

    public static void main(String[] args) {
        Locale[] availableLocales = Calendar.getAvailableLocales(); 
        StringBuffer sb = new StringBuffer();
        
        for (Locale availableLocale : availableLocales) {
            sb.append("Language :");
            sb.append(availableLocale.getLanguage());
            sb.append(" Country :");
            sb.append(availableLocale.getCountry());
            sb.append(" ");
            sb.append(availableLocale.getDisplayCountry());
            sb.append("\n");
            
        }
        System.out.println(" available locales : " +  sb.toString());
        
    }

}
