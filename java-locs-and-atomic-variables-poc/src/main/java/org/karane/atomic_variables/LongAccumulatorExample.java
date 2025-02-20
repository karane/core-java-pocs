package org.karane.atomic_variables;

import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;

public class LongAccumulatorExample {
    private static final LongBinaryOperator operator = Long::sum;
    private static final LongAccumulator accumulator = new LongAccumulator(operator, 0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> accumulator.accumulate(10));
        Thread t2 = new Thread(() -> accumulator.accumulate(20));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Accumulated Value: " + accumulator.get());
    }
}
