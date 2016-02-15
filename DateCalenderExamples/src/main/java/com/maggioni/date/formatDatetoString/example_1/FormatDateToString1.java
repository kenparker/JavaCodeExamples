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
        new FormatDateToString1().parseSimpleFormat();
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
    
    public void parseSimpleFormat()
    {
        // Example with SimpleDateFormat
        final Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        System.out.println(format1.format(date));
        SimpleDateFormat format2 = new SimpleDateFormat("zzzz");
        System.out.println("new SimpleDateFormat(\"zzzz\") "+format2.format(date));
        SimpleDateFormat format3 = new SimpleDateFormat("ZZZZ");
        System.out.println("new SimpleDateFormat(\"ZZZZ\") "+format3.format(date));
        SimpleDateFormat format4 = new SimpleDateFormat("EEEE");
        System.out.println("new SimpleDateFormat(\"EEEE\") "+format4.format(date)); // Full form
        SimpleDateFormat format5 = new SimpleDateFormat("E");                       // abbreviation
        System.out.println("new SimpleDateFormat(\"E\") "+format5.format(date));
    }
}
