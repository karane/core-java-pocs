package org.karane;

import org.karane.reflection.SingletonReflection;
import org.karane.reflection.BasicReflection;
import org.karane.reflection.ProxyReflection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Reflection Demo Running...\n");

        System.out.println("--- Basic Reflection ---");
        BasicReflection.run();

        System.out.println("\n--- Advanced Reflection ---");
        SingletonReflection.run();

        System.out.println("\n--- Proxy Reflection ---");
        ProxyReflection.run();
    }
}
