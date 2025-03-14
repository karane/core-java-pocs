package org.karane.structural.decorator.reactive;

public class ReactiveDecoratorDemo {
    public static void main(String[] args) {
        ReactiveStream<Integer> stream = new BasicReactiveStream<>(1, 2, 3, 4, 5);

        // Applying decorators
        ReactiveStream<Integer> decoratedStream = new LoggingReactiveStream(
                new FilteringReactiveStream(stream, n -> (int)n % 2 == 0) // Only even numbers
        );

        // Subscribing a simple subscriber
        decoratedStream.subscribe(n -> System.out.println("Received: " + n));
    }
}
