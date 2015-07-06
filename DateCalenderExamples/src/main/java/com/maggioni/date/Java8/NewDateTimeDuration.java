
package com.maggioni.date.Java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author magang
 */
public class NewDateTimeDuration
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Get Duration between two dates
        final LocalDateTime from = LocalDateTime.of(1964, Month.DECEMBER, 15, 0, 0, 0);
        final LocalDate now = LocalDate.now();
        final LocalDateTime to = LocalDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(),0,0,0);
        final Duration duration = Duration.between(from, to);
        System.out.println(duration.toDays());
        System.out.println(duration.toDays()/365);
        
    }
    
}
