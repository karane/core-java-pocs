package org.karane.structural.decorator.reactive;

class BasicReactiveStream<T> implements ReactiveStream<T> {
    private final T[] data;

    @SafeVarargs
    public BasicReactiveStream(T... data) {
        this.data = data;
    }

    @Override
    public void subscribe(Subscriber<T> subscriber) {
        for (T item : data) {
            subscriber.onNext(item);
        }
    }
}
