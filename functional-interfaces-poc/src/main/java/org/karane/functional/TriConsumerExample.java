package org.karane.functional;

public class TriConsumerExample {

    public static void main(String[] args) {
        System.out.println("\n--- TriConsumerExample --- ");

        // TriConsumer Example (Three arguments)
        TriConsumer<String, Integer, Double> printUserData = (name, age, balance) -> 
            System.out.println(name + " (Age: " + age + ") has $" + balance + " in balance.");

        printUserData.accept("Bob", 40, 1000.50);
    }
}
