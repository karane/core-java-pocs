# Properties API POC

This is a simple Java project that demonstrates how to use the Properties API to create, read, store, and access system properties, along with additional features such as default properties, XML storage, and more.

## Features

- Create and manage custom properties.
- Read system properties like OS and Java version.
- Store and load properties from a `.properties` file.
- Use default properties when the property is not found.
- Enumerate all properties and print them.
- Store properties in XML format.
- Merge properties from another properties object.
- Use `getProperty()` with a default value.

## Project Structure
```
properties-api-poc/ 
    ├── src/ 
    │   └── main/ 
    │       └── java/ 
    │           └── PropertiesExample.java 
    ├── pom.xml 
    └── README.md
```

## Requirements

- Java 17 or higher.
- Maven 3.x or higher.

## Instructions

1. Clone the project.

```bash
git clone https://github.com/karane/core-java-pocs.git
```

2. Navigate to the project directory.
```bash
cd properties-api-poc
```

Build the project using Maven.
```bash
mvn clean install
```

Run the PropertiesExample class.
```bash
mvn exec:java -Dexec.mainClass="PropertiesExample"
```