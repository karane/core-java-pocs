package org.karane.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedData {
    private int data = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(int value) {
        lock.writeLock().lock();
        try {
            data = value;
            System.out.println(Thread.currentThread().getName() + " wrote: " + value);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void read() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " read: " + data);
        } finally {
            lock.readLock().unlock();
        }
    }
}

public class ReadWriteLockExample {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread writer = new Thread(() -> sharedData.write(100), "Writer");
        Thread reader1 = new Thread(sharedData::read, "Reader-1");
        Thread reader2 = new Thread(sharedData::read, "Reader-2");

        writer.start();
        reader1.start();
        reader2.start();
    }
}
