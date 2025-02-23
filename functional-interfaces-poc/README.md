# Java Functional Interfaces POC

## Overview
This project demonstrates Java's built-in functional interfaces (`Consumer`, `BiConsumer`, `Supplier`) and custom functional interface (`TriConsumer`).

## Features
- **Consumer** (Single argument, performs an action)
- **BiConsumer** (Two arguments, performs an action)
- **TriConsumer** (Custom interface for three arguments)
- **Supplier** (No arguments, returns a value)

## Project Structure
```
functional-interfaces-poc/
│── pom.xml
│── README.md
└── src/main/java/com/example/
│   ├── functional/
│   │   ├── FunctionalInterfacesDemo.java
│   │   ├── BuiltInFunctionalInterfaces.java
│   │   ├── CustomFunctionalInterface.java
│   │   ├── ConsumerExamples.java
│   │   ├── TriConsumer.java
│   │   ├── TriConsumerExample.java
```

## Setup & Installation
### Prerequisites
- Install Java 17+
- Install Maven

## Cloning the Repository

To get started, clone the repository using the following command:
```sh
git clone https://github.com/karane/core-java-pocs.git
cd functional-interfaces-poc
```

## Running the Project
Ensure you have **Maven** installed. Run the following commands:

### Compile
```sh
mvn clean compile
```

### Run
```sh
mvn exec:java -Dexec.mainClass=org.karane.Main
```

