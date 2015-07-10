package com.maggioni.PartII.WorkingWithDateNumbersAndCurrencies;

import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

public class ResourceBundleDemo1 {

    public static void main(String[] args) {
        
        // http://javawiki.sowas.com/doku.php?id=java:system-properties
        Properties properties = System.getProperties();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String name = (String) propertyNames.nextElement();
            System.out.println(name + " :" + System.getProperty(name));
            
        }
        
        ResourceBundle bundle = ResourceBundle.getBundle("Text"); 
        System.out.println("  "+  bundle.getString("text"));
                
                
                
    }

}
