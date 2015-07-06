package com.maggioni.date.formatDatetoString.example_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 */
public class ParseStringToDate
{

    public void main(String[] args)
    {

    }

    public Date parseDateTime(String date) throws ParseException
    {
        // Parsing date/time in long format back to Date
        DateFormat dateTimeFormatter
                = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        return dateTimeFormatter.parse(date);
    }

    public void parseTimeToDate(String time) throws ParseException
    {
        // Parsing time in short format back to Date
        DateFormat shortTimeFormatter
                = DateFormat.getTimeInstance(DateFormat.SHORT);
        Date date2 = shortTimeFormatter.parse("7:36 PM");
    }

    public void parseDateString(String date) throws ParseException
    {
        DateFormat defaultFormatter = DateFormat.getInstance();
        // Parsing date string in the default format
        Date date1 = defaultFormatter.parse("20.07.14 09:40");
    }

    

}
