package org.karane.structural.decorator.reactive;

class LoggingReactiveStream<T> extends ReactiveStreamDecorator<T> {
    public LoggingReactiveStream(ReactiveStream<T> decoratedStream) {
        super(decoratedStream);
    }

    @Override
    public void subscribe(Subscriber<T> subscriber) {
        super.subscribe(item -> {
            System.out.println("[LOG] Emitting: " + item);
            subscriber.onNext(item);
        });
    }
}
