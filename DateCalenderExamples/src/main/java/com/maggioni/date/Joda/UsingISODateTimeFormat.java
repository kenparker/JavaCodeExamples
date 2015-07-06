package com.maggioni.date.Joda;

import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * http://geekabyte.blogspot.nl/2014/07/common-date-time-operations-in-java.html
 */
public class UsingISODateTimeFormat
{

    public static void main(String[] args)
    {

        jodaFormat1();

        jodaFormat3();

        jodaFormat2();
        
        jodaFormat4();
    }

    public static void jodaFormat3()
    {
        DateTimeFormatter formatter = ISODateTimeFormat.basicDate();
        System.out.println("Java Date to Joda :" + formatter.print(new Date().getTime()));
    }

    public static void jodaFormat1()
    {
        DateTimeFormatter formatter = ISODateTimeFormat.basicDate();
        System.out.println("Joda formatter :" + formatter.print(DateTime.now()));
        
    }

    public static void jodaFormat2()
    {
        DateTimeFormatter formatter
                = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Joda formatter dd/MM/yyyy HH:mm:ss:" + formatter.print(DateTime.now()));
    }

    public static void jodaFormat4()
    {
        DateTimeFormatter formatter
                = DateTimeFormat.forStyle("LS");
        System.out.println("Joda formatter forStyle LS:" + formatter.print(DateTime.now()));
        
        formatter = DateTimeFormat.forStyle("-L");
        System.out.println("Joda formatter forStyle -L:" + formatter.print(DateTime.now()));
    }
}
