# Date-Time Demo Project

This project demonstrates the usage of both the modern Java Date-Time API (`java.time`) and the legacy Joda-Time (`org.joda.time`). 
It includes examples for parsing, formatting, arithmetic operations, conversions, and working with durations and periods.

## 📌 Requirements
- Java 17+
- Maven

## 🚀 Setup & Run
1. Clone and move to project directory:
 ```sh
   git clone https://github.com/karane/core-java-pocs.git
   cd data-time-poc
   ```
2. Run the examples using:

    **For Java Date-Time API (`java.time`)**
   ```sh
   mvn compile exec:java -Dexec.mainClass="org.karane.JavaTimeDemo"
   ```
    **For Joda-Time (`org.joda.time`)**
    ```sh
    mvn compile exec:java -Dexec.mainClass="org.karane.JodaTimeDemo"
    ```
## Features Overview
### Java Time API (`java.time`)
- ✅ Introduced in Java 8 as a modern, built-in replacement for Joda-Time.
- ✅ Thread-safe and immutable.
- ✅ Recommended for new applications.

🔹 Examples in JavaTimeDemo.java
- Getting Current Date & Time (LocalDate, LocalTime, LocalDateTime, ZonedDateTime)
- Parsing and Formatting (DateTimeFormatter)
- Date Arithmetic (plusDays(), minusMonths(), etc.)
- Duration & Period Handling (Duration, Period)
- Conversions (Instant ↔ LocalDateTime, ZonedDateTime)

### Joda-Time (`org.joda.time`)
  - ✅ Pre-Java 8 library for date and time handling.
  - ✅ Still used in some legacy applications but not recommended for new projects.

🔹 Examples in JodaTimeDemo.java
- Getting Current Date & Time (DateTime)
- Parsing and Formatting (DateTimeFormatter)
- Date Arithmetic (plusDays(), minusMonths(), etc.)
- Duration & Period Handling (Duration, Period)
- Conversions (Instant, LocalDateTime, DateTimeZone)

## 🆚 Java java.time vs Joda-Time

| Feature                    | Java `java.time` ✅      | Joda-Time ❌              |
|----------------------------|-------------------------|---------------------------|
| API Introduced             | Java 8+ (2014)          | Pre-Java 8                |
| Thread-Safety              | ✅ Yes                  | ✅ Mostly                 |
| `LocalDate` & `LocalTime`   | ✅ Yes                  | ✅ Yes (`LocalDateTime`)  |
| `ZonedDateTime`            | ✅ Yes                  | ✅ Yes                    |
| `Instant` Support          | ✅ Yes                  | ✅ Yes                    |
| `Duration` & `Period`      | ✅ Yes                  | ✅ Yes                    |
| Best for New Projects?     | ✅ Yes                  | ❌ No (Legacy)            |
