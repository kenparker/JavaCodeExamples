package com.maggioni.PartII.WorkingWithDateNumbersAndCurrencies;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalenderDemo1 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,###,###,###,###.##");
        
        Date date1 = new Date(); // get Current date and Time
        System.out.println(" current date is : " +  date1);
        System.out.println(" current date long : " +  df.format(date1.getTime()));
        
        Date date2 = new Date(1_000_000_000_000L); // Internally the Date/Time is a long variable
        System.out.println(" 1 trillion : " +  date2);       
        date2.setTime(date2.getTime() + 3_600_000); // add 1 hour
       
        System.out.println(" new date : " +  date2);
        System.out.println(" new date toString() : " +  date2.toString());       
        
        Calendar cal = Calendar.getInstance(); // get Date/Time for calculations
        System.out.println(" current date is :" +  cal);
        cal.setTime(date2);
        System.out.println(" current date is :" +  cal);
        Date date3 = cal.getTime();
        System.out.println(" current date is :" +  date3);
        long timeInMillis = cal.getTimeInMillis();
        System.out.println(" current date is :" +  df.format(timeInMillis));
        
        
        
    }

}
