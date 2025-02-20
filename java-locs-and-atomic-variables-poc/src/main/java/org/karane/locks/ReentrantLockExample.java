package org.karane.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private int value = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            value++;
            System.out.println(Thread.currentThread().getName() + " incremented value to: " + value);
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::increment, "Thread-1");
        Thread t2 = new Thread(resource::increment, "Thread-2");

        t1.start();
        t2.start();
    }
}
