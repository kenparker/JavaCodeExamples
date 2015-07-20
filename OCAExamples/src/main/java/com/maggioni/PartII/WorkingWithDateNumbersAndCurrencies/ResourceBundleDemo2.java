package com.maggioni.PartII.WorkingWithDateNumbersAndCurrencies;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import static java.util.Locale.ENGLISH;
import java.util.ResourceBundle;
import java.util.Set;

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

        ResourceBundle bundle1 = ResourceBundle.getBundle("com.maggioni.res.Text");
        System.out.println("  " + bundle1.getString("text"));

        Locale lo6 = new Locale("it", "IT");
        ResourceBundle bundle2 = ResourceBundle.getBundle("com.maggioni.res.Angelo", lo6); // ListResourceBoundles exist
        System.out.println(" " + bundle2.getObject("hello"));  // from Angelo_it_IT
        System.out.println(" " + bundle2.getObject("default"));// from Angelo_it
        System.out.println("locale2 :" + bundle2.getLocale());
        System.out.println(" getBasedBundlename :" + bundle2.getBaseBundleName());

        Locale lo8 = Locale.CHINA;
        ResourceBundle bundle3 = ResourceBundle.getBundle("com.maggioni.res.Angelo", lo8);
        System.out.println(" getObject :" + bundle3.getObject("hello"));
        System.out.println(" getString :" + bundle3.getString("hello"));
        System.out.println(" getBasedBundlename :" + bundle3.getBaseBundleName());
        final Enumeration<String> keys = bundle3.getKeys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            System.out.println(" enum keys :" + nextElement);
        }
        System.out.println(" example keySet() :");
        Set<String> keySet = bundle3.keySet();
        keySet.forEach(s -> System.out.println(s));
        
        /*final String[] stringArray = bundle3.getStringArray("hello");
        Arrays.stream(stringArray)
        .forEach(s -> System.out.println(s));
        */

        System.out.println(" " + bundle3.getObject("default"));
        System.out.println("locale3 :" + bundle3.getLocale());

        Locale lo7 = Locale.getDefault();
        System.out.println(" language :" + lo7.getLanguage());
        System.out.println(" country  :" + lo7.getCountry());
        System.out.println(" country name   :" + lo7.getDisplayCountry());
    }

}
