package org.karane.structural.decorator.reactive;

abstract class ReactiveStreamDecorator<T> implements ReactiveStream<T> {
    protected final ReactiveStream<T> decoratedStream;

    public ReactiveStreamDecorator(ReactiveStream<T> decoratedStream) {
        this.decoratedStream = decoratedStream;
    }

    @Override
    public void subscribe(Subscriber<T> subscriber) {
        decoratedStream.subscribe(subscriber);
    }
}
