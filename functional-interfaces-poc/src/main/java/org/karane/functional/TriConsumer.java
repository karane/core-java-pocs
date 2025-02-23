package org.karane.functional;

/**
 * A functional interface that takes three arguments and performs an operation.
 */
@FunctionalInterface
public interface TriConsumer<T, U, V> {
    void accept(T t, U u, V v);
}
