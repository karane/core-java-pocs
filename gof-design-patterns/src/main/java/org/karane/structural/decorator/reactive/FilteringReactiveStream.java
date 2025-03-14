package org.karane.structural.decorator.reactive;

import java.util.function.Predicate;

class FilteringReactiveStream<T> extends ReactiveStreamDecorator<T> {
    private final Predicate<T> filter;

    public FilteringReactiveStream(ReactiveStream<T> decoratedStream, Predicate<T> filter) {
        super(decoratedStream);
        this.filter = filter;
    }

    @Override
    public void subscribe(Subscriber<T> subscriber) {
        super.subscribe(item -> {
            if (filter.test(item)) {
                subscriber.onNext(item);
            }
        });
    }
}
