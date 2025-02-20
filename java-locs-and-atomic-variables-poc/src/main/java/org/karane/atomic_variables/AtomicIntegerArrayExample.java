package org.karane.atomic_variables;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayExample {
    private static final AtomicIntegerArray atomicArray = new AtomicIntegerArray(5);

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> atomicArray.incrementAndGet(0));
        Thread t2 = new Thread(() -> atomicArray.incrementAndGet(1));

        t1.start();
        t2.start();

        System.out.println("Updated Array: " + atomicArray);
    }
}
