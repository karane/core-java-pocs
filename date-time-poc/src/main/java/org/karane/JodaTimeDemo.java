package org.karane;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTimeZone;

public class JodaTimeDemo {
    public static void main(String[] args) {
        // 1. Current Date and Time
        System.out.println("\n1. Current Date and Time");
        DateTime dateTime = new DateTime();
        System.out.println("\tCurrent Joda DateTime: " + dateTime);

        // 2. Parsing and Formatting
        System.out.println("\n2. Parsing and Formatting");
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        DateTime parsedDateTime = DateTime.parse("15/02/2025", formatter);
        String formattedDateTime = parsedDateTime.toString(formatter);

        System.out.println("\tParsed Joda DateTime: " + parsedDateTime);
        System.out.println("\tFormatted Joda DateTime: " + formattedDateTime);

        // 3. Date Arithmetic
        System.out.println("\n3. Date Arithmetic");
        DateTime futureDateTime = dateTime.plusDays(10)
                                    .plusMonths(2)
                                    .plusYears(1);
        DateTime pastDateTime = dateTime.minusDays(5)
                                    .minusMonths(1)
                                    .minusYears(2);

        System.out.println("\tFuture Joda DateTime: " + futureDateTime);
        System.out.println("\tPast Joda DateTime: " + pastDateTime);

        // 4. Duration and Period
        System.out.println("\n4. Duration and Period");
        Duration duration = Duration.standardHours(5)
                                    .plus(Duration.standardMinutes(30));
        Period period = new Period().withYears(2)
                            .withMonths(3)
                            .withDays(10);

        System.out.println("\tJoda Duration: " + duration);
        System.out.println("\tJoda Period: " + period);

        // 5. Instant and Conversions
        System.out.println("\n5. Instant and Conversions");
        Instant instant = dateTime.toInstant();
        LocalDateTime localDateTime = dateTime.toLocalDateTime();
        DateTime newYorkTime = dateTime.withZone(DateTimeZone.forID("America/New_York"));

        System.out.println("\tJoda Instant: " + instant);
        System.out.println("\tJoda LocalDateTime: " + localDateTime);
        System.out.println("\tJoda DateTime in New York: " + newYorkTime);
    }
}
