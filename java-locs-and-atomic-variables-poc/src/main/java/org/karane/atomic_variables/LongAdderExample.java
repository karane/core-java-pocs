package org.karane.atomic_variables;

import java.util.concurrent.atomic.LongAdder;

public class LongAdderExample {
    private static final LongAdder adder = new LongAdder();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) adder.increment();
        });

        Thread t2 = new Thread(() -> adder.add(10));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + adder.sum());
    }
}
