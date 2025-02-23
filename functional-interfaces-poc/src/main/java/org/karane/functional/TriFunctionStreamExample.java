package org.karane.functional;

import java.util.Arrays;
import java.util.List;

public class TriFunctionStreamExample {
    public static void main(String[] args) {
        System.out.println("\n--- TriFunctionStreamExample --- ");

        List<List<Integer>> numberGroups = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        // TriFunction to calculate the sum of three numbers
        TriFunction<Integer, Integer, Integer, Integer> sumFunction = (a, b, c) -> a + b + c;

        // Processing list using streams and TriFunction
        numberGroups.stream()
            .map(list -> sumFunction.apply(list.get(0), list.get(1), list.get(2)))
            .forEach(sum -> System.out.println("Sum: " + sum));
    }
}
