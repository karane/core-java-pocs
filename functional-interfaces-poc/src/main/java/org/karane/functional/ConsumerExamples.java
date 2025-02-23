package org.karane.functional;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class ConsumerExamples {

    public static void main(String[] args) {
        System.out.println("\n--- ConsumerExamples --- ");
        // Consumer Example (One argument)
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, Consumer!");

        // BiConsumer Example (Two arguments)
        BiConsumer<String, Integer> printDetails = (name, age) ->
                System.out.println(name + " is " + age + " years old.");
        printDetails.accept("Alice", 30);
    }
}
