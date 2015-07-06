
package com.maggioni.date.Java8;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * http://www.dzone.com/links/r/java_8_features_the_ultimate_guide_2.html
 */
public class NewDateTimeAPIExamples
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Get the System clock as UTC offset
        final Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        
        // Get localdate und localtime
        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now(clock);
        System.out.println(date);
        System.out.println(dateFromClock);
        
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now(clock);
        System.out.println(time);
        System.out.println(timeFromClock);
        
        // Get LocalDate/Time
        final LocalDateTime datetime = LocalDateTime.now();
        final LocalDateTime datetimeFromClock = LocalDateTime.now(clock);
        System.out.println(datetime);
        System.out.println(datetimeFromClock);
        
        // Get the Zoned Date/Time
        final ZonedDateTime zonedDateTime = ZonedDateTime.now();
        final ZonedDateTime zonedDateTimeFromClock = ZonedDateTime.now(clock);
        final ZonedDateTime zoneDateTimeFromZoneID = ZonedDateTime.now(ZoneId.of("Africa/Harare"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTimeFromClock);
        System.out.println(zoneDateTimeFromZoneID);
        
    }
    
}
