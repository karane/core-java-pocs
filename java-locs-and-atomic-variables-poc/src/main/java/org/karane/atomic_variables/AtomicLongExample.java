package org.karane.atomic_variables;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongExample {
    private static final AtomicLong value = new AtomicLong(100);

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread-1 New Value: " + value.addAndGet(50)));
        Thread t2 = new Thread(() -> System.out.println("Thread-2 New Value: " + value.incrementAndGet()));

        t1.start();
        t2.start();
    }
}
