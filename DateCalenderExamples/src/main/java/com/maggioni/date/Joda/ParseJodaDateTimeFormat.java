package com.maggioni.date.Joda;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * 
 */
public class ParseJodaDateTimeFormat {
    

    public static void main(String[] args) {
        
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
        DateTime dateTime = formatter.parseDateTime("20/07/2014 20:42:13");
        
    }
    
}
