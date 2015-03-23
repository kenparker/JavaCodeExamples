package com.maggioni.PartI.Chapter3.Exercise;

import java.util.Date;

public class BirthDays {

    static int[] year;
    static int[] month = new int[100];

    public static void main(String[] args) {
        
        if (year != null) {                 // without the if there is going to have a runtime error at line 10
            for (int yearentry : year) {    
                System.out.println(yearentry);
            }
        }
        
        int[] localYear;
        if (localYear != null) {    // you will get a runtime error, becuase local arrays are not initialized
            for (int m : localYear) {
                System.out.println(m);
            }
        }
        
        for (int monthentry : month) {      // no problem here becase array has been initialized
            System.out.println(monthentry);
        }
        
        Date date;
        if (date == null) {     // you will get a run-time error, because date is not initialized
            System.out.println("date is null");
        }

    }

}
