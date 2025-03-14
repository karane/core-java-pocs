package org.karane.structural.decorator.reactive;

interface ReactiveStream<T> {
    void subscribe(Subscriber<T> subscriber);
}
