package org.karane.functional;

import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        System.out.println("\n--- BuiltInFunctionalInterfaces --- ");

        // Predicate Example
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        // Function Example
        Function<String, Integer> stringLength = String::length;
        String myName = "Karane Vieira";
        System.out.println(String.format("Length of '%s': %d", myName, stringLength.apply(myName)));

        // Consumer Example
        Consumer<String> printMessage = System.out::println;
        printMessage.accept("Hello from Consumer!");

        // Supplier Example
        Supplier<Double> randomValue = Math::random;
        System.out.println("Random Value: " + randomValue.get());
    }
}
