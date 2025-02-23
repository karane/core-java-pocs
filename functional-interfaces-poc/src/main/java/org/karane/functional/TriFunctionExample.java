package org.karane.functional;

public class TriFunctionExample {
    public static void main(String[] args) {
        System.out.println("\n--- TriFunctionExample --- ");

        // TriFunction to concatenate three strings
        TriFunction<String, String, String, String> concatenate = (a, b, c) -> a + " " + b + " " + c;
        System.out.println(concatenate.apply("Hello", "Functional", "Interfaces"));

        // TriFunction to compute the average of three numbers
        TriFunction<Integer, Integer, Integer, Double> average = (a, b, c) -> (a + b + c) / 3.0;
        System.out.println("Average of 10, 20, 30: " + average.apply(10, 20, 30));
    }
}
