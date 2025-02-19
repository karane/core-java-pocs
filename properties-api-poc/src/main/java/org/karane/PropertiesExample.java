package org.karane;

import java.io.*;
import java.util.*;

public class PropertiesExample {

    public static void main(String[] args) {
        // Creating properties with default properties
        Properties defaultProperties = new Properties();
        defaultProperties.setProperty("server", "localhost");

        Properties properties = new Properties(defaultProperties);
        properties.setProperty("username", "admin");
        properties.setProperty("password", "admin123");
        properties.setProperty("database", "mydb");

        // Read system properties
        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");

        System.out.println("System Properties:");
        System.out.println("OS: " + osName);
        System.out.println("Java Version: " + javaVersion);

        // Store properties to a file with a comment
        try (FileOutputStream out = new FileOutputStream("config.properties")) {
            properties.store(out, "Database Configurations");
            System.out.println("Properties stored to config.properties with comment.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load properties from a file
        Properties loadedProperties = new Properties();
        try (FileInputStream in = new FileInputStream("config.properties")) {
            loadedProperties.load(in);
            System.out.println("\nLoaded Properties:");
            System.out.println("Username: " + loadedProperties.getProperty("username"));
            System.out.println("Password: " + loadedProperties.getProperty("password"));
            System.out.println("Database: " + loadedProperties.getProperty("database"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Default properties usage
        String server = properties.getProperty("server");
        System.out.println("\nDefault Property 'server': " + server); // Should print 'localhost'

        // Enumerating all properties using propertyNames()
        System.out.println("\nAll Properties:");
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String key = (String) propertyNames.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }

        // Using getProperty with a default value
        String username = properties.getProperty("username", "defaultUser");
        System.out.println("\nUsername (with default if missing): " + username);

        // Storing properties as XML
        try (FileOutputStream out = new FileOutputStream("config.xml")) {
            properties.storeToXML(out, "Database Configurations in XML format");
            System.out.println("Properties stored in XML format to config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Merging properties from another Properties object
        Properties additionalProperties = new Properties();
        additionalProperties.setProperty("apiKey", "123456");
        properties.putAll(additionalProperties);
        System.out.println("\nProperties after merging additional properties:");
        System.out.println("API Key: " + properties.getProperty("apiKey"));
    }
}
