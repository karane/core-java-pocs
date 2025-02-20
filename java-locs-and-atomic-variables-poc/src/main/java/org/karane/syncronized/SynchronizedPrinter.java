package org.karane.syncronized;

class Printer {
    public static synchronized void print(String document) {
        System.out.println(Thread.currentThread().getName() + " is printing: " + document);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished printing.");
    }
}

public class SynchronizedPrinter {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> Printer.print("Document 1"), "Thread-1");
        Thread t2 = new Thread(() -> Printer.print("Document 2"), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
