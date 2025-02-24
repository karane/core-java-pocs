package org.karane;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaTimeDemo {
    public static void main(String[] args) {
        // 1. Current Date and Time
        System.out.println("\n1. Current Date and Time");
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("\tCurrent Date: " + today);
        System.out.println("\tCurrent Time: " + now);
        System.out.println("\tCurrent Date and Time: " + dateTime);
        System.out.println("\tCurrent ZonedDateTime: " + zonedDateTime);

        // 2. Parsing and Formatting
        System.out.println("\n2. Parsing and Formatting");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse("15/02/2025", formatter);
        String formattedDate = parsedDate.format(formatter);

        System.out.println("\tParsed Date: " + parsedDate);
        System.out.println("\tFormatted Date: " + formattedDate);

        // 3. Date Arithmetic
        System.out.println("\n3. Date Arithmetic");
        LocalDate futureDate = today.plusDays(10)
                                    .plusMonths(2)
                                    .plusYears(1);
        LocalDate pastDate = today.minusDays(5)
                                .minusMonths(1)
                                .minusYears(2);

        System.out.println("\tFuture Date: " + futureDate);
        System.out.println("\tPast Date: " + pastDate);

        // 4. Duration and Period
        System.out.println("\n4. Duration and Period");

        Duration duration = Duration.ofHours(5)
                                .plusMinutes(30);
        Period period = Period.of(2, 3, 10);

        System.out.println("\tDuration: " + duration);
        System.out.println("\tPeriod: " + period);

        // 5. Instant and Conversions
        System.out.println("\n5. Instant and Conversions");
        Instant instant = Instant.now();
        LocalDateTime dateTimeFromInstant = LocalDateTime.ofInstant(instant, ZoneId.of("UTC"));
        ZonedDateTime newYorkTime = dateTimeFromInstant.atZone(ZoneId.of("America/New_York"));

        System.out.println("\tInstant: " + instant);
        System.out.println("\tLocalDateTime from Instant: " + dateTimeFromInstant);
        System.out.println("\tNew York Time: " + newYorkTime);
    }
}
