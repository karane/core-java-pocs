package org.karane.structural.decorator.reactive;

@FunctionalInterface
interface Subscriber<T> {
    void onNext(T item);
}
