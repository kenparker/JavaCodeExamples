package com.maggioni.date.Java8;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author magang
 */
public class FormatExample
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Java 8
        LocalDateTime dateTime = LocalDateTime.now();
        //using pattern
        System.out.println("DateTime.format(ofPattern) :" + dateTime.format(
                DateTimeFormatter.ofPattern("d**MMM**uuuu")));
        System.out.println("DateTime.format(DateTimeFormatter.ISO_DATE) :" + dateTime.format(
                DateTimeFormatter.ISO_DATE));
        System.out.println(
                "DateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) :" + dateTime.format(
                        DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println(
                "DateTime.format(DateTimeFormatter.ISO_LOCAL_DATE) :" + dateTime.format(
                        DateTimeFormatter.ISO_LOCAL_DATE));

        String str2 = "2014-07-25";
        DateTimeFormatter ISO_DATE = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime3 = LocalDateTime.parse(str2, ISO_DATE); // this break I do not know why
        System.out.println(" parse example 3: " + dateTime3);
        //LocalDateTime dateTime1 = LocalDateTime.parse("2014-07-25", DateTimeFormatter.ISO_DATE);
        //LocalDateTime dateTime1 = LocalDateTime.parse("20**Jul**2014", DateTimeFormatter.ofPattern("d**MMM**uuuu"));
        String str = "1986-04-08 12:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime1 = LocalDateTime.parse(str, formatter);
        System.out.println(" parse example : " + dateTime1);

        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime2 = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
        String formattedDateTime = dateTime2.format(formatter); // "1986-04-08 12:30"  
        System.out.println(" parse example 2 : " + formattedDateTime);
    }

}
