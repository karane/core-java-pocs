package org.karane.functional;

/**
 * A functional interface that takes three arguments and returns a result.
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
