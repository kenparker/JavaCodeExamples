package com.maggioni.Core.Utilities;

import java.util.Enumeration;
import java.util.Properties;

public class ListOfAllSystemProperties {
    
    public static void main(String[] args) {
        getAllSystemProperties();
    }
    
    public static Enumeration<?> getAllSystemProperties() {
        // http://javawiki.sowas.com/doku.php?id=java:system-properties
        Properties properties = System.getProperties();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String name = (String) propertyNames.nextElement();
            System.out.println(name + " :" + System.getProperty(name));
            
        }
        return propertyNames;
    }
}
