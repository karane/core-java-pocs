package org.karane.functional;

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        System.out.println("\n--- CustomFunctionalInterface --- ");

        // Lambda Expression Implementation
        MyOperation add = (a, b) -> a + b;
        MyOperation multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5, 3));
        System.out.println("Multiplication: " + multiply.operate(5, 3));
    }
}
