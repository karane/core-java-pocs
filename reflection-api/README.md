# Java Re flection Demo
This project demonstrates various Java Reflection techniques, including basic reflection, method invocation, proxies, and more. You can run all the examples or focus on individual cases.

# Project Structure
```
reflection-api
├── pom.xml                  # Maven build configuration
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── karane
│   │   │           ├── Main.java                 # Main entry point
│   │   │           └── reflection
│   │   │               ├── BasicReflection.java  # Basic reflection examples
│   │   │               ├── ConcreteInvocationHandler.java  # Custom Invocation Handler for Proxies
│   │   │               ├── Greetable.java        # Interface for greeting (used in Proxy)
│   │   │               ├── Person.java           # Person class (with annotations and methods)
│   │   │               ├── ProxyReflection.java  # Reflection examples using dynamic proxies
│   │   │               ├── Singleton.java        # Singleton class with reflection
│   │   │               └── SingletonReflection.java  # Reflection demo with Singleton
│   └── resources          # Resources like configuration files (if any)
```
## Prerequisites
- Java 8+
- Maven

## Running the Project
1. Build the Project
```bash
mvn clean compile
```
2. Run the Project
```bash
mvn exec:java -Dexec.mainClass="org.karane.Main"
```