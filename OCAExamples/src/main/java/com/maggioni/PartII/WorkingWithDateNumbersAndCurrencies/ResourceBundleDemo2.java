package com.maggioni.PartII.WorkingWithDateNumbersAndCurrencies;

import java.util.Locale;
import static java.util.Locale.ENGLISH;
import java.util.ResourceBundle;

public class ResourceBundleDemo2 {

    public static void main(String[] args) {
            new ResourceBundleDemo2().ResouceLoad();
    }

    public void ResouceLoad() {
        

        Locale lo1 = Locale.GERMAN;
        Locale lo2 = new Locale("de");
        
        Locale lo3 = Locale.forLanguageTag("de");
        Locale lo4 = new Locale.Builder().setLanguage("de").build();
        
        Locale lo5 = ENGLISH;
        
        ResourceBundle bundle1 = ResourceBundle.getBundle("Text"); 
        System.out.println("  "+  bundle1.getString("text"));
        
        Locale lo6 = new Locale("it", "IT");
        ResourceBundle bundle2 = ResourceBundle.getBundle("com.maggioni.res.Angelo", lo6); // ListResourceBoundles exist
        System.out.println(" " +  bundle2.getObject("hello"));  // from Angelo_it_IT
        System.out.println(" " +  bundle2.getObject("default"));// from Angelo_it
        System.out.println("locale2 :" + bundle2.getLocale());
        
        Locale lo8 = Locale.CHINA;
        ResourceBundle bundle3 = ResourceBundle.getBundle("com.maggioni.res.Angelo", lo8);
        System.out.println(" " +  bundle3.getObject("hello"));  
        System.out.println(" " +  bundle3.getObject("default"));
        System.out.println("locale3 :" + bundle3.getLocale());
        
        
        Locale lo7 = Locale.getDefault();
        System.out.println(" language :" +  lo7.getLanguage());
        System.out.println(" country  :" +  lo7.getCountry());
        System.out.println(" country name   :" + lo7.getDisplayCountry());
    }

}
