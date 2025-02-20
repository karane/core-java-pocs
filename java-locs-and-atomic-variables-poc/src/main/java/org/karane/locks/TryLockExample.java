package org.karane.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TryLockResource {
    private final Lock lock = new ReentrantLock();

    public void safeMethod() {
        if (lock.tryLock()) { // acquires the lock only if it is free
            try {
                System.out.println(Thread.currentThread().getName() + " got the lock.");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released the lock.");
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock.");
        }
    }
}

public class TryLockExample {
    public static void main(String[] args) {
        TryLockResource resource = new TryLockResource();

        Thread t1 = new Thread(resource::safeMethod, "Thread-1");
        Thread t2 = new Thread(resource::safeMethod, "Thread-2");

        t1.start();
        t2.start();
    }
}
