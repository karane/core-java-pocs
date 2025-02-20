package org.karane;

import org.karane.atomic_variables.*;
import org.karane.locks.ReadWriteLockExample;
import org.karane.locks.ReentrantLockExample;
import org.karane.locks.TryLockExample;
import org.karane.syncronized.AvoidDeadlockDemo;
import org.karane.syncronized.SynchronizedBankAccount;
import org.karane.syncronized.SynchronizedPrinter;
import org.karane.syncronized.SynchronizedTicketBooking;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n--- Synchronized Bank Account ---");
        SynchronizedBankAccount.main(args);

        System.out.println("\n--- Synchronized Ticket Booking ---");
        SynchronizedTicketBooking.main(args);

        System.out.println("\n--- Synchronized Printer Queue ---");
        SynchronizedPrinter.main(args);

        System.out.println("\n--- Avoiding Deadlocks ---");
        AvoidDeadlockDemo.main(args);

        System.out.println("\n--- ReentrantLock Example ---");
        ReentrantLockExample.main(args);

        System.out.println("\n--- TryLock Example ---");
        TryLockExample.main(args);

        System.out.println("\n--- ReadWriteLock Example ---");
        ReadWriteLockExample.main(args);

        System.out.println("\n--- AtomicInteger Example ---");
        AtomicIntegerExample.main(args);

        System.out.println("\n--- AtomicLong Example ---");
        AtomicLongExample.main(args);

        System.out.println("\n--- AtomicBoolean Example ---");
        AtomicBooleanExample.main(args);

        System.out.println("\n--- AtomicReference Example ---");
        AtomicReferenceExample.main(args);

        System.out.println("\n--- AtomicIntegerArray Example ---");
        AtomicIntegerArrayExample.main(args);

        System.out.println("\n--- LongAdder Example ---");
        LongAdderExample.main(args);

        System.out.println("\n--- LongAccumulator Example ---");
        LongAccumulatorExample.main(args);
    }
}
