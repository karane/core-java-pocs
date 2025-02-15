# Movie Renting Website

This is a simple Java project demonstrating the use of Java Streams, functional programming concepts, and Collectors in a movie renting website system.

## Features
- Filtering and grouping movies by genre
- Counting movies per genre
- Finding the highest-rated movie per genre
- Generating movie rating statistics
- Joining movie titles into a single string
- Functional interfaces like Predicate, Supplier, Consumer, UnaryOperator, and BinaryOperator

## Requirements
- Java 17 or later
- Apache Maven

## Clone and Run
```sh
git clone https://github.com/karane/core-java-pocs.git
cd streams-poc
mvn compile
mvn exec:java -Dexec.mainClass="org.karane.MovieRentalWebsite"
```

## Project Structure
```
streams-poc/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/karane/
│   │   │       └── MovieRentingWebsite.java
│   ├── test/
│── pom.xml
│── README.md
```


