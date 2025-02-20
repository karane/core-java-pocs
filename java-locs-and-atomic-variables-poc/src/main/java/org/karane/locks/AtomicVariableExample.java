package org.karane.locks;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    private final AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        int newValue = count.incrementAndGet();
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + newValue);
    }
}

public class AtomicVariableExample {
    public static void main(String[] args) {
        AtomicCounter counter = new AtomicCounter();

        Thread t1 = new Thread(counter::increment, "Thread-1");
        Thread t2 = new Thread(counter::increment, "Thread-2");

        t1.start();
        t2.start();
    }
}
