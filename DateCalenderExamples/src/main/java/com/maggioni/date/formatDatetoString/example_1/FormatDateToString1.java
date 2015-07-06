package com.maggioni.date.formatDatetoString.example_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * http://geekabyte.blogspot.nl/2014/07/common-date-time-operations-in-java.html#more
 */
public class FormatDateToString1
{

    public static void main(String[] args)
    {

        Date now = new Date();
        new FormatDateToString1().simpleFormat(now);
        new FormatDateToString1().formatShort(now);
        new FormatDateToString1().formatLong(now);
    }

    public String simpleFormat(Date now)
    {

        // get the default DateFormat
        final DateFormat formatter = DateFormat.getInstance();
        final String dateAsString = formatter.format(now);
        // print formatted string
        System.out.println("Formatter date :" + dateAsString);
        return dateAsString;
    }

    public String formatShort(Date now)
    {
        DateFormat shortTimeFormatter = DateFormat.getTimeInstance(DateFormat.SHORT);
        System.out.println("shortTime Formatter :" + shortTimeFormatter.format(now));

        
        return shortTimeFormatter.format(now);
    }
    
    public String formatLong(Date now)
    {
        // Example with DateFormat
        DateFormat dateTimeFormatter
                = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        System.out.println("getDateTimeInstance(DateFormat.LONG, DateFormat.LONG) :" + dateTimeFormatter.format(now));
        return dateTimeFormatter.format(now);
    }
    
    public String parseSimpleFormat()
    {
        // Example with SimpleDateFormat
        SimpleDateFormat format
                = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        String format1 = format.format(new Date());
        System.out.println(format1);
        return format1;
    }
}
