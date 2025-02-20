package org.karane.atomic_variables;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample {
    private static final AtomicBoolean flag = new AtomicBoolean(false);

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            if (flag.compareAndSet(false, true)) {
                System.out.println(Thread.currentThread().getName() + " changed flag to true.");
            } else {
                System.out.println(Thread.currentThread().getName() + " couldn't change flag.");
            }
        });

        Thread t2 = new Thread(() -> {
            if (flag.compareAndSet(false, true)) {
                System.out.println(Thread.currentThread().getName() + " changed flag to true.");
            } else {
                System.out.println(Thread.currentThread().getName() + " couldn't change flag.");
            }
        });

        t1.start();
        t2.start();
    }
}
